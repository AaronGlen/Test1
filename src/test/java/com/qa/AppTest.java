package com.qa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest

{
    private App app;

    @Before
    public void initialise(){
        app = new App();
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void mainTest(){
        app = new App();
        String[] input = new String[]{"a"};
        app.main(input);
    }

    @Test
    public void returnATest (){

        assertEquals("returning?", 2, app.returnA(2,5));
    }
    @Test
    public void multiplyTest(){

        assertEquals("returning?", 10, app.multiply(2,5));
    }



}
