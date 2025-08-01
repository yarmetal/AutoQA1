package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashBackHackServiceTest {

    CashbackHackService cashBack = new CashbackHackService();

    @Test
    public void testLessThanBoundary() {
        int amount = 500;
        int expected = 500;
        int actual = cashBack.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testEqualsToBoundary() {
        int amount = 1000;
        int expected = 0;
        int actual = cashBack.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testHigherThanBoundary() {
        int amount = 1500;
        int expected = 500;
        int actual = cashBack.remain(amount);

        Assert.assertEquals(actual, expected);

    }
}