package safari;

public class Turtle extends Reptile implements IPet{
    public Turtle(String breed){
        super(breed);
    }
    //inherits behavior and properties from the parent
    @Override
    public void moveAnimal(int distance){
        System.out.println("moving " + getBreed() + " by " + distance);
    }
    @Override
    public void greetOwner() {
        System.out.println("turtle greets you");
    }
}
