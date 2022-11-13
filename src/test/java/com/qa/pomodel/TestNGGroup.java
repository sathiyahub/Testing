package com.qa.pomodel;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestNGGroup {
	
	@BeforeGroups("Smoke Test")
    public void setup() 
    {
        System.out.println("Launching URL");
    }

    @Test(groups={"Smoke Test"})
    public void method1() 
    {
        System.out.println("Method-1");
    }
    @Test(groups={"Smoke Test"})
    public void method2() 
    {
        System.out.println("Method-2");
    }

    @Test(groups={"Smoke Test"})
    public void method3() 
    {
        System.out.println("Method-3");
    }

    @AfterGroups("Smoke Test")
    public void runfinal1() 
    {
        System.out.println("Smoke Test End..");
    }

    @Test(groups={"Regression"})
    public void method5() 
    {
        System.out.println("Method-5");
    }
    @Test(groups={"Regression"})
    public void method6() 
    {
        System.out.println("Method-6");
    }
    
    @AfterGroups("Regression")
    public void runfinal2() 
    {
        System.out.println("Regression Test End..");
    }

    @Test(dependsOnGroups = {"Smoke Test","Regression"})
    public void tearDown() 
    {
        System.out.println("Closing Browser");
    }

}
