


//vc conseguiu efetuar pull

//* # INFORMATIVO # *// 
//Métodos são iniciados com ##
//* # ----------- # *//

package com.mycompany.projetointegrador;

import java.util.Scanner;
import java.util.Random;

import com.mycompany.projetointegrador.Quest;

public class App {
    // VARIÁVEIS GLOBAIS
    static Scanner resposta = new Scanner(System.in);
    
    static int pontos = 0;
    static int chancesDePular = 3;
    static int chancesDeEliminar = 3;
    static int carro = 0;
   
    
    // VARIÁVEIS DE DELAY
    static int delay5 = 5;
    static int delay10 = 10;

    //CORES
    static String corVermelho   = "\u001B[31m";
    static String corVerde      = "\u001B[32m";
    static String corAmarela    = "\u001B[33m";
    static String corAzul       = "\u001B[34m";
    static String corMagenta    = "\u001B[35m";
    static String corCiano      = "\u001B[36m";
    static String corBranco     = "\u001B[37m";
    
    static String[][] questoes;
    
    static {
        questoes = Quest.Quest();
    }


    // PRINCIPAL
    public static void main(String[] args) throws Exception {
        
    
        System.out.print("\033[H\033[2J");
        Thread.sleep(2000);
        System.out.println(corVermelho + "Press ENTER to START" + corBranco);
        resposta.nextLine();

        System.out.print("\033[H\033[2J");

        char[] animationChars = {'|', '/', '-', '\\'};
        int totalIterations = 90;

        for (int i = 0; i <= totalIterations; i++) {
            int percent = (i * 100) / totalIterations;
            System.out.print(" Carregando " + animationChars[i % 4] + " " + percent + "%\r");
            Thread.sleep(50);
        }
        System.out.println("");
        System.out.print(corVerde + " COMPLETED" + corVermelho + "\r");
        Thread.sleep(2000);

        for (int i = 0; i < 10; i++){
                Thread.sleep(delay10*3);
                System.out.print(" %$#f%?v°/°?/$)(&¨?°/E#@#@?/eq)                 \r");
                Thread.sleep(delay10*3);
                System.out.print(" 1110100 1110010 1101111 1101100 1100101 1101001\r");
                Thread.sleep(delay10*3);
                System.out.print(" CADÊ A TAMPA????                               \r");
        }


        System.out.print("\033[H\033[2J");
        Thread.sleep(1000);
        String cumprimento = " ___ ___              ___ ___\n" +
                "|       |  |         |       |   |\n" +
                "|       |  |         |___ ___|   |\n" +
                "|       |  |         |       |   |\n" +
                "|___ ___|  |___ ___  |       |   0";
        Digitalizador(corAzul + cumprimento + corBranco, 1);

        Thread.sleep(500);
        System.out.println("");
        Digitalizador("Seja bem-vindo ao Quiz do conhecimento.", delay10);
        resposta.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.println("Não precisa provar nada, só tu responder certo e seguir feliz.");
        resposta.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.println("Mesmo que seja na base do chute ;D");
        resposta.nextLine();
        System.out.print("\033[H\033[2J");
        resposta.nextLine();
        System.out.println("Bora começar a diversão!");
        resposta.nextLine();
        Thread.sleep(1500);

        // FAZEDOR DE QUESTÃO
        String simOuNao = "S";

        // REPETIÇÃO QUE SÓ É TERMINADA QUANDO A PESSOA NÃO QUISER JOGAR DENOVO
        while (simOuNao.equals("S")) {
            for (int i = 0; i < 20; i++) {
                  
                System.out.print("\033[H\033[2J");

                QuestSele();

                // ALGUNS IF INTERATIVOS
                if (i == 0) {
                    System.out.println("");
                    Digitalizador("Aliás esqueci de mencionar, mas existe um sistema de pontuação", 5);
                    System.out.println("");
                    Digitalizador("Cada questão lhe dá um total de 10 pontos quando corretas e 1 quando erradas", 5);


                    if (pontos == 1) {
                        Digitalizador("E pelo visto você não começou muito... bem...", delay10);
                        Thread.sleep(1000);
                        Digitalizador("Mas fica tranquilo, com certeza tudo vai piorar", delay10);
                        Thread.sleep(500);
                    } else if (pontos == 10) {
                        Digitalizador("E aparentemente você já começou acertanto!! Quanto conhecimento!!", 10);
                        System.out.println("Ou sorte.");
                        Digitalizador("Devo aumentar a dificuldade?", delay10);
                        Thread.sleep(500);
                        Digitalizador("Brincadeiras a parte. Tudo dependerá da questão que você sortear aleatoriamente.",delay10);
                    }
                    Thread.sleep(1000);


                    System.out.println("ENFIM");
                    Thread.sleep(1000);
                } else {

                    if(pontos == 50 && i == 5) {
                        System.out.println("Tá acertando todas em, se continuar assim vai ganhar um carro no final do jogo."); 
                            carro = 1;  
                    } else if(pontos <= 30 && i == 8) {
                        System.out.println("Tempos difíceis em campeão, fé que até o final do quiz você da a volta por cima!!");   
                    } 

                    else if(pontos == 200 && i == 20) {
                        System.out.println("Parabéns você gabaritou o nosso Quiz!!!, se a produção deixar nós te daremos uma medalha!");   
                    }

                    if(pontos == 200 && i == 20 && carro == 1) {
                        System.out.println("Sabe aquele carro que eu te prometi no começo do jogo?, então... acabei de bater ele no poste rs.");   
                    }

                    if(pontos > 100) {
                        System.out.println("Mais que 100 pontos parabéns!!! ");   
                    }
                }
                
                    Digitalizador("Próxima questão", delay10);
                    System.out.println("");
                    Thread.sleep(2000);
                }
            }

            Digitalizador("Quer jogar de novo?", delay10);
            Thread.sleep(500);
            System.out.println("S para SIM!!! e n para não.");
            simOuNao = resposta.next().toUpperCase();
            while (!simOuNao.equals("S") && !simOuNao.equals("N")){
                System.out.println("Digite para sim e n para não.");
                simOuNao = resposta.next().toUpperCase();
            }
            if (simOuNao.equals("S")) {
            for (int i = 0; i < questoes.length; i++) {
                questoes[i][6] = "0";
            }
            pontos = 0;
            carro = 0;
            }
        }
    

