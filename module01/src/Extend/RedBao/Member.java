package Extend.RedBao;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }
    public void  receive(ArrayList<Integer> List){
        int index = new Random().nextInt(List.size());
        int delta = List.remove(index);
        int momey = super.getMoney();
        super.setMoney(momey + delta);
    }
}
