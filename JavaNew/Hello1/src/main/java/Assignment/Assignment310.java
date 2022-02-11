package Assignment;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Assignment310 {

	@DataProvider(name="empLogin")
	public Object[][] loginData() {
		Object[][] arrayObject = getExcelData("/TestData/GunveerFile.xlsx","Sheet1");
		
		
		return arrayObject;
	
	
	
}

	public Object[][] getExcelData(String path, String sheetName ) {
		// TODO Auto-generated method stub
		Object[][] arrayExcelData = null;
		
		try {
			FileInputStream prop = new FileInputStream(path);
			
			XSSFWorkbook wb = new XSSFWorkbook(prop);
			XSSFSheet sh = wb.getSheet("Sheet1");

			int rowCount=sh.getLastRowNum()-sh.getFirstRowNum();
			
			
			arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];
			
			for (int i= 1 ; i < totalNoOfRows; i++) {

				for (int j=0; j < totalNoOfCols; j++) {
					arrayExcelData[i-1][j] = sh.getCell(j, i).getContents();
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			e.printStackTrace();
		} catch (BiffException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		return arrayExcelData;
		
	}
	

}
