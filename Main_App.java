import java.util.Scanner;

public class Main_App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice = "", status = "";

        int newSpeed = 10;

        Normal_Bicycle A = new Normal_Bicycle(newSpeed, 5, 5, "Normal Bicycle");

        System.out.println("Want set Current Speed of Normal Bicycle ? ( yes / no )");

        choice = input.next().toLowerCase();
        if (choice.equals("yes")) {
            A.ShowBicycleData();
            System.out.println("User new Current Speed : ");
            newSpeed = input.nextInt();

        } else if (choice.equals("no")) {
            A.ShowBicycleData();

        } else {
            System.out.println("Wrong input!!");
        } // --------------end if----------------

        // A.ShowBicycleData();

        while (!status.equals("quit")) {

            System.out.print("User input : ");
            status = input.next();
            A.choice(status);
            if (A.getNum() > 99 || A.getNum() < 0) {
                System.out.println("Out of lenght...");
                break;
            } //
              // System.out.println(A.getNum());
        } // ------------end while-----------------

        input.close();
    }

}