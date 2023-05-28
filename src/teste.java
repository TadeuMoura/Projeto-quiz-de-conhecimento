

public class teste {
    public static void main(String[] args) throws InterruptedException {
        char[] animationChars = {'|', '/', '-', '\\'};
        int totalIterations = 120;

        for (int i = 0; i <= totalIterations; i++) {
            int percent = (i * 100) / totalIterations;
            System.out.print("Carregando " + animationChars[i % 4] + " " + percent + "%\r");
            Thread.sleep(50);
        }
    }
}