import java.util.Scanner;
import java.util.Random;

public class App {
    //VARIÁVEIS GLOBAIS
    static Scanner resposta = new Scanner(System.in);
    static int pontos = 0;
    
    //QUESTÕES
    static String[][] questoes = {

        {"Qual o nome do cantor e dançarino Naldo?", 
        "A)Arnaldo\nB)Ronaldo\nC)Reinaldo\nD)Naldo",
        "B",
        "0"},

        {"No seriado 'El Chavo del Ocho', mais conhecido como Chaves aqui no Brasil, a personagem 'Dona Clotilde' foi apelidada pelas crianças como a 'Bruxa do ...'",
        "A)71\nB)91\nC)51\nD)361",
        "A",
        "0"},

        {"Qual o nome do Super Choque?",
        "A)Vurgil Hawkins\nB)Vurgil Hawkins Ovid\nC)Willian Hawkins\nD)Virgil Ovid Hawkins",
        "D",
        "0"}
    };

    //PRINCIPAL
    public static void main(String[] args) throws Exception {


        Thread.sleep(10000);
        System.out.print("\033[H\033[2J");
        Thread.sleep(1000);
        String cumprimento = " ___ ___              ___ ___\n"+
                             "|       |  |         |       |   |\n"+
                             "|       |  |         |___ ___|   |\n"+
                             "|       |  |	     |       |   |\n"+
                             "|___ ___|  |___ ___  |       |   0";
        digitarLetraPorLetra(cumprimento, 1);

        Thread.sleep(500);
        System.out.println("");
        digitarLetraPorLetra("Seja bem-vindo ao Quiz do conhecimento.",10);
        Thread.sleep(2000);
        digitarLetraPorLetra("Não precisa provar nada, só tu responder certo e seguir feliz.",10);
        Thread.sleep(3000);
        System.out.println("Mesmo que seja na base do chute ;D");
        Thread.sleep(1000);
        System.out.println("ENFIM!!!!!!");
        Thread.sleep(1000);
        digitarLetraPorLetra("Bora começar a diversão ÒuÓ!!!!", 10);
        Thread.sleep(2000);
        System.out.println("Ou não.");
        Thread.sleep(1000);
        
        

        //FAZEDOR DE QUESTÃO
        String simOuNao = "";
        while (simOuNao.equals("S")){
            for (int i = 0; i < questoes.length; i++ ){
                System.out.print("\033[H\033[2J");
                questSele();

                if (i == 0){
                    digitarLetraPorLetra("Aliás esqueci de mencionar mas existe um sistema de pontuação", 20);
                    Thread.sleep(1000);
                    digitarLetraPorLetra("Cada questão lhe dá um total de 10 pontos qunando corretas e 1 quando erradas", 20);
                    Thread.sleep(500);
                    if(pontos == 1){
                        digitarLetraPorLetra("E pelo visto você não começou muito... bem...", 10);
                        Thread.sleep(1000);
                        digitarLetraPorLetra("Mas fica tranquilo, com certeza tudo vai pio-", 10);
                        Thread.sleep(100);
                        System.out.println("DIGO!");
                        Thread.sleep(100);
                        System.out.println("DIGO!");
                        Thread.sleep(200);
                        digitarLetraPorLetra("Melhorar :D, vai melhorar :D",10);
                    } else if (pontos == 10){
                        digitarLetraPorLetra("E aparentemente você já começou acertanto!! Quanto conhecimento!!", 10);
                        System.out.println("Ou sorte.");
                        digitarLetraPorLetra("Devo aumentar a dificuldade?", i);
                        digitarLetraPorLetra("Brinadeiras a parte. Tudo dependerá da questão que você sortear aleatoriamente.", 10);
                    }
                    Thread.sleep(1000);
                    System.out.println("ENFIM");
                    digitarLetraPorLetra("Partiu próxima questão.", 10);
                    Thread.sleep(1000);
                } else {
                    System.out.println("Próxima pergunta.");
                }
            }

            System.out.println("Quer jogar de novo?");
            System.out.println("S para SIM!!! e n para não.");
            simOuNao = resposta.next().toUpperCase();
            if (simOuNao.equals("S"));{
                for(int i = 0; i < questoes.length; i++){
                    questoes[i][3] = "0";
                }
            }
        }
    }

    //------------------------------------------------------------------
    //FUNÇÕES

    //SELETOR DE QUESTÕES
    public static void questSele() throws InterruptedException{
        
        System.out.println("CARREGANDO QUESTÃO");
        Thread.sleep(2000);
        System.out.print(" . ");
        Thread.sleep(1000);
        System.out.print(" . ");
        Thread.sleep(1000);
        System.out.print(" . ");
        Thread.sleep(1000);
        
        System.out.println(" ");       
        System.out.print("\033[H\033[2J");

        int numeroQuestao = checadorDeQuestoes();
        digitarLetraPorLetra(questoes[numeroQuestao][0],10);
        digitarLetraPorLetra(questoes[numeroQuestao][1],5);

        anlsDeAlternativa(numeroQuestao);
        
    }

    //DIGITA LETRA POR LETRA CONFORME DELAY SELECIONADO.
    public static void digitarLetraPorLetra(String texto, int delay) throws InterruptedException {
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
            Thread.sleep(delay);
        }
        System.out.println();
    }

    //CHECADOR DE QUESTÕES
    public static int checadorDeQuestoes(){
        int i = 0;
        int nRand = 0;
        while (i < 1){
            Random rand = new Random();
            int numeroAletorio = rand.nextInt(questoes.length);
            String verifUso = questoes[numeroAletorio][3];
            
            if(verifUso.equals("1")){
                continue;
            }
            questoes[numeroAletorio][3] = "1";
            nRand = numeroAletorio;
            i = 1;
            
        }
        return nRand;
    }

    //ALTERNATIVA
    public static void anlsDeAlternativa(int nquest) throws InterruptedException{
        String resp = "";
        boolean validador = false;
        int repetidor = 0;
        while (validador == false) {
            resp = resposta.next().toUpperCase();
            if(resp.equals("A") || resp.equals("B") || resp.equals("C") || resp.equals("D")) {
                validador = true;
                repetidor = 0;
            } else {
                repetidor = repetidor + 1;
                switch (repetidor){
                    case 1:
                        System.out.println("Digite a letra A, B, C ou D para selecionar sua alternativa.");
                        break;
                    case 2:
                        System.out.println("É só digitar A, B, C ou D para escolher a alternativa :).");
                        break;
                    case 3:
                        System.out.println("Minha nobre pessoa, é só digitar A, B, C ou D...");
                        break;
                    case 4:
                        System.out.println("A de amor, B de baixinho, C de coração, D de docinho, E de ......... pera não tem E, mas digita aí, ABCD, uma destas 4 :D.");
                        break;
                    case 5:
                        System.out.println("É brincadeira né??");
                        break;
                    case 6:
                        System.out.println("Desisto");
                        break;
                    default:
                        System.out.println("...");

                }
            }
        }

        if (resp.trim().equals(questoes[nquest][2])){
            System.out.print("\033[H\033[2J");
            digitarLetraPorLetra("A reposta está EEEEEEEEEEEEEEEEEEEEEEEEEXATA!!!!!",100);
            pontos = pontos + 10;
            System.out.println("Pontuação: " + pontos);
            Thread.sleep(2000);
        } else {

            digitarLetraPorLetra("A reposta está EEEEEEEEEEEEEEEEEEEEEEEEErrada :(",100);
            pontos = pontos + 1;
            System.out.println("Pontuação: " + pontos);
            Thread.sleep(2000);
        }
    }


    
}