package Extend.RedBao;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);

        Member a = new Member("a", 0);
        Member b = new Member("b", 0);
        Member c = new Member("c", 0);

        manager.show();
        a.show();
        b.show();
        c.show();
        System.out.println("------------------------------");

        ArrayList<Integer> redList = manager.send(20, 3);
        a.receive(redList);
        b.receive(redList);
        c.receive(redList);

        manager.show();
        a.show();
        b.show();
        c.show();

    }
}
