import java.util.Scanner;

public class armstrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isAramstrong(n));
    }

    static boolean isAramstrong(int n){
       int original = n;
       int sum = 0;

       while (n > 0){
        int rem = n % 10;
        n = n / 10;
        sum = sum + rem*rem*rem;
       }
       return sum == original;
    }
}