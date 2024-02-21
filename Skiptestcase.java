package uitestng;

import org.testng.SkipException;
import org.testng.annotations.Test;


public class Skiptestcase {

	boolean dataset = false;
	
	@Test(enabled = false)
	public void skiptest1()
	{
		System.out.println("skip testcase1");
	}
	
	@Test
	public void skiptest2()
	{
		System.out.println("skip testcase2");
		throw new SkipException("skip test2");
	}
	
	@Test
	public void skiptest3()
	{
		System.out.println("skip the testcase if the condition fail");
		if(dataset == true)
		{
			System.out.println("execute the testcase");
		}
		else
		{
			System.out.println("don't processed");
			throw new SkipException("skip test3 ");
		}
		
	}
	
}
