import java.util.Scanner;

public class HighestNum {
    static void highestNum(int a, int b, int c){
        if(a>b&&a>c){
            System.out.println(a+" is highest");
        }
        else if(b>a&&b>c){
            System.out.println(b+" is highest");
        }
        else {
            System.out.println(c+" is highest");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        HighestNum.highestNum(num1, num2, num3);
    }
}
