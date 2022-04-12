import java.util.Scanner;

@FunctionalInterface
interface Discriminant{
    double get_discriminant(double a, double b, double c);
}

public class Task1 {
    public static void main(String[] args) {
        Discriminant dic = (a, b, c) -> Math.sqrt(b * b - 4 * a * c);
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println(dic.get_discriminant(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
    }
}
