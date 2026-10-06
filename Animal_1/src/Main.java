public class Main {
    public static void main(String[] args){
        Dog rex = new Dog("Рекс", "Овчарка");
        Cat cat = new Cat("Мурзик", 7);

        Animal[] zoo = {rex, cat};

        for(Animal animal : zoo){
            animal.makeSound();
        }
    }
}
