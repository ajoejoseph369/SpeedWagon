class Animal{
    String name = "Animal";
    public void makeSound(){
        System.out.println("Animal makes sound!");
    }
    public void food(){
        System.out.println("Has food!");
    }
}

class Dog extends Animal{
    String name = "Dog";

    @Override
    public void makeSound(){
        System.out.println("Dog barks!");
    }

    @Override
    public void food(){
        System.out.println("Has Pedigree!");
    }
}

class Cat extends Dog{
    String name = "Cat";

    @Override
    public void makeSound(){
        System.out.println("Cat meows!");
    }

    @Override
    public void food(){
        System.out.println("Has Whiskas!");
    }
}

class Multilevel{
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();

        System.out.println(a.name);
        a.makeSound();
        System.out.println(d.name);
        d.makeSound();
        System.out.println(c.name);
        c.makeSound();

        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.food();
        cat.food();
        System.out.println(((Dog)dog).name);

    }
}