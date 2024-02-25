import java.util.Scanner;

public class HighestTwoNumber {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int maxSec = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<10; i++){
            int num = sc.nextInt();
            maxSec = Math.max(maxSec, max);  
            max = Math.max(max, num);            
                      
        }
        System.out.println(max +" "+ maxSec);
    }
}
