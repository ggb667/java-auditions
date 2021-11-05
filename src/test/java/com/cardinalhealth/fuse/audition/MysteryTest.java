package com.cardinalhealth.fuse.audition;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MysteryTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    /**
     * Read the following code and:
     * <p/>
     * a) Explain what the code is supposed to do.
     * b) Write a Junit test case to prove it.
     * c) If there are errors, explain them & propose/provide a solution.
     */
    @Test
    public void mysteryTest() {
        Mystery m = new Mystery();
        String val = m.mystery(null);
        System.out.println("'" + val + "'");
        assertTrue("N/A".equals(val));
    }

    @Test
    public void mysteryTest2() {
        Mystery m = new Mystery();
        String val = m.mystery("1234");
        System.out.println("'" + val + "'");
        assertTrue("1,234".equals(val));
    }

    @Test
    public void subCalculationCheckTest() {
        int ans[] = { 0,0,0,1,1,1,2,2,2,3 };
        int i=1;
        for(String num = i +"";  num.length()<11; num+=i){
            System.out.print("'" + num + "'");
            System.out.println(" NumberOfCommas:" + ((num.length()-1) / 3));//Correct
            assertTrue(ans[i++ -1]==((num.length()-1) / 3));
        }
    }

    @Test
    public void mysteryTest3() {
        Mystery m = new Mystery();
        String val = m.mystery("12345");
        System.out.println("'" + val + "'");
        assertTrue("12,345".equals(val));
    }

    @Test
    public void mysteryTest4() {
        Mystery m = new Mystery();
        String val = m.mystery("123456");
        System.out.println("'" + val + "'");
        assertTrue("123,456".equals(val));
    }

    @Test
    public void mysteryTest5() {
        Mystery m = new Mystery();
        String val = m.mystery("1234567");
        System.out.println("'" + val + "'");
        assertTrue("1,234,567".equals(val));
    }

    @Test
    public void mysteryTest6() {
        Mystery m = new Mystery();
        String val = m.mystery("1");
        System.out.println("'" + val + "'");
        assertTrue("1".equals(val));
    }

    @Test
    public void mysteryTest7() {
        Mystery m = new Mystery();
        String val = m.mystery("-1");
        System.out.println("'" + val + "'");
        assertTrue("-1".equals(val));
    }

    @Test //Holy cow it works for negatives also.
    public void mysteryTest8() {
        Mystery m = new Mystery();
        String val = m.mystery("-1234");
        System.out.println("'" + val + "'");
        assertTrue("-1,234".equals(val));
    }

}
