package com.icin.model;

import java.util.List;

/**
 * Container class to work with account balance and list of transactions
 * for the account
 *
 */
public class AccountSnapshotContainer {
    /**
     * Unique account ID
     */
    private Long accountId;
    
    /**
     * Available balance for the account
     */
    private Long accountBalance;
    
    /**
     * List of transactions for the account
     */
    private List<Transaction> transactions;
    
    public AccountSnapshotContainer () {
        
    }

    public AccountSnapshotContainer(Long accountId,
            Long accountBalance, List<Transaction> transactions) {
        super();
        this.accountId = accountId;
        this.accountBalance = accountBalance;
        this.transactions=transactions;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

}
