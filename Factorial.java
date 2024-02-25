import java.util.Scanner;

public class Factorial {
     static int factorial(int num){
        int total = 1;
        for(int i=1; i<=num; i++){
            total = total*i;
            // System.out.print("==="+total);
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = Factorial.factorial(num);
        System.out.println(ans);
    }
}
