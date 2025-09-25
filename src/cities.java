import java.util.ArrayList;

public class cities {

        public  static void main(String[] args) {
            ArrayList<String> cities = new ArrayList<>();
            cities.add("Киев");
            cities.add("Lviv");
            cities.add("Kremenchuck");
            cities.add("Madrid");
            System.out.println("Список городов");
            for (String city : cities) {
                System.out.println(city);
            }
        }
    }


