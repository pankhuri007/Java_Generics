import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args){
        ArrayList<String> l=new ArrayList<String>();
        l.add("Pankhuri");
        l.add("Prakhar");
       // l.add(10); CE:incompatible type
        m1(l);
        System.out.println(l);
    }
    public static void m1(ArrayList l){
        l.add(10);
        l.add(true);
        l.add(10.5);
    }
}
