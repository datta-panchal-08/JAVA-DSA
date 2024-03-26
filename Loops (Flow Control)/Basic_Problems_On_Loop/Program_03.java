import java.util.Scanner;
// Reverse A  Number Given By User....
public class Program_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number That You Wan't To Reverse : ");
        int num = sc.nextInt();
        System.out.println("You Enterd : "+num);
        while (num>0) {
            int lastDigit = num % 10;
            System.out.print(lastDigit);
            num = num / 10;
        }
        System.out.println();
    }
}
