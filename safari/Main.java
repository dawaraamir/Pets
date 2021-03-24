package safari;

public class Main {
    public static void printPets(IPet[] pets) {
        for (IPet petsLoop : pets) {
            System.out.println(petsLoop.getClass().getSimpleName());
        }
    }
    public static void printsEachPetGreeting(IPet[] arrayOfPets){
        for(IPet pet : arrayOfPets){
            pet.greetOwner();
        }
    }
        public static void main (String[]args) {
            Turtle turtle = new Turtle("turtle breed");
            Dog dog = new Dog("corgi", "DoggyStyle");
            DigitalSnail digitalSnail = new DigitalSnail();

            IPet[] pets = {turtle, dog, digitalSnail};
            printPets(pets);
            printsEachPetGreeting(pets);
        }
    }