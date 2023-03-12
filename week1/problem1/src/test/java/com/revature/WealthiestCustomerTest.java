package com.revature;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WealthiestCustomerTest {
  WealthiestCustomer wealthiestCustomer = new WealthiestCustomer();

  @Test
  public void testSingleCustomer() {
    int[][] accounts = { { 100, 200, 300 } };
    int expected = 600;
    int actual = wealthiestCustomer.maximumWealth(accounts);
    assertEquals(expected, actual);
  }

  @Test
  public void testEachCustomerHasOneAccount() {
    int[][] accounts = { { 100 }, { 200 }, { 300 } };
    int expected = 300;
    int actual = wealthiestCustomer.maximumWealth(accounts);
    assertEquals(expected, actual);
  }

  @Test
  public void testMultipleAccountsPerCustomer() {
    int[][] accounts = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int expected = 24;
    int actual = wealthiestCustomer.maximumWealth(accounts);
    assertEquals(expected, actual);
  }

  @Test
  public void testNegativeBalance() {
    int[][] accounts = { { -100, 200, 300 } };
    int expected = 400;
    int actual = wealthiestCustomer.maximumWealth(accounts);
    assertEquals(expected, actual);
  }

  @Test
  public void testAllZeroBalances() {
    int[][] accounts = { { 0, 0, 0 }, { 0, 0, 0 } };
    int expected = 0;
    int actual = wealthiestCustomer.maximumWealth(accounts);
    assertEquals(expected, actual);
  }

  @Test
  public void testMixOfPositiveAndNegativeBalances() {
    int[][] accounts = { { -10, 20, -30 }, { 40, -50, 60 }, { 70, -80, -90 } };
    int expected = 50;
    int actual = wealthiestCustomer.maximumWealth(accounts);
    assertEquals(expected, actual);
  }

  @Test
  public void testEmptyGrid() {
    int[][] accounts = {};
    int expected = 0;
    int actual = wealthiestCustomer.maximumWealth(accounts);
    assertEquals(expected, actual);
  }

  @Test
  public void testSingleCustomerSingleBankAccountWithZeroBalance() {
    int[][] accounts = { { 0 } };
    int expected = 0;
    int actual = wealthiestCustomer.maximumWealth(accounts);
    assertEquals(expected, actual);
  }

  @Test
  public void testSingleCustomerSingleBankAccountWithPositiveBalance() {
    int[][] accounts = { { 100 } };
    int expected = 100;
    int actual = wealthiestCustomer.maximumWealth(accounts);
    assertEquals(expected, actual);
  }

  @Test
  public void testSingleCustomerSingleBankAccountWithNegativeBalance() {
    int[][] accounts = { { -100 } };
    int expected = -100;
    int actual = wealthiestCustomer.maximumWealth(accounts);
    assertEquals(expected, actual);
  }
}
