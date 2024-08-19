import java.util.Scanner;

public class task04_1 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b = sc.nextInt();

    double [] nums = {a,b};
    double sum = 2;
        System.out.println((a+b)/sum);

        int summ = 0;
        for (int i = a; i < b; i++) {
            summ += i;
        }
            System.out.println(summ);
        System.out.println(sumInRange(a, b));

        }
}
