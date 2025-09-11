//Xandra Quevedo
//9/9/25
//Main class for object testing

public class ObjectTester {

    public static void main(String[] args){

        //make a Dog object (instantiation)
        Dog dog1 = new Dog();
        System.out.println(dog1);

        //make a Dog object - use non-default constructor
        Dog dog2 = new Dog("Karl", 3, "golden retriever");
        System.out.println(dog2);
        
        dog2.setName("Paul");
        System.out.println(dog2);

        //only print dog's name
        System.out.println(dog2.getName());

        //testing new object

        //make and print a standard Game object
        Game game1 = new Game();
        System.out.println(game1);

        //make a Game object with non-default constructor
        Game game2 = new Game("Star of Providence", 2025, 84);
        System.out.println(game2);

        //only print game's name
        System.out.println(game2.getTitle());


    }//end main


}//end class