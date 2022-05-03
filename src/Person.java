import java.time.LocalDate;
import java.time.Period;

public class Person{
    private String name;
    private LocalDate birthday;
    private int age;
    private String company;

    Person (LocalDate bDay,String n, String c){
        birthday = bDay;
        name = n;
        company = c;
    }

    void setBirthday(LocalDate bDay) {
        birthday = bDay;
    }

    void setName(String n) {
        name = n;
    }

    void setCompany(String c) {
        company = c;
    }

    public String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return Period.between(birthday, LocalDate.now()).getYears();
    }
}
