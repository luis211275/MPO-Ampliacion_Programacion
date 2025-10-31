import java.util.InputMismatchException;
import java.util.Scanner;
public class MyScanner {
    private static Scanner sc;

    public MyScanner() {
        sc = new Scanner(System.in);
    }
    public int pedirNumero(String mns) {
        int n = -1;
        boolean flag = true;
        while (flag) {
            try {
                System.out.println(mns);
                n = sc.nextInt();
                sc.nextLine();
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("Eso no es número!");
                sc.nextLine();
            }
        }
        return n;
    }
}
