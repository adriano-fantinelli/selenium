package test.java.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import test.java.utils.*;

public class BaseTest {

    @BeforeTest
    public void setup(){
        Browser.loadPage(Utils.getBaseUrl());
    }

    @AfterTest
    public void tearDown() {
        Browser.close();
    }
}