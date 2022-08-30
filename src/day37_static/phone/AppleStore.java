package day37_static.phone;

public class AppleStore {
    public static void main(String[] args) {

      IPhone iphone1 = new IPhone("IPhone X", "Black", 1000, 256);
        System.out.println(iphone1);
        System.out.println(IPhone.brand);
        System.out.println(IPhone.os);

        IPhone iphone2 = new IPhone("IPhone 7", "Silver", 1000, 256);
        System.out.println(iphone2);



    }

}
