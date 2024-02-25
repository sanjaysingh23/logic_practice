import java.util.Scanner;

public class NumberReverse {
    static int numberReverse(int num){
        int x;
        int rev = 0;
        while(num > 0){
            x = num%10;
            rev = x+rev*10;
            num = num/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println(numberReverse(num));
    }
}
