package OrHR.OrHR;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import excel.ExcelTest;

public class OrHrTest extends BaseBrowser{

	@BeforeTest
	public static void test1() throws IOException {
		BaseBrowser.browser();
		
	}
	
	@Test(priority =1)
	
	public static void test2() throws Exception {
	OrHrLogin.elements();
	}
	
	@Test(priority =2 )
	public static void test3(){
		BaseBrowser.closeBrowser();
	}
	
//	@Test(priority =3)
//	public static void test4() throws Exception {
//		ExcelTest.excleData(1,0);
//		ExcelTest.excleData(1, 1);
//	}
}
