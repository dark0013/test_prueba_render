package com.darkross.transactions.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transactions")
public class Transaction {
    public String getTransactions() {
        return "List of transactions";
    }
}
