
public class Bicycle_Data {
    int current_Speed, increase, decrease;
    String type;

    public Bicycle_Data() {

    }

    public Bicycle_Data(int current_Speed, int increase, int decrease, String type) {
        this.current_Speed = current_Speed;
        this.increase = increase;
        this.decrease = decrease;
        this.type = type;

    }

    public void ShowBicycleData() {
        System.out.println("\n" + type + " current speed : " + current_Speed + " km/hr");

    }
}
