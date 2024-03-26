import java.util.*;
public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int num = sc.nextInt();
        System.out.println("You Entered : "+num);
        for(int  i = 1; i<=num;i++){
            System.out.println("****");
        }

    }
}
