package computer;

public class DomeMain {
    public static void main(String[] args) {
        computer computer = new computer();

        computer.poweron();

        USB usbMouse = new Mouse();
        computer.useDevice(usbMouse);

        Keyboard keyboard = new Keyboard();
        computer.useDevice(keyboard);

        computer.poweroff();

    }
}
