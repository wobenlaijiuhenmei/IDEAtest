package Extend.AnimalDome;
/*
 * 抽象方法：抽象方法所在的类必须是抽象类
 *           抽象方法是在方法前面加上abstract并且去掉大括号分号直接结束
 *           抽象类是在class前加上abstract
 * */
/*
 * 抽象类于抽象方法的使用
 * 1.不能直接new抽象类
 * 2.必须用子类来继承抽象父类
 * 3.子类必须覆盖重写父类中的所有抽象方法
 * 4.创建子类对象进行使用
 * */
public abstract class Animal {
    public abstract void eat();

}
