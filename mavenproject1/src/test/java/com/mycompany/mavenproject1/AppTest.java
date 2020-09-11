package com.mycompany.mavenproject1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }


    /**
     * Test of printHello method, of class App.
     */
    public void testPrintHello() {
        System.out.println("printHello");
        String expResult = "Hello world!";
        String result = App.printHello();
        assertEquals(expResult, result);
    }

        /**
     * Test of algo method, of class App.
     */
    public void testAlgo() {
        String expResult = "Algo";
        String result = App.algo();
        assertEquals(expResult, result);
    }
}
