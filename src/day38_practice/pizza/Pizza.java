package day38_practice.pizza;

public class Pizza {

    String size;
    int toppingsNum;

    public Pizza(String size, int toppingsNum) {
        setSize(size);
        setToppingsNum(toppingsNum);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if(size.equalsIgnoreCase("small") || (size.equalsIgnoreCase("medium") || (size.equalsIgnoreCase("large") )))
            this.size = size;
    }

    public int getToppingsNum() {
        return toppingsNum;
    }

    public void setToppingsNum(int toppingsNum) {
        if(toppingsNum >= 0)
        this.toppingsNum = toppingsNum;
    }


    public double calculatePrice(){
        double price = 0;
        if(size.equalsIgnoreCase("small")) {
            price += 4;
        } else if (size.equalsIgnoreCase("medium")){
            price += 6;
        } else if (size.equalsIgnoreCase("large")){
            price += 8;
        }

        price += toppingsNum*.75;
        return price;
    }

    public String toString() {
        return "Your pizza: " +
                "size: " + size + "; " +
                "number of toppings: " + toppingsNum + "; " +
                "total cost: $" + calculatePrice() + ";";
    }
}
