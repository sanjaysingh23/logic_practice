public class SwapNum {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 20;
        num2 = num1-num2; 
        num1 = num1-num2;
        num2 = num2 +num1;
        System.out.println(num1+" "+num2);
    }
}
