package GROUP_PRACTICE.alena_goes_camping;

import java.util.Arrays;

public class Tourist {
    String name;
    private String [] belongings = new String [3];

    public Tourist(String name) {
        this.name = name;
       // setBelongings(belongings);
    }

    public String[] getBelongings() {
        return belongings;
    }
//    public void setBelongings(String[] itemsWeTake) {
//        if (belongings.length == 3){
//        belongings = itemsWeTake;
//        }
//    }

    @Override
    public String toString() {
        return name + " goes camping and has " + Arrays.toString(belongings) + ".";
    }

//    - setUpTent(){Requirement: if tourist has tent it should print "Tent is ready, tonighyt name is sleeping in a tent.", if not => "name doesn't have a tent, tonight name is sleeping under the stars."}; COMMIT

    public void setUpTent(){
        int count = 0;
        for (String eachItem : belongings){
            if (eachItem.equalsIgnoreCase("tent")){
                count++;
            }
        }

        if (count == 0){
            System.out.println(name + " doesn't have a tent, tonight " +  name + " is sleeping under the stars");
        } else {
            System.out.println("Tent is ready, tonight " + name + "is sleeping in a tent.");
        }
    }
//- makeFire(){Requirement: if tourist has matches, lighter or flint => it should print "The fire is ready." Otherwise => "name has no items to make the fire."}; COMMIT
//- playMusic(){if tourist has guitar, speaker or radio it should print "The music is fun." Otherwise: "name has no music so name is singing, the wolves think it's their brother"}. COMMIT
}
