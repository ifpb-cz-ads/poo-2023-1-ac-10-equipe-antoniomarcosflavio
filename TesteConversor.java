import java.util.Scanner;

public class TesteConversor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numeroParaConversao;
        System.out.println("Informe um numero para converter: ");
        numeroParaConversao = entrada.nextDouble();
        int choice;
        System.out.println("Escolha entre as opções de conversão:");
        System.out.println("1 - Converter de Metros Quadrados para Pes Quadrados:");
        System.out.println("2 - Converter de Pes Quadrados para Centimetros Quadrados:");
        System.out.println("3 - Converter de Milhas Quadradas para Acres:");
        System.out.println("4 - Converter de Acres para Pes Quadrados:");
        choice = entrada.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Resultado: " + ConversaoDeUnidadesDeArea.metrosParaPes(numeroParaConversao));
                System.out.println();
            }
            case 2 -> {
                System.out.println("Resultado: " + ConversaoDeUnidadesDeArea.peParaCentimetro(numeroParaConversao));
                System.out.println();
            }
            case 3 -> {
                System.out.println("Resultado: " + ConversaoDeUnidadesDeArea.milhaParaAcres(numeroParaConversao));
                System.out.println();
            }
            case 4 -> {
                System.out.println("Resultado: " + ConversaoDeUnidadesDeArea.acreParaPes(numeroParaConversao));
                System.out.println();
            }
            default -> System.out.println("Opção Inválida");
        }
    }
}