package ui.bank;

import framework.service.AccountServiceImpl;
//AddedByZebib
public class AccountWithdraw extends CommandClass{

    public AccountWithdraw(AccountServiceImpl accountService){
        super(accountService);
    }
    @Override
    double excute(String ID, double amount) {
        accountService.withdraw(ID,amount);
        return accountService.getAccount(ID).getBalance();
    }
}
