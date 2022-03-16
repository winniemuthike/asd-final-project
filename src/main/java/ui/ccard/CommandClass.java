package ui.ccard;

import framework.service.AccountServiceImpl;

public abstract class CommandClass {
    AccountServiceImpl accountService;
    public  CommandClass(AccountServiceImpl accountService){
        this.accountService=accountService;
    }
    abstract double execute(String ID, double amount);
}
