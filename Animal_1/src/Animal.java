public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " ест.");
    }

    public void makeSound() {
        System.out.println("Животное издает какой-то звук");
    }
}
