package Practice_Questions;

import java.util.Scanner;

// Product Of a & b 
public class Program_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your First Number : ");
        int a = sc.nextInt();
        System.out.println(" You Entered : "+a);
        System.out.print("Enter Your Second Number : ");
        int b = sc.nextInt();
        System.out.println(" You Entered : "+a);

        int product = a*b;
        System.out.println("Product Of Two Numbers Is : "+product);
    }
}
