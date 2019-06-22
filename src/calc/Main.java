/*
Project: Lab 14
Purpose Details: Simple Calculator
Course: IST 242
Author: Cassidy Czerpak
Date Developed: 6/19/19
Last Date Changed: 6/19/19
Revision: 1
*/
package calc;
import java.util.Scanner;
public class Main {

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        double num1,num2;
        char choice;
        double result;
        while(true)
        {
            System.out.print("Enter +, -, * or / :");
            choice=sc.next(".").charAt(0);
            switch(choice)
            {
                case '+':{
                    System.out.print("num1:");
                    num1=inputValueCheck();
                    System.out.print("num2:");
                    num2=inputValueCheck();

                    result=addition(num1,num2);

                    System.out.println(num1 + " + " + num2 + " = " + result);
                    continue;
                }
                case '-':{

                    System.out.print("num1 :");
                    num1=inputValueCheck();
                    System.out.print("num2 :");
                    num2=inputValueCheck();

                    result=subtraction(num1,num2);

                    System.out.println(num1 + " - " + num2 + " = " + result);
                    continue;
                }
                case '*':{

                    System.out.print("num1:");
                    num1=inputValueCheck();
                    System.out.print("num2:");
                    num2=inputValueCheck();

                    result=multiply(num1,num2);

                    System.out.println(num1 + " * " + num2 + " = " + result);
                    continue;
                }
                case '/':{

                    System.out.print("num1 :");
                    num1=inputValueCheck();
                    System.out.print("num2 :");
                    num2=inputValueCheck();

                    result=division(num1,num2);

                    System.out.println(num1 + " / " + num2 + " = " + result);
                    continue;
                }
                case 'q':{
                    System.out.println("exit");
                    break;
                }
                default:{
                    System.out.println("invalid");
                    continue;
                }
            }
            break;
        }

    }
    public static double inputValueCheck() {
        while(true)
        {
            if (sc.hasNextInt())
            {
                System.out.println("Enter a double only");
                double val=sc.nextDouble();
            }
            else if (sc.hasNextDouble())
                return sc.nextDouble();

        }
    }


    /**
     * Perform division using two double values
     *
     * @param num1      number 1
     * @param num2      number2 2
     * @return          double
     * @author          Cassidy Czerpak
     * @version         1.0
     * @since           2019-06-19
     * */
    public static double division(double num1, double num2) {

        return (double)num1/num2;
    }


    /**
     * Perform multiplication using two double values
     *
     * @param num1      number 1
     * @param num2      number2 2
     * @return          double
     * @author          Cassidy Czerpak
     * @version         1.0
     * @since           2019-06-19
     * */
    public static double multiply(double num1, double num2) {

        return num1*num2;
    }


    /**
     * Perform subtraction using two double values
     *
     * @param num1      number 1
     * @param num2      number2 2
     * @return          double
     * @author          Cassidy Czerpak
     * @version         1.0
     * @since           2019-06-19
     * */
    public static double subtraction(double num1, double num2) {

        return num1-num2;
    }

    /**
     * Perform addition using two double values
     *
     * @param num1      number 1
     * @param num2      number2 2
     * @return          double
     * @author          Cassidy Czerpak
     * @version         1.0
     * @since           2019-06-19
     * */
    public static double addition(double num1, double num2) {

        return num1+num2;
    }
}