package API;
import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.response.Response;
public class RestAssuredapi {
	 @DataProvider (name = "test")
     public Object[][] getdata() throws IOException {
         String path = System.getProperty("user.dir") + "\\src\\Config\\DataSheet.xls";
         FileInputStream fis = new FileInputStream(path);
         HSSFWorkbook workbook = new HSSFWorkbook(fis);
         HSSFSheet  sheet = workbook.getSheetAt(0);
         int row = sheet.getLastRowNum();
         Object[][] arr = new Object[row-1][2];
         int a = 0;
         for (int i = 1; i < row; i++) {
             arr[a][0] = sheet.getRow(i).getCell(0).getStringCellValue();
             a++;
         }
     return arr;
     }

     @Test(dataProvider = "test")
     public void enterDataExcel (String email, String name) {
     Response resp = given().auth().basic("sk_test_51KTjo6SCTfFYyBclKSOWkvJXnrItkRU83UkRKLIfnX7HyWxQqWKObpGsuGgYnrmVCWKBy1s5CKDYXECSOONX2x8a00gsgNkPQU", "").formParam("email", email).
             formParam("name", name).when().post("https://api.stripe.com/v1/customers");
     int respcode = resp.getStatusCode();
     System.out.println("Responce code is: " + respcode);
     String responsebody = resp.getBody().asString();
     System.out.println(responsebody);
 }
	

}
