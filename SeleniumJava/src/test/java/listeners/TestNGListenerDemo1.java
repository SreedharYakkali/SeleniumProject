package listeners;

import junit.framework.Assert;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo1 {
	
	@Test
	public void test4(){
		System.out.println("I am inside Test4");
	}
	
	@Test
	public void test5(){
		System.out.println("I am inside Test5");
		//Assert.assertTrue(false);
	}
	
	@Test
	public void test6(){
		System.out.println("I am inside Test6");
		throw new SkipException("The test is Skipped");
	}

}
