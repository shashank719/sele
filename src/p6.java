import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class p6 {
	@Test
	public void demo()
	{
		System.out.println("FE");
	}
	@Test
	public void m1()
	{
			Assert.fail();
		Reporter.log("qwerw", false);
	}

}
