public class Designer extends Employee {
    private String tool;

    public Designer(String name, int id, String tool) {
        super(name, id);
        this.tool = tool;
    }

    @Override // Аннотация, которая говорит компилятору: "Я специально переписываю этот метод"
    public void work() {
        System.out.println(getName() + " создает дизайн интерфейса");
    }
}
