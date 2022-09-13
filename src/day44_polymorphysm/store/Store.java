package day44_polymorphysm.store;
import day43_abstraction.clothes.Clothes;
import day43_abstraction.clothes.HasHood;
import day43_abstraction.clothes.Jackets;
import day43_abstraction.clothes.TShirt;

import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {

        // all the possible reference of TShirt and Jacket
        // TShirt:

        TShirt shirt1 = new TShirt();
        Clothes shirt2 = new TShirt();

        // Jacket:
        Jackets jacket1 = new Jackets();
        Clothes jacket2 = new Jackets();
        HasHood jacket3 = new Jackets();

        Clothes[] inventory = new Clothes[7];
        inventory[0] = new TShirt();
        inventory[1] = shirt1;
        inventory[2] = shirt2;
        inventory[3] = jacket1;
        inventory[4] = jacket2;
//        inventory[5] = jacket3; // doesn't work because HasHood interface is not related to Clothes at all
        inventory[5] = new Hat();
        inventory[6] = new Hat();

        ArrayList<Clothes> list = new ArrayList<>();
        list.add(new Jackets());
        list.add(new TShirt());
        list.add(new Hat());

        for(Clothes each : inventory){
            each.wear();
        }

        buy(new Jackets());
        buy(new Hat());
        buy(new TShirt());

    }

    public static void buy(Clothes clothes){

        if(clothes instanceof Jackets){
            System.out.println("Jackets cost 29.99");
        } else if(clothes instanceof Hat){
            System.out.println("Hats cost 19.99");
        } else if(clothes instanceof TShirt){
            System.out.println("Tshirt is 9.99");
        }

    }

}

class Hat extends Clothes{
    @Override
    public void wear() {
        System.out.println("wearing hat");
    }
}
