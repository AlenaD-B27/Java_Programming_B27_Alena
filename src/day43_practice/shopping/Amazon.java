package day43_practice.shopping;

public final class Amazon extends OnlineShopping{
    @Override
    public void viewCart() {
        System.out.println("Your Amazon Cart");
    }

    @Override
    public void payForShipping(boolean statement) {
        if(statement){
            System.out.println("Payed");
        }else {
            System.out.println("Please, pay for shipping");
        }

    }

    @Override
    public void buyItem() {
        System.out.println("Item is added to Amazon cart");
    }

    @Override
    public void returnItem() {
        System.out.println("Return is processed");
    }
}
