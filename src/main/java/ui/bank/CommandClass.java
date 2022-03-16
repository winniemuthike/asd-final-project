package ui.bank;

import framework.service.AccountServiceImpl;
//Added By Zebib
public abstract class CommandClass {
    AccountServiceImpl accountService;

    public CommandClass(AccountServiceImpl accountService){
        this.accountService=accountService;
    }
    abstract double excute(String ID, double amount);
}
