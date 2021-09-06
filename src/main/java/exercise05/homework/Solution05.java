package exercise05.homework;
//ask user for two numbers
//calculate the sum ,difference, product, and quotient of the two numbers
//print the answers of all the calculations

import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {
        System.out.println("what is the first number?");
        Scanner input = new Scanner(System.in);
        String first = input.next();

        System.out.println("what is the second number?");
        String second = input.next();
        input.close();
        int number1 = Integer.parseInt(first);
        int number2 = Integer.parseInt(second);
        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;
        int quotient = number1/number2;
        int remainder = number1 % number2;
        System.out.println(first + " + " + second + " = " + sum + "\n"
                + first + " - " + second + " = " + difference + "\n"
                + first + " * " + second + " = " + product + "\n"
                + first + " / " + second + " = " + quotient + "." + remainder + "\n");



    }
}
