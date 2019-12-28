package priority;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	
	@Test(dependsOnMethods={"test2"}, priority=1)
	public void test1(){
		
		System.out.println("I am inside Test1");
	}
	
	@Test(priority=2)
	public void test2(){
		
		System.out.println("I am inside Test2");
	}
	
	@Test(dependsOnMethods={"test4","test5"})
    public void test3(){
		
		System.out.println("I am inside Test3");
	}
    
	@Test
    public void test4(){
		
		System.out.println("I am inside Test4");
	}
    
	@Test
    public void test5(){
		
		System.out.println("I am inside Test5");
	}
	
	@Test(dependsOnGroups={"sanity1"})
    public void test6(){
		
		System.out.println("I am inside Test6");
	}
	
	@Test(groups={"sanity1"})
    public void test9(){
		
		System.out.println("I am inside Test9");
	}
	
	@Test(groups={"sanity2"})
    public void test7(){
		
		System.out.println("I am inside Test7");
	}
	
//	@Test(dependsOnGroups={"sanity.*"})
//    public void test8(){
//		
//		System.out.println("I am inside Test8");
//	}
}