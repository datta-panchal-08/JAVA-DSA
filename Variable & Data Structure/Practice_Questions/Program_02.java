package Practice_Questions;

import java.util.Scanner;

public class Program_02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter First number : ");
    int firstNum = sc.nextInt();
    System.out.println("You Entered : "+firstNum);
    System.out.print("Enter Second number : ");
    int secondNum = sc.nextInt();
    System.out.println("You Entered : "+secondNum);

    int sum  = firstNum + secondNum ;

    System.out.println("Sum Of "+firstNum+" And "+secondNum+" = "+sum);

  }    
}
