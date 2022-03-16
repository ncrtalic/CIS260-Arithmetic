/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;


import java.util.Scanner;
/**
 *
 * @author ncrta
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 int num1, num2, sum, op;
 double dub1 = 0, dub2 = 0, decsum = 0;

  while(true){
 System.out.println("\nMenu\n1: Display Author Name\n2: Integer Operation\n3: Floating Point Operation\n0: Exit Program");
int x = 0;
 x = input.nextInt();
switch(x){
    case 1:
        System.out.println("Noah Crtalic 2717249\n");
        break;
    case 2:
        System.out.println("\nEnter First Integer:\n");
        num1 = input.nextInt();
        System.out.println("Enter Operand\n");
        char c = input.next().charAt(0);
        System.out.println("\nEnter Second Integer\n");
        num2 = input.nextInt();
     switch (c) {
         case '+' -> {
             sum = num1 + num2;
             System.out.printf("%d + %d = %d\n" ,num1, num2, sum);
         }
         case '-' -> {
             sum = num1 - num2;
             System.out.printf("%d - %d = %d\n" ,num1, num2, sum);
         }
         case '*' -> {
             sum = num1 * num2;
             System.out.printf("%d * %d = %d\n" ,num1, num2, sum);
         }
         case '/' -> {
             sum = num1 / num2;
             System.out.printf("%d / %d = %d\n" ,num1, num2, sum);
         }

         case '%' -> {
             sum = num1 % num2;
             System.out.printf("%d MODULUS %d = %d\n" ,num1, num2, sum);
         }
         default -> {
             System.err.printf("Invalid Operand\n");
         }
     }
     /* modulus operator yields remainder*/
        break;


    case 3:
                System.out.println("\nEnter First Number:\n");
        dub1 = input.nextDouble();
        System.out.println("Enter Operand\n");
        char d = input.next().charAt(0);
        System.out.println("\nEnter Second Number\n");
        dub2 = input.nextDouble();
     switch (d) {
         case '+' -> {
             decsum = dub1 + dub2;
             System.out.printf("%.2f + %.2f = %.2f\n" ,dub1, dub2, decsum);
         }
         case '-' -> {
             decsum = dub1 - dub2;
             System.out.printf("%.2f - %.2f = %.2f\n", dub1, dub2, decsum);
         }
         case '*' -> {
             decsum = dub1 * dub2;
             System.out.printf("%.2f * %.2f = %.2f\n" ,dub1, dub2, decsum);
         }
         case '/' -> {
             decsum = dub1 / dub2;
             System.out.printf("%.2f / %.2f = %.2f\n" ,dub1, dub2, decsum);
         }
         default -> {
             System.err.printf("Invalid Operand\n");
         }
     }
        break;


    case 0:
        System.exit(0);
    default:
       System.err.println("Invalid Selection");
            }
 
    }
    
}
}