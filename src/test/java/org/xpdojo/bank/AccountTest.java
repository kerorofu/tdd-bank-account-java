package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.AbstractIntegerAssert;

import static org.assertj.core.api.Assertions.assertThat;
//import org.hamcrest.Matchers.is;


public class AccountTest {

    @Test
    public void startingBalanceIsZero() {
        Account account = new Account();
        assertThat(account.balance).isEqualTo(0);
    }

    @Test
    public void depositAnAmountToIncreaseTheBalance() {

        Account account = new Account();
        account.deposit(100);
        assertThat(account.balance).isEqualTo(100);
    }

    @Test
    public void depostingMultipleAmounts() {
        Account account = new Account();
        account.deposit(100);
        account.deposit(300);
        assertThat(account.balance).isEqualTo(400);
    }

    @Test
    public void withdrawMultipleAmounts() {
        Account account = new Account();
        account.deposit(300);
        account.withdraw(100);
        assertThat(account.balance).isEqualTo(200);
    }
}
