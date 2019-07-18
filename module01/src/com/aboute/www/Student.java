package com.aboute.www;

public class Student {
    private String name;
    private  int age;
    private boolean sex;

    public void sex(boolean b){
        sex=b;
    }
    public boolean isSex(){
        return sex;
    }
    public void  setName(String str){
        name=str;
    }
    public String getName(){
        return name;
    }
    public void setAge(int num){
        age=num;
    }
    public int getAge(){
        return age;
    }
}
