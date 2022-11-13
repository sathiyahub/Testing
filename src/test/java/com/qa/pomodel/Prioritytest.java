package com.qa.pomodel;

import org.testng.annotations.Test;

public class Prioritytest {
	@Test(priority = -2)
    public void sign()
    {
        System.out.println("Welcome");
    }

    @Test(priority = 1)
    public void test()
    {
        System.out.println("World");
    }


    @Test(priority = 0)
    public void cases()
    {
        System.out.println("Green");
    }
    @Test(priority = -1)
    public void hello()
    {
        System.out.println("Blue");
    }

}
