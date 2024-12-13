package Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReader {

//Read data from Excel file
    static FileInputStream file = null;

    public static FileInputStream getFileInputStream() throws FileNotFoundException {
        String filePath = new File("src/main/java/Data/browsersdata.xlsx").getPath();
        file =new FileInputStream(filePath);
        return file;
    }
//Get data from Excel file
    public Object [] [] getExcelData() throws IOException {
        file = getFileInputStream();
        XSSFWorkbook  wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheetAt(0);
        int numberOfRows = 3;
        int numberOfColumns = 1;
       String [] [] arrayExcelData  = new String[numberOfRows][numberOfColumns];

//For loops to read data from fixed column and the rows
        for (int i = 0; i < numberOfRows; i++) {
            XSSFRow row = sheet.getRow(i);

            for (int j = 0; j < numberOfColumns; j++) {
                    XSSFCell cell = row.getCell(j);

                    arrayExcelData[i][j] = cell.toString() ;
                }
            }

        wb.close(); //close the workbook
        return arrayExcelData; //Return the data
    }
}
