package io.muehlbachler.bswe;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

public class StringServiceTest {
    private StringService stringService = new StringService();

    @Test
    public void testToUpperCase() {
        assertEquals("ABC", stringService.toUpperCase("abc"), "abc toUpperCase should be ABC");
    }

    @Test
    public void testEmptyString(){
        assertEquals("", stringService.toUpperCase(""));
    }

    @Test
    public void testNullString(){
        try{
            stringService.toUpperCase(null);
            fail();
        }catch (NullPointerException e){
            assertEquals("Cannot invoke \"String.toUpperCase()\" because \"string\" is null", e.getMessage());
        }
    }
}
