package utils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ExcelUtils {

    static DataFormatter dataFormatter = new DataFormatter();
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public ExcelUtils(String excelPath, String sheetName) throws IOException {
        workbook = new XSSFWorkbook(excelPath);
        sheet = workbook.getSheet(sheetName);
    }


    public static void getRowCount() throws IOException {
        int rowCount = sheet.getPhysicalNumberOfRows();
        System.out.println("RowCount:-" + rowCount);
    }

    public static void getCellData() throws IOException {
        Object cellValue = dataFormatter.formatCellValue(sheet.getRow(1).getCell(0));
        System.out.println("cellValue:-" + cellValue);
    }
}
