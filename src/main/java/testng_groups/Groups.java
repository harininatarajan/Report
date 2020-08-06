package testng_groups;

import org.testng.annotations.Test;

public class Groups {
@Test (groups = {"smoketest" , "sanitytest"})
public void method1() {
	System.out.println("This is first method");
}
@Test (groups ="smoketest")  //smoke test
public void method2()
{
	System.out.println("This is second method");
}
@Test
public void method3() {
	System.out.println("This is third method");
}
@Test (groups ="Functionaltest")
public void method4() {
	System.out.println("This is fourth method");
}
@Test(groups ="Functionatest")
public void method5() {
	
}
@Test (groups ="Functionaltest")
public void method6() {
	System.out.println("This is sixth method");
}
@Test(dependsOnGroups = "Functionaltest")

public void method7() {
	System.out.println("This is seventh method");
	
}
@Test (dependsOnGroups ="Functionaltest")
public void method8() {
	System.out.println("This is eighth method");
}
@Test(groups ="UATtest",dependsOnGroups = {"smoketest","Functionaltest"})
public void method9() {
	System.out.println("This is ninth method");
}

}