    // ------------------------------------------------------------------
    // MÉTODOS

    // ## SELETOR DE QUESTÕES
    public static void QuestSele() throws InterruptedException {

        // TELA DE LOADING DA QUESTÃO
        System.out.println(corCiano + "CARREGANDO QUESTÃO" + corAzul);
        Thread.sleep(2000);
        System.out.print(" . ");
        Thread.sleep(1000);
        System.out.print(" . ");
        Thread.sleep(1000);
        System.out.print(" . "  + corBranco);
        Thread.sleep(1000);

        System.out.println(" ");
        System.out.print("\033[H\033[2J");

        // USA O CHECADOR DE QUESTÕES PARA PEGAR UM NOME ALEATÓRIO
        int numeroQuestao = ChecadorDeQuestoes();

        // MOSTRANDO A QUESTÃO [0] E AS ALTERNATIVAS [1][2][3][4]
        Digitalizador(corAmarela + questoes[numeroQuestao][0] + corBranco, delay10);
        System.out.println("");
        Digitalizador(questoes[numeroQuestao][1], delay5);
        Digitalizador(questoes[numeroQuestao][2], delay5);
        Digitalizador(questoes[numeroQuestao][3], delay5);
        Digitalizador(questoes[numeroQuestao][4], delay5);

        if (chancesDeEliminar > 0) {
                System.out.println("");
                Digitalizador("Você pode eliminar duas das alternativas " + chancesDeEliminar + " vez(es), basta digitar T.", 5);
        }

        if (chancesDePular > 0) {
                Digitalizador("Você pode eliminar duas das alternativas " + chancesDeEliminar + " vez(es), basta digitar T.", 5);
        }

        
        // VERIFICA A DIGITAÇÃO DA ALTERNATIVA
        AnlsDeAlternativa(numeroQuestao);

    }

