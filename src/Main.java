import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String digitado = scanner.next().toLowerCase();

        if (digitado.length() == 1 && Character.isLetter(digitado.charAt(0))){
            char letra = digitado.charAt(0);

            if ( letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                System.out.println("Você digitou a voga: " + letra);
            } else {
                System.out.println("Você não digitou uma vogal!");
            }

        } else {
            System.out.println("""
                    ------------------------------------------
                    
                    Entrada Invalida!
                    
                    ------------------------------------------
                    
                    Você tentou digitar mais de uma letra, tente novamente!
                    """);
        }

        scanner.close();
    }
}

