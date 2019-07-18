package Interface;

public class Dome02Interface {
    public static void main(String[] args) {
        MyinterfaceDefaultA a = new MyinterfaceDefaultA();
        a.methodAbs();
        //---------------------------------------------
        a.methodDefault();//MyinterfaceDefaultA中没有methodDefault()方法但是却可以调用，说明可以从接口传递！

    }
}
