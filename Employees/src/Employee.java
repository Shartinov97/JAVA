public class Employee {
    // Общие поля для всех сотрудников
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Общий метод
    public void work() {
        System.out.println("Сотрудник " + name + " выполняет рабочие задачи.");
    }

    public String getName() {
        return name;
    }
}
