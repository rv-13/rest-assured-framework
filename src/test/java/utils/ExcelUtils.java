package utils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ExcelUtils {

    public static DataFormatter dataFormatter = new DataFormatter();
    public static XSSFWorkbook workbook;
    public static XSSFSheet sheet;

    public ExcelUtils(String excelPath, String sheetName) throws IOException {
        workbook = new XSSFWorkbook(excelPath);
        sheet = workbook.getSheet(sheetName);
    }


    public void getRowCount() throws IOException {
        int rowCount = sheet.getPhysicalNumberOfRows();
        System.out.println("RowCount:-" + rowCount);
    }

    public void getCellData(int rowNumber, int cellNumber) throws IOException {
        Object cellValue = dataFormatter.formatCellValue(sheet.getRow(rowNumber).getCell(cellNumber));
        System.out.println("cellValue:-" + cellValue);
    }
}
