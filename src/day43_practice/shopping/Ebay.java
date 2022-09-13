package day43_practice.shopping;

public final class Ebay extends OnlineShopping implements AllowUsersToSell{
    @Override
    public void uploadProduct() {
        System.out.println("Product is uploaded");
    }

    @Override
    public void viewCart() {
        System.out.println("Your Ebay Cart");

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
        System.out.println("Item is added to Ebay Cart");
    }

    @Override
    public void returnItem() {
        System.out.println("Return to Ebay is succeeded");

    }
}
