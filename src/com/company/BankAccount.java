package com.company;

public class BankAccount {
    private int amount;

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }



    public void deposit(int sum){
        setAmount(sum);
    }

    public void withDraw(int sum) throws LimitException {
       if (sum > 6000 || sum < 0){
           throw new LimitException("не веерная сумма снятия повторите попытку " + sum);
       }else if (sum > getAmount()){
           System.out.println("остаток суммы " + getAmount() + " < вывод - 2000 >");
           System.out.println("автоматическое снятие остатка");
           setAmount(getAmount() - 2000);
       }else{
           System.out.println("снятие " + sum);
           setAmount(getAmount() - sum);
       }

    }
}
