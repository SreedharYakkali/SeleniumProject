package priority;

import org.testng.annotations.Test;

@Test(groups= {"AllClassTests"})
public class TestNGGroupsDemo {
	
	@Test(groups= {"Sanity"})
	public void test1(){
		
		System.out.println("This is Test 1");
		
	}
	
	@Test(groups= {"Sanity","Smoke"})
	public void test2(){
		
		System.out.println("This is Test 2");
	}
	
	@Test(groups= {"Sanity","Regression"})
	public void test3(){
		
		System.out.println("This is Test 3");
	}
	
	@Test
	public void test4(){
		
		System.out.println("This is Test 4");
	}
	
	@Test(groups= {"windows.Regression"})
	public void test5(){
		
		System.out.println("This is Test 5");
	}
	
	@Test(groups= {"linux.Regression"})
	public void test6(){
		
		System.out.println("This is Test 6");
	}

}
