package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.is;


public class AccountTest {

    @Test
    public void startingBalanceIsZero() {
        Account account = new Account();
        assertThat(account.balance, is(0));
    }

    @Test
    public void depositAnAmountToIncreaseTheBalance() {

        assertThat("your first test").isBlank();
        // arrange
        Account account = new Account();
        account.deposit(100);
        assertThat(account.balance, is(100));
    }

    @Test
    public void depostingMultipleAmounts() {
        Account account = new Account();
        account.deposit(100);
        account.deposit(300);
        assertThat(account.balance, is(400));
    }
}
