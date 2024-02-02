public class Animal {
    public int age;
    public String gender;

    public boolean isMammal() {
        System.out.println("This is a public method isMammal() from class Animal");
        return true;
    }

    public void mate() {
        System.out.println("This is a public method mate() from class Animal");
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Fish myFish = new Fish();
        Zebra myZebra = new Zebra();

        myAnimal.isMammal();
        myAnimal.mate();
        myZebra.run();
        myFish.eat();
    }
}

class Fish extends Animal {

    private int sizeInFeet;

    public void setSizeInFeet(int size) {
        this.sizeInFeet = 10;

    }

    public int getSizeInFeet() {
        return this.sizeInFeet;
    }

    private void canEat() {
        System.out.println("This is a private method canEat() from class Fish");
    }

    public void eat() {
        canEat();
    }
}

class Zebra extends Animal {
    public boolean is_wild;

    public void run() {
        System.out.println("This is a public method run() from class Zebra");
    }
}