package utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelReader {
	public static XSSFWorkbook workbook;

	public ExcelReader(String path) {
		File f = new File(path);
		try {
			FileInputStream fis = new FileInputStream(f);
			workbook = new XSSFWorkbook(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	//get last row number
	public int getRowCount(int sheetindex) {
		return workbook.getSheetAt(sheetindex).getLastRowNum() + 1;
	}

	//get last column
	public int getColumnCount(int sheetindex) {
		return workbook.getSheetAt(sheetindex).getRow(0).getLastCellNum();
	}

	//read cell
	public Object getSpecificCellValue(int sheetindex, int row, int cells) {
		XSSFCell cell = workbook.getSheetAt(sheetindex).getRow(row).getCell(cells);

		if (cell == null) {
			return "";
		}

		if (cell != null) {
			if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
				return cell.getStringCellValue();
			} else if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
				return cell.getRawValue();
			} else if (cell.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
				return cell.getBooleanCellValue();
			} else if (cell.getCellType() == XSSFCell.CELL_TYPE_FORMULA) {
				return cell.getCellFormula();
			}
		}
		return null;
	}

	//get two dimenssional data 
	public Object[][] getTestData(int sheetindex) {
		int rows = getRowCount(sheetindex);
		int cells = getColumnCount(sheetindex);

		Object[][] data = new Object[rows][cells];

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cells; j++) {

				data[i][j] = getSpecificCellValue(sheetindex, i, j);
			}
		}

		return data;
	}

}
