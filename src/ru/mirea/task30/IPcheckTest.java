package ru.mirea.task30;


import org.junit.Test;
import static org.junit.Assert.*;

public class IPcheckTest {

    @Test
    public void checkIPTest() {
        assertTrue(IPcheck.checkIP("127.0.0.1"));
        assertTrue(IPcheck.checkIP("255.255.255.0"));
        assertFalse(IPcheck.checkIP("1300.6.7.8"));
        assertFalse(IPcheck.checkIP("abc.def.gha.bcd"));
    }
}