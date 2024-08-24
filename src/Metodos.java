import java.util.Random;

public class Metodos {
    // ------------------------------------------------------------------
    // VALORES GRÁFICOS +  QUESTÕES
    ValoresGraficosGlobais vlg = new ValoresGraficosGlobais();
    Questoes q = new Questoes();

    // ## SELETOR DE QUESTÕES
    public static void QuestSele() throws InterruptedException {
    
        //Caso a questão seja pulada
        int pulador = 1;
        while (pulador == 1) {
            // TELA DE LOADING DA QUESTÃO
            System.out.print("\033[H\033[2J");
            System.out.println(vlg.corCiano + "CARREGANDO QUESTÃO" + vlg.corAzul);
            Thread.sleep(2000);
            System.out.print(" . ");
            Thread.sleep(1000);
            System.out.print(" . ");
            Thread.sleep(1000);
            System.out.print(" . "  + vlg.corBranco);
            Thread.sleep(1000);

            System.out.println(" ");
            System.out.print("\033[H\033[2J");

            // USA O CHECADOR DE QUESTÕES PARA PEGAR UMA QUESTÃO ALEATÓRIA
            int numeroQuestao = ChecadorDeQuestoes();

            // MOSTRANDO A QUESTÃO [0] E AS ALTERNATIVAS [1][2][3][4]
            Digitalizador(vlg.corAmarela + q.questoes[numeroQuestao][0] + vlg.corBranco, vlg.delay10);
            System.out.println("");
            Digitalizador(q.questoes[numeroQuestao][1], vlg.delay5);
            Digitalizador(q.questoes[numeroQuestao][2], vlg.delay5);
            Digitalizador(q.questoes[numeroQuestao][3], vlg.delay5);
            Digitalizador(q.questoes[numeroQuestao][4], vlg.delay5);

            if (vlg.chancesDeEliminar > 0) {
                    System.out.println("");
                    Digitalizador("Você pode eliminar duas das alternativas " + vlg.chancesDeEliminar + " vez(es), basta digitar T.", 5);
            }

            if (vlg.chancesDePular > 0) {
                    Digitalizador("Você pode pular questões " + vlg.chancesDePular + " vez(es), basta digitar P.", 5);
            }

            // VERIFICA A DIGITAÇÃO DA ALTERNATIVA
            pulador = AnlsDeAlternativa(numeroQuestao);
        }
    }

    // ## DIGITALIZADOR.
    public void Digitalizador(String texto, int delay) throws InterruptedException {
        // DIGITA LETRA POR LETRA COM UM DELAY EM CADA
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
            Thread.sleep(delay);
        }
        System.out.println();
    }

    // ## CHECADOR DE QUESTÕES 
    public int ChecadorDeQuestoes() {
        int i = 0;

        // VALOR QUE SERÁ RETORNADO
        int nRand = 0;

        // REPETI ATÉ O MOMENTO QUE FOR UM NÚMERO MAIOR QUE ZERO
        while (i < 1) {
            Random rand = new Random();

            // ARMAZENA UM NÚMERO ALEATÓRIO
            int numeroAletorio = rand.nextInt(q.questoes.length);
            String verifUso = q.questoes[numeroAletorio][6];

            // VERIFICA SE A QUESTÃO FOI OU NÃO USADA
            // USADA = 1; NÃO USADA = 0
            if (verifUso.equals("1")) {
                continue;
            }

            // ARMAZENA O VALOR DA QUESTÃO NO RETORNO
            q.questoes[numeroAletorio][6] = "1";
            nRand = numeroAletorio;
            i = 1;

        }
        return nRand;
    }

    // ## ALTERNATIVA
    public int AnlsDeAlternativa(int nquest) throws InterruptedException {

        // RESPOSTA VAZIA
        String resp = "";

        // SERVIRÁ PARA SAIR DO REPETIDOR SE O VALOR FOR VERDADEIRO
        boolean validador = false;

        // DEFINI QUAL RESPOSTA MOSTRAR SE A PESSOA DIGITAR ERRADO UMA OU MAIS VEZES
        int repetidor = 0;
        int retorno = 0;
        int numeroAlternativa = 0;

        // SAI DA REPETIÇÃO QUANDO O VALIDADOR FOR VERDADEIRO
        while (validador == false) {
            resp = vlg.resposta.next().toUpperCase();
            
            if (resp.equals("T") && vlg.chancesDeEliminar > 0) {
                EliminarAlternativas(nquest);
                
                if (vlg.chancesDePular > 0) {
                    System.out.println("");
                    Digitalizador("Você pode pular questões " + vlg.chancesDePular + " vez(es), basta digitar P.", 5);
                }
                String palavra = "ABCDP";
                resp = vlg.resposta.next().toUpperCase();

                while (!palavra.contains(resp)){
                    Digitalizador("Digite uma das alternativas apresentadas.",vlg.delay10);
                    if (vlg.chancesDePular > 0) {
                        Digitalizador("Ou digite P caso queira pular a questão, você pode pular " + vlg.chancesDePular + " vez(es)", 5);
                        resp = vlg.resposta.next().toUpperCase();
                    }
                    
                }
            }
            
            if (resp.equals("P") && vlg.chancesDePular > 0){
                vlg.chancesDePular--;
                retorno = 1;
                return retorno;
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
        if (numeroAlternativa ==  Integer.parseInt(q.questoes[nquest][5])) {
            System.out.print("\033[H\033[2J");
            Digitalizador("A resposta está EEEEEEEEEEEEEEEEEEEEEEEEEXATA!!!!!", 100);
            vlg.pontos += 10;
            System.out.println("Pontuação: " + vlg.pontos);
            Thread.sleep(2000);
        } else {

            // SE A RESPOSTA ESTIVER ERRADA
            System.out.print("\033[H\033[2J");
            Digitalizador("A resposta está EEEEEEEEEEEEEEEEEEEEEEEEErrada :(", 100);
            vlg.pontos += 1;
            System.out.println("Pontuação: " + vlg.pontos);
            Thread.sleep(2000);
        }
        retorno = 0;
        return retorno;
    }

    // ## ELIMINA ALTERNATIVA
    public void EliminarAlternativas(int nQuest) throws InterruptedException {
        Random aleatorio = new Random();
       
        // Array com as letras das alternativas
        String[] alternativas = {"A", "B", "C", "D"};
 
        // Seleciona a alternativa correta
        int alternativaCorreta = Integer.parseInt(q.questoes[nQuest][5]);

        // Remove duas alternativas incorretas aleatoriamente
        
        int alternativasRemovidas = 0;
        while (alternativasRemovidas < 2) {
            int nAleatorio = aleatorio.nextInt(4);
            if (nAleatorio != alternativaCorreta - 1 && alternativas[nAleatorio] != null) {
                alternativas[nAleatorio] = null;
                alternativasRemovidas++;
            }
        }

        // Exibe as alternativas disponíveis
        System.out.print("\033[H\033[2J");
        Digitalizador(q.questoes[nQuest][0], vlg.delay10);
        for (int i = 0; i < alternativas.length; i++) {
            if (alternativas[i] != null) {
                Digitalizador(q.questoes[nQuest][i+1], vlg.delay10);
            }
        }
        vlg.chancesDeEliminar--;
    }
}