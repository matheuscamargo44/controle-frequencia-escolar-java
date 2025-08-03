import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n--- Controle de Frequência Escolar ---");
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Marcar presença");
            System.out.println("3. Consultar presença de aluno");
            System.out.println("4. Relatório geral");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case 1:
            }
        }while(opcao != 0);
    }
}