    // ## DIGITALIZADOR.
    public static void Digitalizador(String texto, int delay) throws InterruptedException {
        // DIGITA LETRA POR LETRA COM UM DELAY EM CADA
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
            Thread.sleep(delay);
        }
        System.out.println();
    }

    // ## CHECADOR DE QUESTÕES 
    public static int ChecadorDeQuestoes() {
        int i = 0;

        // VALOR QUE SERÁ RETORNADO
        int nRand = 0;

        // REPETI ATÉ O MOMENTO QUE FOR UM NÚMERO MAIOR QUE ZERO
        while (i < 1) {
            Random rand = new Random();

            // ARMAZENA UM NÚMERO ALEATÓRIO
            int numeroAletorio = rand.nextInt(questoes.length);
            String verifUso = questoes[numeroAletorio][6];

            // VERIFICA SE A QUESTÃO FOI OU NÃO USADA
            // USADA = 1; NÃO USADA = 0
            if (verifUso.equals("1")) {
                continue;
            }

            // ARMAZENA O VALOR DA QUESTÃO NO RETORNO
            questoes[numeroAletorio][6] = "1";
            nRand = numeroAletorio;
            i = 1;

        }
        return nRand;
    }

    // ## ALTERNATIVA
    public static void AnlsDeAlternativa(int nquest) throws InterruptedException {

        // RESPOSTA VAZIA
        String resp = "";

        // SERVIRÁ PARA SAIR DO REPETIDOR SE O VALOR FOR VERDADEIRO
        boolean validador = false;

        // DEFINI QUAL RESPOSTA MOSTRAR SE A PESSOA DIGITAR ERRADO UMA OU MAIS VEZES
        int repetidor = 0;

        int numeroAlternativa = 0;

        // SAI DA REPETIÇÃO QUANDO O VALIDADOR FOR VERDADEIRO
        while (validador == false) {
            resp = resposta.next().toUpperCase();
            
            if (resp.equals("T") && chancesDeEliminar > 0) {
                EliminarAlternativas(nquest);
                resp = resposta.next().toUpperCase();
            }

            // VALIDA SE A PESSOA DIGITAR A, B, C OU D
            if (resp.equals("A") || resp.equals("B") || resp.equals("C") || resp.equals("D")) {
                validador = true;
                
                switch (resp){
                    case "A":
                        numeroAlternativa = 1;
                        break;
                    case "B":
                        numeroAlternativa = 2;
                        break;
                    case "C":
                        numeroAlternativa = 3;
                        break;
                    case "D":
                        numeroAlternativa = 4;
                        break;
                };
                repetidor = 0;
            } else {

                // MOSTRARÁ UMA DAS RESPOSTAS DO SWITCH CONFORME O VALOR DO REPETIDOR
                repetidor = repetidor + 1;
                switch (repetidor) {
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
                        System.out.println(
                                "A de amor, B de baixinho, C de coração, D de docinho, E de ......... pera não tem E, mas digita aí, ABCD, uma destas 4 :D.");
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

        // SE A RESPOSTA ESTIVER CORRETA
        if (numeroAlternativa ==  Integer.parseInt(questoes[nquest][5])) {
            System.out.print("\033[H\033[2J");
            Digitalizador("A reposta está EEEEEEEEEEEEEEEEEEEEEEEEEXATA!!!!!", 80);
            pontos = pontos + 10;
            System.out.println("Pontuação: " + pontos);
            Thread.sleep(2000);
        } else {

            // SE A RESPOSTA ESTIVER ERRADA
            System.out.print("\033[H\033[2J");
            Digitalizador("A reposta está EEEEEEEEEEEEEEEEEEEEEEEEErrada :(", 80);
            pontos = pontos + 1;
            System.out.println("Pontuação: " + pontos);
            Thread.sleep(2000);
        }
    }

    // ## PULA QUESTÃO

    // ## ELIMINA ALTERNATIVA
    public static void EliminarAlternativas(int nQuest) throws InterruptedException {
        Random aleatorio = new Random();
       
        // Array com as letras das alternativas
        String[] alternativas = {"A", "B", "C", "D"};
 
        // Seleciona a alternativa correta
        int alternativaCorreta = Integer.parseInt(questoes[nQuest][5]);

        // Remove duas alternativas incorretas aleatoriamente
        
        int alternativasRemovidas = 0;
        while (alternativasRemovidas < 2) {
            //int alternativaAleatoria = aleatorio.nextInt(4);
            //int index = alternativaAleatoria;
            int nAleatorio = aleatorio.nextInt(4);
            if (nAleatorio != alternativaCorreta-1 && alternativas[nAleatorio] != null) {
                alternativas[nAleatorio] = null;
                alternativasRemovidas++;
            }
        }

        // Exibe as alternativas disponíveis
        Digitalizador(questoes[nQuest][0], delay10);
        //for (String alternativa : alternativas) 
        for (int i = 0; i < alternativas.length; i++) {
            if (alternativas[i] != null) {
                Digitalizador(questoes[nQuest][i+1], delay10);
            }
        }
        chancesDeEliminar--;
    }
}
