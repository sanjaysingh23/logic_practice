import java.util.Scanner;

public class Divide {
    static void divide(int num){
        if(num%3==0 && num%7==0){
            System.out.println("Number is divided by both 3 and 7");
        }
        else if(num%7==0){
            System.out.println("Number is divided by 7");
        }
        else if(num%3==0){
            System.out.println("Number is divided by 3");
        }

        else{
            System.out.println("Number neither divided by 3 nor by 7");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        Divide.divide(num);
    }
}
