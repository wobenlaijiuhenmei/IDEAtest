package Extend.RedBao;

import java.util.ArrayList;

public class Manager extends User{
    public Manager(){

    }

    public Manager(String name, int money) {
        super(name, money);
    }
    public ArrayList<Integer> send(int totalMoney,int count){
        //用一个集合储存红包
        ArrayList<Integer> redList = new ArrayList<>();
        //先看群主有多少钱
        int leftMoney = super.getMoney();
        if(totalMoney>leftMoney){
            System.out.println("余额不足");
            return redList;//返回空集合
        }
        int avg = totalMoney / count;
        int mod = totalMoney % count;//

        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }
        int last = avg + mod;
        redList.add(last);
        return redList;
    }
}
