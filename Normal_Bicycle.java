public class Normal_Bicycle extends Bicycle_Data {

    public Normal_Bicycle(int current_Speed, int increase, int decrease, String type) {
        this.current_Speed = current_Speed;
        this.increase = increase;
        this.decrease = decrease;
        this.type = type;

    }

    public void choice(String status) {

        if (status.equals("increase")) {
            this.current_Speed = current_Speed + increase;
            System.out.println(" \nBicycle speed got increase to : " + current_Speed
                    + " km/hr ( increase / break / quit )\n     from  : " + (current_Speed - decrease) + " km/hr ");

        } else if (status.equals("break")) {
            this.current_Speed = current_Speed - decrease;
            System.out.println(" \nBicycle speed has decrease to : " + current_Speed
                    + " km/hr ( increase / break / quit )\n     from  : " + (current_Speed + increase) + " km/hr ");

        } else if (status.equals("quit")) {
            System.out.println("End program.");

        } else {
            System.out.println("Wrong Input!!\n");
        }
    }

    public int getNum() {

        int c_speed = this.current_Speed;

        return c_speed;
    }

}
