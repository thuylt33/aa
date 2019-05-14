package QuanLyPhongKham.Common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class Datapool{
		//	static XSSFRow row;
		static Row row;
		//	private static XSSFWorkbook workbook;
		private static Workbook workbook;

		private  Workbook getWorkbook(FileInputStream inputStream, String excelFilePath)
				throws IOException {
			Workbook workbook = null;

			if (excelFilePath.endsWith("xlsx")) {
				workbook = new XSSFWorkbook(inputStream);
			} else if (excelFilePath.endsWith("xls")) {
				workbook = new HSSFWorkbook(inputStream);
			} else {
				throw new IllegalArgumentException("The specified file is not Excel file");
			}

			return workbook;
		}

		/** Doc file excel tra ve ArrayList gom cac HashMap <String header, String rowvalue>
		 */
		public static ArrayList readDatapool(String filePath, String sheet) throws Exception {
			FileInputStream fis = new FileInputStream(new File(filePath));

			Datapool dp = new Datapool();
			workbook = dp.getWorkbook(fis, filePath);
			Sheet spreadsheet =  workbook.getSheet(sheet);
			Iterator<Row> rowIterator = spreadsheet.iterator();
			LinkedHashMap <String, String> valueColumn;

			// Lay thong tin header cua file excel
			ArrayList header = new ArrayList();
			Row header_row = spreadsheet.getRow(0);
			ArrayList lstValueCell = new ArrayList<>();
			String valueCell = null;
			for (int i = 0; i < header_row.getLastCellNum(); i++) {
				Cell header_cell = header_row.getCell(i);
				header.add(header_cell.getStringCellValue().toString());
			}
			row =  rowIterator.next();
			while (rowIterator.hasNext()) {
				valueColumn = new LinkedHashMap <>();
				row =  rowIterator.next();
				if(row!=null){
					// gan gia tri tung cell vao HashMap
					for (int i = 0; i < row.getLastCellNum(); i++) {
						Cell cell = row.getCell(i);
						if(cell!=null){
							switch (cell.getCellType()) {
							case Cell.CELL_TYPE_BLANK:
								valueCell = "";
								break;
							case Cell.CELL_TYPE_STRING:
								valueCell = cell.getStringCellValue();
								break;
							case Cell.CELL_TYPE_FORMULA:
								//								valueCell = cell.getStringCellValue(); 
								valueCell = ((XSSFCell)cell).getRawValue()+"";
								//								 valueCell = cell.getRawValue()+"";
								break;
							case Cell.CELL_TYPE_BOOLEAN:
								valueCell = String.valueOf(cell.getBooleanCellValue());
								break;
							case Cell.CELL_TYPE_NUMERIC:
								String input =  cell.getNumericCellValue() + "";
								String phanNguyen = input.split("\\.")[0];
								String result = "";
								if (Double.parseDouble(input) - Integer.parseInt(phanNguyen) == 0)
									valueCell =  phanNguyen;
								else
									valueCell = input;
								break;
							}
						}else{
							valueCell=null;
						}
						if(header.size()>i) // Loại bỿ trưỿng hợp ko có header cột nhưng có dữ liệu trong cell
							valueColumn.put((String) header.get(i), valueCell);

					}
				}
				lstValueCell.add(valueColumn);
			}

			fis.close();
			return lstValueCell;
		}

		public static void main (String a[]) throws Exception{


		}
		/**
		 * Ghi file theo du lieu truyen & header chon
		 * @param fileName
		 * @param sheet
		 * @param HMResult: Du lieu ghi vao
		 * @param row: Dong ghi vao
		 * @param keyName: list cac cot muon ghi thong tin 
		 * @throws IOException
		 */
		public static void writeResultToFileSheet(String fileName, String sheet,
				LinkedHashMap HMResult, int row,List<String> keyName) throws IOException {
			FileInputStream fis;
			try {
				fis = new FileInputStream(new File(fileName));
				XSSFWorkbook workbook = new XSSFWorkbook(fis);
				XSSFSheet spreadsheet = workbook.getSheet(sheet);
				Iterator<Row> rowIterator = spreadsheet.iterator();

				// Lay thong tin header cua file excel
				XSSFRow header_row = spreadsheet.getRow(0);
				XSSFRow rowInsert = (XSSFRow) spreadsheet.getRow(row);
				// Assuming 4 columns
				for (int i = 0; i < header_row.getLastCellNum(); i++) {
					XSSFCell header_cell = header_row.getCell(i);
					String header = header_cell.getStringCellValue().toString();

					for(int j=0;j<keyName.size();j++){
						if (header.equalsIgnoreCase(keyName.get(j))) {
							// kq mong muốn tô màu xanh
							Cell cell = rowInsert.createCell(i);
							String value = (String) HMResult.get(header);
							XSSFCellStyle style = (XSSFCellStyle) workbook
									.createCellStyle();
							XSSFFont font = (XSSFFont) workbook.createFont();
							style.setFillBackgroundColor(HSSFColor.GREY_25_PERCENT.index);
							font.setColor(HSSFColor.GREEN.index);
							if(value.equals("Fail")||value.equalsIgnoreCase("F")){
								font.setColor(HSSFColor.RED.index);
							}

							style.setFont(font);
							cell.setCellStyle(style);
							cell.setCellValue(value);
						}
					}

				}
				FileOutputStream fos = new FileOutputStream(fileName);
				workbook.write(fos);
				fos.close();
				System.out.println(fileName + "is written successfully");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		/**
		 * Lấy danh sách dữ liệu theo cột, côt 1: Key, Cột 2: value
		 */
		public static LinkedHashMap<String, String> getListKeyValue(String filePath, String sheet) throws Exception {
			FileInputStream fis = new FileInputStream(new File(filePath));

			Datapool dp = new Datapool();
			workbook = dp.getWorkbook(fis, filePath);
			Sheet spreadsheet =  workbook.getSheet(sheet);
			Iterator<Row> rowIterator = spreadsheet.iterator();
			LinkedHashMap<String, String> valueColumn= new LinkedHashMap<>();
			String name=null;
			String value=null;
			String valueCell = null;

			row =rowIterator.next();
			while (rowIterator.hasNext()) {
				row = rowIterator.next();
				if(row!=null){
					// gan gia tri tung cell vao HashMap

					for (int i = 0; i < row.getLastCellNum(); i++) {
						Cell cell = row.getCell(i);
						if(cell!=null){
							switch (cell.getCellType()) {
							case Cell.CELL_TYPE_BLANK:
								valueCell = "";
								break;
							case Cell.CELL_TYPE_STRING:
								valueCell = cell.getStringCellValue();
								break;
							case Cell.CELL_TYPE_FORMULA:
								//								valueCell = cell.getStringCellValue(); 
								valueCell = ((XSSFCell)cell).getRawValue()+"";
								//								 valueCell = cell.getRawValue()+"";
								break;
							case Cell.CELL_TYPE_BOOLEAN:
								valueCell = String.valueOf(cell.getBooleanCellValue());
								break;
							case Cell.CELL_TYPE_NUMERIC:
								String input =  cell.getNumericCellValue() + "";
								String phanNguyen = input.split("\\.")[0];
								String result = "";
								if (Double.parseDouble(input) - Integer.parseInt(phanNguyen) == 0)
									valueCell =  phanNguyen;
								else
									valueCell = input;
								break;
							}
						}else{
							valueCell=null;
						}
						if(i==0)name = valueCell;
						if(i==1)value=valueCell;			

					}
					valueColumn.put(name, value);
				}			
			}

			fis.close();
			return valueColumn;
		}
	}


