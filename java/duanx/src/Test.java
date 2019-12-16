import java.util.LinkedList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random=new Random();
        int x=random.nextInt((9999-1000+1))+1000;
        System.out.println(x);
    }
}
