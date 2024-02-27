import java.util.Scanner;

public class IsPrime {
    static boolean isPrime(int num){
        for(int i=2; i<=(num/2)+1; i++){
            if(num == 2){
                return false;
            }
            else if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (isPrime(num)) {
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a prime");
        }
    }
}
