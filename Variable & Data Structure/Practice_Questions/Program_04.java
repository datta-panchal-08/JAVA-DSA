package Practice_Questions;

import java.util.Scanner;

public class Program_04 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Radius Of Circle : ");
        float radius = sc.nextFloat();
        System.out.println("You Entered : "+radius);
        
        float pi = 3.14f;
        float area = pi * radius * radius;
        
        System.out.println("Area Of Circle : "+area);



    } 
}
