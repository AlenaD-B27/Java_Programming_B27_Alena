package day37_static.bestbuy;

public class BestBuyStores {
    public static void main(String[] args) {



      //  BestBuy.location = "Fairfax"; //location is an instance variable, so I need an object in order to access;

        BestBuy store1 = new BestBuy();
        store1.location = "Fairfax";
        System.out.println(store1.location);

        System.out.println(BestBuy.headquarters); // this is a static variable, which means we can use the class name to access. No need to make an object.

        System.out.println(store1.headquarters); // you can do it from Syntax prospectives BUT you should use the class name to access.

        // other static members
        System.out.println(Math.PI); // PI is static;
        // Arrays.sort(); // most of the Utility classes use the static methods: Arrays, Collections, Math etc. To call the static methods we call the class name (ClassName.staticMethod);
        System.out.println(Integer.MIN_VALUE);









    }
}
