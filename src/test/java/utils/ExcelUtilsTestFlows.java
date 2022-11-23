package utils;

import java.io.IOException;

public class ExcelUtilsTestFlows {

    private static String userDir = System.getProperty("user.dir");
    public static String excelPath = userDir + "/rest-assured-framework/data/TestData.xlsx";
    public static String sheetName = "Sheet1";

    public static void main(String[] args) throws IOException {
        ExcelUtils excelUtils = new ExcelUtils(excelPath, sheetName);
    }
}
