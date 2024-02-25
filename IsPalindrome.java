import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String st = sc.next();
        int len = st.length();
        int mid = len/2;
        for(int i=0; i<mid;i++){
            if(st.charAt(i)==st.charAt(len-1)){
                len--;
            }
            else{
                System.out.println("Not palindrome");
                break;
            }
        }
        System.out.println("It is Palindrome");
    }
}
