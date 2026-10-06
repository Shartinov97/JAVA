public class Cat extends Animal {
    private int livesLeft = 9;


    public Cat(String name, int livesLeft) {
        super(name);
        this.livesLeft = livesLeft;
    }

    public int getLivesLeft() {
        return livesLeft;
    }

    public void meow() {
        System.out.println(name + " говорит: Мяу!");
    }
    @Override
    public void makeSound(){
        System.out.println("Мяу!");
    }
}
