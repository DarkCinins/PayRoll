import java.util.*;

/**
 * Created by alunoic on 24/08/18.
 */
public class Exceptions
{
    private int tryingCatchInt()
    {
        int option;
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                option = input.nextInt();
                return option;
            } catch (InputMismatchException e) {
                System.out.printf("Digite apenas inteiros.%n%n");
                input.nextLine();
            }
        }
    }
}
