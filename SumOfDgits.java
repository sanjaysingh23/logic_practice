import java.util.Scanner;

public class SumOfDgits {
    static int sumOfDgits(int num){
        int sum = 0;
        while (num>0) {
            sum = sum+num%10;
            num = num/10;
            // System.out.println(sum);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int ans = sumOfDgits(num);
        System.out.println(ans);
    }
}
