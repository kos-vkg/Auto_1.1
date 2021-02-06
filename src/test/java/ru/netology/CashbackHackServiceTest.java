package ru.netology;

import org.junit.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldtestNormal() {
        int actual = service.remain(900);
        org.junit.Assert.assertEquals(100,actual);
    }

    @Test
    public void shouldtestEmpty() {
        int actual = service.remain(0);
        org.junit.Assert.assertEquals(1000,actual);
    }

    @Test
    public void shouldtestOptimal() {
        int actual = service.remain(1000);
        org.junit.Assert.assertEquals(0,actual);
    }
}