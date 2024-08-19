import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b = sc.nextInt();
        int g;
        int h;

        while(a<=b) {
            if (a % 2 != 0) System.out.println(a);
            a++;
        }
        if (a>b){
            int temp = a;
            a = b;
            b = temp;
            while(a<=b) {
                if (a % 2 != 0) System.out.println(a);
                a++;
            }

        }
            }


        }


