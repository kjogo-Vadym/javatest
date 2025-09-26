
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cities {

        public  static void main(String[] args) {
            List<String> cities = new ArrayList<>(Arrays.asList(
                    "Lviv"
            ));
            cities.add("Kyiv");
            System.out.println("Список городов");
            for (String city : cities) {
                System.out.println(city);
            }
        }
    }


