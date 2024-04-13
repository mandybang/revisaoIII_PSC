import java.util.Scanner;

public class ExercicioE9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número para calcular sua tabuada: ");
        int num = input.nextInt();

        for (int i=0; i<=10;i++) {
            int tabuada = num * i;
            System.out.println(i + "x" + num + "=" + tabuada);
        }

        input.close();
    }
    
}
