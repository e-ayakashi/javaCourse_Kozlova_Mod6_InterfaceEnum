import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("VIP", LocalDate.parse("1963-06-09"), "Captain Jack Sparrow", null);
        System.out.println(client.printFields());
        System.out.println("Цвет сезона (client): " + client.getColor(LocalDate.now().getMonthValue()));

        Employee employee = new Employee(345, LocalDate.parse("1989-12-02"), "Ivan Ivanov", "Horns&Hooves");
        System.out.println("\n"+employee.printFields());
        System.out.println("Цвет сезона (employee): " + employee.getColor(LocalDate.now().getMonthValue()));

    }
}
