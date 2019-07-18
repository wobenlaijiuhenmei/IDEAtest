package ArrayList1;

import java.util.ArrayList;
import java.util.Random;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> bigList=new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100);
            bigList.add(num);
        }
        for (int i = 0; i < bigList.size(); i++) {
            System.out.println(bigList.get(i));
        }
        ArrayList<Integer> samllList=smallList(bigList);
        for (int i = 0; i < samllList.size(); i++) {
            System.out.print(samllList.get(i)+"   ");
        }

    }
    public static ArrayList<Integer> smallList(ArrayList<Integer> bigList) {
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if (num % 2 == 0) {
                smallList.add(num);
            }
        }
        return smallList;
    }
}
