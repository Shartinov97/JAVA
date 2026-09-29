public class Main {
    public static void main(String[] args) {
        Employee employee[] = new Employee[2];
        employee[0] = new Developer("Иван", 101, "Java");
        employee[1] = new Designer("Анна", 102, "Photoshop");

        for (Employee employee1 : employee){
            employee1.work();
        }
    }
}
