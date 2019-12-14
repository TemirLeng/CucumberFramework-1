package Runner;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelTest {

    public static void main(String[] args) {


        File file = new File("src/test/resources/data/TestData.xlsx");
        try{
            FileInputStream input = new FileInputStream(file);
            XSSFWorkbook workBook = new XSSFWorkbook(input);
            XSSFSheet excelSheet = workBook.getSheet("Sheet1");
            String value = excelSheet.getRow(0).getCell(0).toString();
            System.out.println(value);
            System.out.println(excelSheet.getRow(2).getCell(3));
            XSSFRow row = excelSheet.getRow(1);
            XSSFCell cell=row.getCell(2);
            System.out.println(cell);
            XSSFRow row2 = excelSheet.getRow(4);
            XSSFCell cell2 = row.createCell(3);
            cell2.setCellType(CellType.STRING);
            cell.setCellValue("Miami");
            FileOutputStream fileOutput = new FileOutputStream("/Users/mac/Documents/GitHub/CucumberFramework/src/test/resources/data/TestData.xlsx");
            workBook.write(fileOutput);
        }catch (Exception e){
            System.out.println("Excel file does not exist");
        }
    }
}



