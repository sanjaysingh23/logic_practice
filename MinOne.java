import java.util.Scanner;

public class MinOne {
    static int minOne(String str){
        int countMin = Integer.MAX_VALUE;
        int count = 0;
        boolean found = false;
        if(str.length()==0){
            System.out.println("String is empty");
        }
        else{
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i)=='1'){
                    count++;
                    found = true;
                }
                if(str.charAt(i)=='0') {
                    if(count>0){
                        countMin = Math.min(countMin, count);
                        count = 0;
                    }
                    
                }
            }
            if(count>0){
                countMin = Math.min(countMin, count);
                count = 0;
            }
        }
        if(found == true){
            return countMin;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        int ans = MinOne.minOne(str);
        System.out.println(ans);
    }
}
