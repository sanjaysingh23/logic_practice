import java.util.Scanner;

public class HigherstNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        for(int i=0; i<10; i++){
            int num = sc.nextInt();
            min = Math.min(min, num);
        }
        System.out.println(min);
    }
}
