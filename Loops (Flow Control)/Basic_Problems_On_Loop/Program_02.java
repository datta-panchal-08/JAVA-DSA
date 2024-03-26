import java.lang.*;
import java.util.Scanner;
// Sum Of N Natural Numbers...
public class Program_02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int num = sc.nextInt();
        System.out.println("You Enterd : "+num);
        int sum  = 0;
        int i= 1; 

        while(i<=num){
         sum += i;
         i++;
        }
        System.out.println(sum);

    }
}