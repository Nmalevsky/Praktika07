import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b = sc.nextInt();
        while(a<=b){
            if (a%2==0) {
                System.out.println(a);}

                a++;

        }
    }
}
