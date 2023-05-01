import java.util.Random;

public class teste {
    public static void main (String[] args){
        Random rand = new Random();
        int numeroAletorio = rand.nextInt(20);
        numeroAletorio = numeroAletorio + 1;
        System.out.println(numeroAletorio);
    }
}
