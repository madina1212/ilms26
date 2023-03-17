public class Car {
    private int id;
    private int CarNumber;

    public Car(int id, int carNumber) {
        this.id = id;
        CarNumber = carNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCarNumber() {
        return CarNumber;
    }

    public void setCarNumber(int carNumber) {
        CarNumber = carNumber;
    }

    @Override
    public String toString() {
        return "Car: " +
                "id: " + id +
                "CarNumber: " + CarNumber;
    }
}
