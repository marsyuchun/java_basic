package basic_demo.day_10;

public class Laptop implements USBInterface{

    public void run(){
        System.out.println("laptop running.");
    }

    public void shutdown(){
        System.out.println("shutdown laptop.");
    }

    public void useUSB(USBInterface usb){
        if (usb != null) {
            usb.open();
            if (usb instanceof Mouse){
                ((Mouse) usb).clickMouse();
            }else if(usb instanceof Keyboard){
                ((Keyboard) usb).clickKeyboard();
            }
            usb.close();
        }

    }
}
