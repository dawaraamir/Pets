package safari;

public abstract class Animal {
    private String breed;
    public Animal(String breed ){
        this.breed = breed;
    }
    //getter
    public String getBreed(){
        return this.breed;
    }
    public abstract void  moveAnimal(int distance);

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                '}';
    }


}
