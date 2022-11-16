package ru.mirea.task30;

import org.junit.Assert;
import org.junit.Test;

public class MathFTest {
    static boolean factorialTest=false;
    static boolean powTest=false;

    @Test
    public void pow() {
        Assert.assertEquals(1, MathF.pow(5, 0));
        Assert.assertEquals(27,MathF.pow(3,3));
        Assert.assertEquals(144,MathF.pow(12,2));
        Assert.assertEquals(49,MathF.pow(-7,2));
        Assert.assertEquals(-1024,MathF.pow(-4,5));
        powTest=true;
        Task31.writeResults();
    }

    @Test
    public void factorial() {
        Assert.assertEquals(1,MathF.factorial(0));
        Assert.assertEquals(1,MathF.factorial(1));
        Assert.assertEquals(2,MathF.factorial(2));
        Assert.assertEquals(6,MathF.factorial(3));
        Assert.assertEquals(24,MathF.factorial(4));
        Assert.assertEquals(120,MathF.factorial(5));
        factorialTest=true;
        Task31.writeResults();
    }
}