import java.util.*;
class cellphone{
    public void ring(){
        System.out.println("Ringing........");

    }
    public void vibrate(){
        System.out.println("Vibrating....");
    }
}
public class custom_class{
    public static void main(String[] args) {
//        cellphone me = new cellphone();
//        me.ring();
//        me.vibrate();
        cellphone a=new cellphone();
        cellphone b =new cellphone();
        a=b;
        b=null;
        System.out.print(a);
        System.out.println(b);
    }
}