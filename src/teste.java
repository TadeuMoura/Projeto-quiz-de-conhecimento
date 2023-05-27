public class teste {
    public static void main(String[] args) {
        // Códigos de escape ANSI para alterar a cor da fonte para vermelho
        String redColor = "\u001B[31m";
        String resetColor = "\u001B[0m";

        // Exemplo de uso
        System.out.println(redColor + "Texto em vermelho");
        
        System.out.println(resetColor + "Texto normal");

        // Coloque o código que você deseja executar a seguir
    }
}