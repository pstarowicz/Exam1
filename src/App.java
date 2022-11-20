import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean whileWorking=true;
        Scanner scaner = new Scanner(System.in);
        while(whileWorking) {
            GUI.showMenu();
            switch (scaner.nextLine()){
                case "1":
                    GUI.showDialog();
                    GUI.countDiff();
                    break;
                case "2":
                    whileWorking=false;
                    break;
                default:
                    System.out.println("Zły numer!");
                    break;
            }
        }
    }
}
