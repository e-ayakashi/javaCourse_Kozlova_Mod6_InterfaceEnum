import java.time.LocalDate;

public class Client extends Person implements SeasonHandler, Printable {
    private String status;

    Client(String s, LocalDate bDay, String n, String c) {
        super(bDay, n, c);
        status = s;
    }

    @Override
    public String getColor(int month) {
        if (month >= 1 && month < 4) {
            return SeasonColor.Winter.getColor();
        }
        if (month >= 4 && month < 6) {
            return SeasonColor.Spring.getColor();
        }
        if (month >= 6 && month < 9) {
            return SeasonColor.Summer.getColor();
        }
        if (month >= 9 && month <= 12) {
            return SeasonColor.Autumn.getColor();
        }
        return null;
    }


        @Override
        public String printFields () {
            return "Профайл клиента:"+"\nСтатус: " + status+"\nИмя: " + super.getName()+"\nВозраст: " + super.getAge();
        }
}
