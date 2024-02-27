public class PrimeBetween {
    static boolean primeBetween(int num){
        
            for(int j=2; j<=(num/2)+1; j++){
                if(num%j==0){
                    return false;
                }
            }
            return true;
    }
    public static void main(String[] args) {
        
        for(int i=51; i<=100; i++){
            if(primeBetween(i)){
                System.out.print(i+" ");
            }
        }
    }
}
