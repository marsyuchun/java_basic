package basic_demo.day_10;

public class TestUSB {
    public static void main(String[] args) {

        Laptop l = new Laptop();
        l.run();

        USBInterface usb1 = new Mouse();
        USBInterface usb2 = new Keyboard();

        l.useUSB(usb1);
        System.out.println("===========");
        l.useUSB(usb2);


        l.shutdown();
    }
}
