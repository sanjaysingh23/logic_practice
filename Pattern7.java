public class Pattern7 {
    public static void main(String[] args) {
        // int num = 1;
        for(int i=1; i<=3 ; i++){
            for(int k=3; k>=i; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print(i);
            }
            System.out.println();
            // num = num+2;
        }
    }
}
