package com.kartik;
import java.util.*;
public class Pay {
    String name;
    float salary, da , hra , gross;
    public void inputdata()  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        name = sc.nextLine();
        System.out.println("Enter the salary of the employee:");
        salary = sc.nextFloat();
    }
        public void calculate() {
           da = (float) (0.15*salary);
           hra = (float) (0.10*salary);
           gross = salary + da + hra;
        }
        public void outputdata(){
            System.out.println("Employee name:" + name);
            System.out.println("dearness allowance: " + da);
            System.out.println("house rent allowance: " + hra);
            System.out.println("gross salary: " + gross);
        }

       public static void main(String[] args)  {
            Pay obj = new Pay();
            obj.inputdata();
            obj.calculate();
            obj.outputdata();
      }
}