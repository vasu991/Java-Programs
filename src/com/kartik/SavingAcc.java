package com.kartik;
import java.util.*;


public class SavingAcc {
    String name;
    int acno;
    float depo;
    float draw;
    float balance;


    public SavingAcc(String name, int acno, float balance) {
        this.name = name;
        this.acno = acno;
        this.balance = balance;
        this.depo = 0;
        this.draw = 0;
    }
    public void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Account Holder Name: " + name);
        System.out.println("Enter the amount you want to withdraw: ");
        if( balance > 1000){
            draw= sc.nextInt();
            balance = balance - draw;
            System.out.println("New balance after withdraw is: "+ balance);
        }
        else {
            System.out.println("withdraw not possible");
        }
    }
    public void deposit() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Account Holder Name: "+name);
        System.out.println("Enter the amount you want to deposit: ");
        this.depo = sc.nextInt();
        balance = balance + depo;
        System.out.println("New balance after deposit: " +  balance);
    }
    public void display() {
        System.out.println("Account Number: " + this.acno);
        System.out.println("Account Holder Name: " + this.name);
        System.out.println("Current Balance: " + this.balance);

    }

    public static void main(String[] args) {
        SavingAcc vasu = new SavingAcc("vasu", 101, 5000);
        SavingAcc kartik = new SavingAcc("kartik", 102, 6000);
        vasu.deposit();
        vasu.withdraw();
        vasu.display();
        kartik.deposit();
        kartik.withdraw();
        kartik.display();
    }
}