package Student2;

public class Str {
    public static void main(String[] args) {
        Student one = new Student("dage", 18);
        one.room = "101jiaoshi";

        Student two = new Student();

        System.out.println(two.room+"     "+two.getID());
    }
}
