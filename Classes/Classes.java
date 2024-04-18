class Animal{
    String name = "Animal";
    public void makeSound(){
        System.out.println("Animal makes sound!");
    }
}

class Dog{
    String name = "Dog";
    public void makeSound(){
        System.out.println("Dog barks!");
    }
}

class Cat{
    String name = "Cat";
    public void makeSound(){
        System.out.println("Cat meows!");
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
    }
}