import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for(int i=0; i<10; i++){
            System.out.print("Enter number "+(i+1)+" ");
            int num = sc.nextInt();
            total = total+num;
        }
        System.out.println("Total is "+total);
    }
}
