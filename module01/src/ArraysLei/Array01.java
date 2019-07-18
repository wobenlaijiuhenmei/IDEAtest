package ArraysLei;


import java.lang.reflect.Array;
import java.util.Arrays;

/*
* public static String toString(数组）讲任何类型数组转化为字符串类型
* public static void sort（数组） 将数组按默认的进行排序（升序）{字符串按照字母}
*
* */
public class Array01 {
    public static void main(String[] args) {
        int[] intArray={10,20,30,};
        String intstr = Arrays.toString(intArray);
        System.out.println(intstr);

        int[] array1 = {78, 645, 6, 87, 96, 46};
        Arrays.sort(array1);

        System.out.println(Arrays.toString(array1));
    }
}

