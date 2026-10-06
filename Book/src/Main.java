public class Main {
    public static void main(String[] args){
        Book book = new Book("книга1",500);
        book.setTitle("книга2");
        book.setPageCount(1000);
        System.out.println(book.getTitle() + ", " + book.getPageCount());
    }
}
