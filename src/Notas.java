import java.util.Scanner;

//As classes em Java são escritas em PascalCase a primeira letra de cada palavra é maiúscula. 
public class Notas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Abrindo o scanner para ler o teclado
        int nota = scan.nextInt(); //Pode simplificar a variável nota assim:
        System.out.println("Nota: ");

        while (nota < 0 || nota > 10){
            System.out.println("Nota inválida! Digite novamente.");
            nota = scan.nextInt();
        }
        //Acredito que eu esqueci de explicar, mas é boa prática fechar o scan.
        //Quando você abrir ele e você não precisar mais usar, é só fechar.
        scan.close();
    }
}
