package day24_array;

public class SchoolShop {
    public static void main(String[] args) {


        // each item price and id are related in the positions they are in the array

        String[] items = {"Backpack", "Jacket", "Shirt", "Macbook", "Notebook", "Headphones"};
        double[] prices = {59.99, 150.0, 10.55, 1_000, 3.49, 15.99};
        int[] itemId = {500101, 500102, 500103, 500104, 500105, 500106};

        // print the catalog
        System.out.println("Full Catalog\nID\t| NAME | PRICE");
        for(int i = 0; i < items.length; i++){
            System.out.println(itemId[i] + " | " + items[i] + " | $" + prices[i]);
        }

        System.out.println();
        // finding if jackets in the store
        boolean inStock = false;
        for(String eachItem : items){ // eachItem will represent each element from the items array
            if(eachItem.equalsIgnoreCase("jacket")){
                inStock = true;
                break;
            }
        }
        System.out.println(inStock ? "Jacket is in stock" : "We don't have jackets right now");

        System.out.println();
        // find the index of notebook
        int index = -1;
        for(int i = 0; i < items.length; i++){
            if(items[i].equalsIgnoreCase("notebook")){
                index = i;
            }
        }
        System.out.println("Index of the notebook: " + index);

        System.out.println();
        // Find the information for the most expensive item
        double maxPrice = prices[0]; // first element is good default
        int indexOfMax = 0;

        for(int i = 0; i < prices.length; i++){ // we can start from int = 1 because the first price is already the default

            if(prices[i] > maxPrice){
                maxPrice = prices[i];
                indexOfMax = i;
            }

        }

        System.out.println("Most Expensive item: " + itemId[indexOfMax] + " | " + items[indexOfMax] + " | $" + prices[indexOfMax]);



    }
    }
