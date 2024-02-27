public class TwinPrime {
    static boolean isPrime(int num){
        for(int i=2; i<=(num/2)+1; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for(int i=2; i<=200; i++){
            if(isPrime(i) && isPrime(i+2)){
                System.out.print("("+i+" "+(i+2)+")");
            }
        }
    }
}
