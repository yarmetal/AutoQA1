package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashBackHackServiceTest {

    CashbackHackService cashBack = new CashbackHackService();

    @Test
    public void testLessThanBoundary() {
        int amount = 500;
        int expected = 500;
        int actual = cashBack.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEqualsToBoundary() {
        int amount = 1000;
        int expected = 0;
        int actual = cashBack.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHigherThanBoundary() {
        int amount = 1500;
        int expected = 500;
        int actual = cashBack.remain(amount);

        Assert.assertEquals(expected, actual);

    }
}