import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GUI {

    private static List<Integer> list = new ArrayList<>();

    public static void showMenu(){
        System.out.println("1. Program");
        System.out.println("2. Wyjście");
    }
    public static void showDialog(){
        Scanner scaner = new Scanner(System.in);
        System.out.println("Podaj jabłka:");
        list.add(Integer.parseInt(scaner.nextLine()));
        System.out.println("Podaj ilość pomarańczy:");
        list.add(Integer.parseInt(scaner.nextLine()));
        System.out.println("Podaj ilość monet:");
        list.add(Integer.parseInt(scaner.nextLine()));
    }

    public static void countDiff(){
        int apple=list.get(0);
        int orange=list.get(1);
        int money=list.get(2);
        if(money==0){
            showResult(apple,orange,money);
        }
        else {
            for(int i=0; i<money; i++){
                if(apple<=orange){
                    apple++;
                }
                else{
                    orange++;
                }
            }
            showResult(apple,orange,money);
        }
    }

    private static void showResult(int apple, int orange, int money){
        System.out.println("Minimalna różnica: "+Math.abs(apple-orange));
        System.out.println("Jablka: "+apple);
        System.out.println("Pomarancze: "+orange);
    }
}
