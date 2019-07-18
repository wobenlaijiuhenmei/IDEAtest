package Student2;

public class Student{
    private String name;
    private int age;
    static  String room;
    private static int ID = 0;


    public Student() {
        this.ID = ++ID;

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.ID = ++ID;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Student.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


