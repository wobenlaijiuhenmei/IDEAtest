package computer;

import Extend.RedBao.Manager;

public class computer {
    public void poweron(){
        System.out.println("笔记本开机");
    }
    public void poweroff(){
        System.out.println("笔记本电脑关机");
    }
    //使用USB设备的方法,使用借口作为参数
    public void useDevice(USB usb){
        usb.open();
        if (usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }else if (usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();

        }
        usb.close();
    }
}
