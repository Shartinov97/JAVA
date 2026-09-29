// Ключевое слово extends означает "наследует от"
public class Developer extends Employee {
    // Специфичное поле только для разработчика
    private String mainLanguage;

    // Конструктор разработчика
    public Developer(String name, int id, String mainLanguage) {
        // Вызываем конструктор родителя, чтобы инициализировать общие поля
        super(name, id);
        this.mainLanguage = mainLanguage;
    }

    // Метод, специфичный только для разработчика
    public void writeCode() {
        System.out.println(getName() + " пишет код на языке " + mainLanguage);
    }

    @Override // Аннотация, которая говорит компилятору: "Я специально переписываю этот метод"
    public void work() {
        System.out.println(getName() + " пишет чистый и поддерживаемый код.");
    }
}