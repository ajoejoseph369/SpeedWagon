class Animal{
    String name = "Animal";
    public void makeSound(){
        System.out.println("Animal makes sound!");
    }
    public void food(){
        System.out.println("Has food!");
    }
}

class Dog{
    String name = "Dog";
    public void makeSound(){
        System.out.println("Dog barks!");
    }
    public void food(){
        System.out.println("Has Pedigree!");
    }
}

class Cat{
    String name = "Cat";
    public void makeSound(){
        System.out.println("Cat meows!");
    }
    public void food(){
        System.out.println("Has Whiskas!");
    }
}

class Classes{
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

    }
}