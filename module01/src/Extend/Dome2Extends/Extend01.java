package Extend.Dome2Extends;
/*
* 构造方法，先调用父类构造方法（默认情况下必调用） 子类中默认赠送一个super()
* 所以可以用super（）进行构造方法的重载
* super（）的父类方法调用，必须是子类构造方法的第一个语句
* */

/*
* super 在子类成员方法中访问父类的成员变量
*       子类成员方法中访问父类的成员方法
*this   在本类方法中，访问本类的成员变量
*        在本类的成员方法中访问另一个成员方法
*       在本类的构造方法中访问另一个构造方法
*
* super于this构造调用不能同时使用
* */
public class Extend01 {
    public static void main(String[] args) {
        zi zi=new zi();
    }

}
