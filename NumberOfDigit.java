import java.util.Scanner;

public class NumberOfDigit {
    static int numberOfDigit(int num){
        int count = 0;
        while(num>0){
            num = num/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println(numberOfDigit(num));
    }
}
