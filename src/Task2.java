import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> AL = new ArrayList<Integer>();
        Random rnd = new Random();

        for (int i = 0; i < 15; i++) {
            AL.add(rnd.nextInt() % 100);
        }

        System.out.println(AL);
        int cnt = (int)(AL.stream().filter((n) -> (n % 2) == 0)).count();
        System.out.println(cnt);
    }
}
