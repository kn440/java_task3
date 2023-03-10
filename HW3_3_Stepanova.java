import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;



class HW3_3_Stepanova{
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-100, 100);
            list1.add(val);
        }
        System.out.println("Первоначальный список "+ list1);
        System.out.println("Максимум: "+Collections.max(list1));
        System.out.println("Минимум: "+Collections.min(list1));
       
    }
}

