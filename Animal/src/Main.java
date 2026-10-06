public class Main {
    public static void main(String[] args){
        Dog rex = new Dog("Рекс", "Овчарка");
        rex.eat();
        rex.bark();
        System.out.println("Порода: " + rex.getBreed());

        Cat cat = new Cat("Мурзик", 7);
        cat.eat();
        cat.meow();
        System.out.println("Количество жизний: " + cat.getLivesLeft());
    }
}
