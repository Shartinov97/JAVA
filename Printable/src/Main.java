import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Printable>printables = new ArrayList<>();

        printables.add(new Book("book1"));
        printables.add(new Book("book2"));
        printables.add(new Book("book3"));

        for (Printable printable : printables){
            printable.print();
        }
    }
}
