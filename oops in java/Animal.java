class Animal{
    void eat(){
        System.out.println("eating");
    }
}
class Dog extends Animal
{
    void bark(){
        System.out.println("barking");
    }
}
class puppy extends Dog{
    void weep(){
        System.out.println("weeping");
    }
}
class TestInheritance{
    public static void main(String args[]){
        Dog d = new Dog();
        puppy p = new puppy();
        d.bark();
        d.eat();
        p.weep();
    }
}