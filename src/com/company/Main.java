package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws LimitException {
	BankAccount bankAccount = new BankAccount();
        Scanner s = new Scanner(System.in);

        System.out.println("Введите желаюмую сумму денег на счет ");
        bankAccount.deposit(s.nextInt());
        while (true){
            try {

                bankAccount.withDraw(6000);

            } catch (LimitException e) {
                e.printStackTrace();

            }
            if (bankAccount.getAmount() == 0){
                System.out.println("снятие завершено ");
                System.out.println("на счету < 0 >");
                break;
            }

        }
    }
}
