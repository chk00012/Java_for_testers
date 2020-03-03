package com.javafortesters.chap005testwithourownclasses.domainobject.example;

import environmentController.TestAppEnv;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestAppEnvironmentTest {

    private TestAppEnv testAppEnv = new TestAppEnv();


    @Test
    public void canGetUrlStatically() {

        assertEquals("Returns Hard Coded URL", "http://192.123.0.3:67", testAppEnv.getURL());
    }

    @Test
    public void canGetDomainAndPortStatically() {
        assertEquals("Just the Domain", "192.123.0.3", testAppEnv.getDOMAIN());
        assertEquals("Just the port", "67", testAppEnv.getPORT());
    }

    @Test
    public void testSetting(){

    }



}
