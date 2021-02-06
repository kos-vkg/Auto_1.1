package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldtestNormal() {
        int actual = service.remain(900);
        assertEquals(actual, 100);
    }

    @Test
    public void shouldtestEmpty() {
        int actual = service.remain(0);
        assertEquals(actual, 1000);
    }

    @Test
    public void shouldtestOptimal() {
        int actual = service.remain(1000);
        assertEquals(actual, 0);
    }
}