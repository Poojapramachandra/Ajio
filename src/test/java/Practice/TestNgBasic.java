package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgBasic {

	
	@Test
	public void demo(){
		Reporter.log("Hi", true);
	}
	
	@Test
	public void tester(){
		Reporter.log("Hello", true);
	}
	@Test
	public void a(){
		Reporter.log("a", true);
	}
}
