package Basic_Problems_On_Loop;
import java.util.Scanner;
// CHECK IF A NUMBER IS PRIME OR NOT...

public class Program_04 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int num = sc.nextInt();
        System.out.println("You Entered : "+ num);
        if(num == 2)
        {
            System.out.println(num +" : Is Prime Number");
        }
        else{
            boolean isPrime = true;
            for(int i = 2 ; i<=Math.sqrt(num) ; i++)
            {
               if(num % i == 0)
               {
                isPrime = false;
               }
            }
            if(isPrime == true )
            {
               System.out.println(num+" : Is A Prime Number");
            }else{
                System.out.println(num+" : Is Not A Prime Number");
            }

        }
       
    }
}
