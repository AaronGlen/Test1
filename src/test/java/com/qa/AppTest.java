package com.qa;

import static org.junit.Assert.assertEquals;
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
    public void addNumber(){
        
        assertEquals("returning?", 2, app.input2(2,5));
    }
}
