import java.util.Scanner;

public class Main_App2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Want set Current Speed of Moutain Bicycle ? ( yes / no )");
        String status = "", choice = "";
        int newSpeed2 = 10;
        int gear = 2;
        Moutain_Bicycle B = new Moutain_Bicycle(newSpeed2, 5, 5, "Moutain Bicycle");

        choice = input.next().toLowerCase();
        if (choice.equals("yes")) {
            B.ShowBicycleData();
            System.out.println("User new Current Speed : ");
            newSpeed2 = input.nextInt();

        } else if (choice.equals("no")) {
            B.ShowBicycleData();

        } else {
            System.out.println("Wrong input!!");
        } // --------------end if----------------

        System.out.println("Want set Gear of Moutain Bicycle ? ( yes / no )");

        choice = input.next().toLowerCase();
        if (choice.equals("yes")) {
            B.ShowBicycleData();
            System.out.println("User new gear : ");
            gear = input.nextInt();
            B.gearTOspeed(2 * gear);

        } else if (choice.equals("no")) {
            B.gearTOspeed(gear);
            B.ShowBicycleData();

        } // --------------end if----------------

        // B.ShowBicycleData();
        while (!status.equals("quit")) {

            System.out.print("User input : ");
            status = input.next();
            B.choice(status);
            if (B.getNum() > 99 || B.getNum() < 0) {
                System.out.println("Out of lenght...");
                break;
            }
            // System.out.println(A.getNum());
        } // ------------end while-----------------

        input.close();
    }
}