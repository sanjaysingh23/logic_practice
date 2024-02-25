import java.util.ArrayList;
public class ArrayLs {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("qwe");
        name.add("asd");
        name.add("zxc");
        for(int i=0; i<name.size();i++){
            if("asd".equals(name.get(i)) ){
                System.out.println(name.get(i));
            }
        }
    }
}
