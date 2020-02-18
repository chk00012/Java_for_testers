package com.javafortesters.chap005testwithourownclasses.domainobject.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestAppEnvironmentTest {
    @Test
    public void canGetUrlStatically() {
        assertEquals("Return Hard Coded URL", "https://192.123.0.3:67", TestAppEnv.getUrl());

    }


}
