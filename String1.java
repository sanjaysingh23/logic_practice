import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String St = sc.nextLine();
        System.out.println("Enter a char");
        char ch = sc.next().charAt(0);
        int num = 0;
        for(int i=0; i<St.length();i++){
            if(ch == St.charAt(i)){
                num++;
            }
        }
        System.out.println("Number of time '"+ch+"' occure in '"+St+"' is "+num);
    }
}
