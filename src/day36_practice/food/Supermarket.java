package day36_practice.food;

public class Supermarket {
    public static void main(String[] args) {

        //    	try making an array of Food objects

        Food[] arr = new Food [5];
        arr[0] = new Food ("apple", 50, .52);
        arr[1] = new Food ("pear", 20, .64);
        arr[2] = new Food ("apricot", 84, .25);
        arr[3] = new Food ("mango", 34, 1.12);
        arr[4] = new Food ("banana", 10, .42);


//    find all the Food objects that start with 'a' and print the whole information
        for(Food eachFood : arr){
            if(eachFood.name.startsWith("a")){
                System.out.println(eachFood);
            }
        }
        System.out.println("====================================");
//    find all the Food objects that have a total price over 20 and print the name of the food

        for (Food eachFood : arr){
            if(eachFood.totalPrice >= 20){
                System.out.println(eachFood.name);
            }
        }





    }
}
