package Basic_Problems_On_Loop;

import java.util.Scanner;

// PRINT NUMBER FROM 1 TO N
public class Program_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int number = sc.nextInt();
        int counter = 0;
        System.out.println("You Entered : "+number); 
        while(counter < number){
           counter++;
           System.out.println(counter);
        };
    }
}
