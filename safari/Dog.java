package safari;

    public  class Dog extends Canine implements IPet{
        private String name;
        public Dog(String breed, String name) {
            super(breed);
            this.name = name;
        }
        @Override
        public void moveAnimal(int distance) {
            System.out.println(" dog moves " + distance);
        }
        @Override
        public String toString() {
            return super.toString() + " Dog's name is : " + name ;
        }
        @Override
        public void greetOwner() {
            System.out.println(getClass().getSimpleName() + " wags its tail and licks your face");
        }
    }

