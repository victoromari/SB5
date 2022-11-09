import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SkillBuilder5Test {

    @Test
    void prefixAverage_1() {
        double[] a = {8.3,23,45.4,98,3.2,8.8,9.9,0.4};
        double[] expected = {8.3,15.65,25.56666667,43.675,35.58,31.1166667,28.0857143,24.625};
        double [] actual = SkillBuilder5.prefixAverage(a);
        assertArrayEquals(expected,actual,.0001);
    }

    @Test
    void prefixAverage_2() {
        double[] a = {1,100,1000,10000};
        double[] expected = {1.0,50.5,367.0,2775.25};
        double [] actual = SkillBuilder5.prefixAverage(a);
        assertArrayEquals(expected,actual,.0001,"Expected: "+expected+"\nActual: "+actual);
    }

    @Test
    void prefixAverage_3() {
        double[] a = {1};
        double[] expected = {1};
        double [] actual = SkillBuilder5.prefixAverage(a);
        assertArrayEquals(expected,actual,.0001,"Expected: "+expected+"\nActual: "+actual);
    }

    @Test
    void indexOf_1() {
        int[] a = {88,15,34,8, 34,89,55,12};
        int expected = 2;
        int actual = SkillBuilder5.indexOf(34,a);
        assertEquals(expected,actual, "Expected: "+expected+"\nActual: "+actual);
    }


    @Test
    void indexOf_2() {
        int[] a = {88,15,34,8, 34,89,55,12};
        int expected = 0;
        int actual = SkillBuilder5.indexOf(88,a);
        assertEquals(expected,actual, "Expected: "+expected+"\nActual: "+actual);
    }

    @Test
    void indexOf_3() {
        int[] a = {88,15,34,8, 34,89,55,12};
        int expected = -1;
        int actual = SkillBuilder5.indexOf(99,a);
        assertEquals(expected,actual, "Expected: "+expected+"\nActual: "+actual);
    }

    @Test
    void IndexOfStrings_1() {
        String[] a = {"help","me","test","this","method","help"};
        int expected = 0;
        int actual = SkillBuilder5.indexOf("help",a);
        assertEquals(expected,actual, "Expected: "+expected+"\nActual: "+actual);
    }

    @Test
    void IndexOfStrings_2() {
        String[] a = {"help","me","test","this","method","help"};
        int expected = 3;
        int actual = SkillBuilder5.indexOf("this",a);
        assertEquals(expected,actual, "Expected: "+expected+"\nActual: "+actual);
    }

    @Test
    void IndexOfStrings_3() {
        String[] a = {"help","me","test","this","method","help"};
        int expected = -1;
        int actual = SkillBuilder5.indexOf("yelp",a);
        assertEquals(expected,actual, "Expected: "+expected+"\nActual: "+actual);
    }

    @Test
    void remove_1() {
        String[] a = {"help","me","test","this","method","help"};
        String[] expected = {"help","me","test","method","help"};
        String[] actual = SkillBuilder5.remove("this",a);
        assertArrayEquals(expected,actual, "Expected: "+expected+"\nActual: "+actual);
    }

    @Test
    void remove_2() {
        String[] a = {"help","me","test","this","method"};
        String[] expected = {"help","me","test","this"};
        String[] actual = SkillBuilder5.remove("method",a);
        assertArrayEquals(expected,actual, "Expected: "+expected+"\nActual: "+actual);
    }

    @Test
    void remove_3() {
        String[] a = {"help"};
        String[] expected = {};
        String[] actual = SkillBuilder5.remove("help",a);
        assertArrayEquals(expected,actual, "Expected: "+expected+"\nActual: "+actual);
    }

    @Test
    void remove_4() {
        String[] a = {"help","me","test","this","method"};
        String[] expected = {"me","test","this", "method"};
        String[] actual = SkillBuilder5.remove("help",a);
        assertArrayEquals(expected,actual, "Expected: "+expected+"\nActual: "+actual);
    }

    @Test
    void remove_5() {
        String[] a = {"test", "help","me","test","this","method", "this", "test", "should", "pass"};
        String[] expected = {"help","me", "this", "method", "this", "should", "pass"};
        String[] actual = SkillBuilder5.remove("test",a);
        assertArrayEquals(expected,actual, "Expected: "+expected+"\nActual: "+actual);
    }

    @Test
    void reverse_1() {
        int[] a = {88,15,34,8,34,89,55,12};
        int[] expected = {12,55,89,34,8,34,15,88};
        SkillBuilder5.reverse(a);
        assertArrayEquals(expected,a, "Expected: "+expected+"\nActual: "+a);
    }

    @Test
    void reverse_2() {
        int[] a = {88};
        int[] expected = {88};
        SkillBuilder5.reverse(a);
        assertArrayEquals(expected,a, "Expected: "+expected+"\nActual: "+a);
    }
}