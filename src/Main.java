import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Car, CarData > map = new HashMap<>();
        map.put(new Car(1234,2005), new CarData (2010,"BMW",30000,"Black"));
        map.put(new Car(5678,2009), new CarData (2014,"Camry",20000,"White"));
        map.put(new Car(2956,2001), new CarData (2003,"Mers124",120000,"Blue"));
        System.out.println(map.entrySet());

    }
}