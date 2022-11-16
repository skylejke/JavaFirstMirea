package ru.mirea.task30;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IPcheckTest {

    @Test
    public void checkIPTest() {
        Assert.assertEquals(true, IPcheck.checkIP("127.0.0.1"));
        Assert.assertEquals(true, IPcheck.checkIP("255.255.255.0"));
        Assert.assertEquals(false, IPcheck.checkIP("1300.6.7.8"));
        Assert.assertEquals(false, IPcheck.checkIP("abc.def.gha.bcd"));
    }
}