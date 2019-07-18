package Student;

public class Dome01Student {
    public static void main(String[] args) {
        Student stu1= new Student();
        stu1.setId(1607020103);
        stu1.setName("赵寒");
        System.out.println(stu1.getId()+"         "+stu1.getName());
        Student stu2= new Student("wang",1607020101);
        System.out.println(stu2.getId()+"         "+stu2.getName());

    }


}
