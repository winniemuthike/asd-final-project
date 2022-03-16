package ui.ccard;


import framework.service.AccountServiceImpl;

public abstract class AccountWithdraw extends CommandClass {


    public AccountWithdraw(AccountServiceImpl accountService) {
        super(accountService);
    }

    @Override
    public  double execute(String ID, double amount){
        accountService.withdraw(ID,amount);
        return  accountService.getAccount(ID).getBalance();
    }
}
