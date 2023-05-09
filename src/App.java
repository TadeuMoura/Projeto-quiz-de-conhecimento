import java.util.Scanner;
import java.util.Random;

public class App {
    //VARIÁVEIS GLOBAIS
    static Scanner resposta = new Scanner(System.in);
    static int pontos = 0;
    
    //QUESTÕES
    static String[][] questoes = {

        {"Qual o nome do cantor e dançarino Naldo?", 
        "A) Arnaldo\nB) Ronaldo\nC) Reinaldo\nD) Naldo",
        "B",
        "0"},

        {"No seriado 'El Chavo del Ocho', mais conhecido como Chaves aqui no Brasil, a personagem 'Dona Clotilde' foi apelidada pelas crianças como a 'Bruxa do ...'",
        "A) 71\nB) 91\nC) 51\nD) 361",
        "A",
        "0"},

        {"Qual o nome do Super Choque?",
        "A) Vurgil Hawkins\nB) Vurgil Hawkins Ovid\nC) Willian Hawkins\nD) Virgil Ovid Hawkins",
        "D",
        "0"},

        {"O que a palavra legend significa em português?",
        "A) Legenda\nB) Conto\nC) Lenda\nD) Legendário",
        "C",
        "0"},

        {"Qual o número mínimo de jogadores em cada time numa partida de futebol?",
        "A) 8\nB) 10\nC) 9\nD) 7",
        "D",
        "0"},

        {"Quais as duas datas que são comemoradas em novembro?",
        "A) Independência do Brasil e Dia da Bandeira\nB) Proclamação da República e Dia Nacional da Consciência Negra\nC) Black Friday e Dia da Árvore\nD) Dia de Finados e    Dia Nacional do Livro",
        "B",
        "0"},

        {"Quanto tempo a luz do Sol demora para chegar à Terra?",
        "A) 12 minutos\nB) 1 dia\nC) 12 horas\nD) 8 minutos",
        "D",
        "0"},
        
        {"Que animal gruguleja?",
        "A) o pavão\nB) a garça\nC) o peru\nD) a cacatua",
        "C",
        "0"},

        {"Qual destas obras arquitetônicas brasileiras é uma das Sete Maravilhas do Mundo Moderno?",
        "A) Elevador Lacerda\nB) Cristo Redentor\nC) Estação da Luz\nD) One Tower",
        "B",
        "0"},

        {"O que é Pix?",
        "A) Meio de pagamento instantâneo criado pelo Banco Central do Brasil\nB) Plano de investimento de baixo risco do Banco do Brasil\nC) Conjunto de formas de pagamento realizados por subadquirentes\nD) Forma de pagamento online",
        "A",
        "0"},

        {"Qual a montanha mais alta do mundo?",
        "A) Mauna Kea\nB) Dhaulagiri\nC) Monte Chimborazo\nD) Monte Everest",
        "D",
        "0"},

        {"Quanto tempo a Terra demora para dar uma volta completa em torno dela mesma?",
        "A) Aproximadamente 24 horas\nB) 365 dias\nC) 7 dias\nD) 30 ou 31 dias",
        "A",
        "0"},

        {"Qual a maior floresta tropical do mundo?",
        "A) Mata Atlântica\nB) Pampas\nC) Pantanal\nD) Floresta Amazônica",
        "D",
        "0"},

        {"Kryptonita é a fraqueza de qual super-herói?",
        "A) Batman\nB) Hulk\nC) Super-Homem\nD) Capitão América",
        "C",
        "0"},

        {"Qual a personagem mais famosa de Maurício de Sousa?",
        "A) Mafalda\nB) Mônica\nC) Smurfette\nD) Magali",
        "B",
        "0"},

        {"Que cidade brasileira é conhecida por chover todos os dias quase à mesma hora?",
        "A) São Paulo\nB) Joinville\nC) Belém\nD) Natal",
        "C",
        "0"},

        {"Qual o maior podcast do Brasil?",
        "A)Podpah\nB)PODPAH\nC)Podpah é muito zika assista\nD)PODPAH",
        "C",
        "0"},

        {"Em que país foi construído o Muro de Berlim?",
        "A) Estados Unidos\nB) China\nC) Brasil\nD) Alemanha",
        "D",
        "0"},

        {"Depois do futebol, qual o esporte mais popular no Brasil?",
        "A) Esqui\nB) Vôlei\nC) Hóquei no gelo\nD) Golfe",
        "B",
        "0"},

        {"Em que conto de fadas uma princesa adormece com um feitiço e só acorda com o beijo de um príncipe?",
        "A)A Bela Adormecida\nB)João e Maria\nC)Chapeuzinho Vermelho\nD)Patinho Feio",
        "A",
        "0"},

        {"Que fruto nasce da oliveira?",
        "A)Amêndoa\nB)Abacate\nC)Azeitona\nD)Açaí",
        "C",
        "0"},

        {"Qual o plural de chapéu?",
        "A) Chapéis\nB) Chapéus\nC) Chapéuzes\nD) Chapuzes",
        "B",
        "0"},

        {"Que navio famoso naufragou na sua viagem inaugural?",
        "A) Titanic\nB) Antonov\nC) Boeing\nD) Airbus",
        "A",
        "0"}
    };

    //PRINCIPAL
    public static void main(String[] args) throws Exception {

        System.out.print("\033[H\033[2J");
        Thread.sleep(1000);
        String cumprimento = " ___ ___              ___ ___\n"+
                             "|       |  |         |       |   |\n"+
                             "|       |  |         |___ ___|   |\n"+
                             "|       |  |	     |       |   |\n"+
                             "|___ ___|  |___ ___  |       |   0";
        digitalizador(cumprimento, 1);

        Thread.sleep(500);
        System.out.println("");
        digitalizador("Seja bem-vindo ao Quiz do conhecimento.",10);
        Thread.sleep(2000);
        digitalizador("Não precisa provar nada, só tu responder certo e seguir feliz.",10);
        Thread.sleep(3000);
        System.out.println("Mesmo que seja na base do chute ;D");
        Thread.sleep(1000);
        System.out.println("ENFIM!!!!!!");
        Thread.sleep(1000);
        digitalizador("Bora começar a diversão ÒuÓ!!!!", 10);
        Thread.sleep(2000);
        System.out.println("Ou não.");
        Thread.sleep(1000);
        
        

        //FAZEDOR DE QUESTÃO
        String simOuNao = "S";

        //REPETIÇÃO QUE SÓ É TERMINADA QUANDO A PESSOA NÃO QUISER JOGAR DENOVO
        while (simOuNao.equals("S")){
            for (int i = 0; i < questoes.length; i++ ){
                System.out.print("\033[H\033[2J");
                questSele();

                //ALGUNS IF INTERATIVOS
                if (i == 0){
                    digitalizador("Aliás esqueci de mencionar, mas existe um sistema de pontuação", 20);
                    Thread.sleep(1000);
                    digitalizador("Cada questão lhe dá um total de 10 pontos quando corretas e 1 quando erradas", 20);
                    Thread.sleep(500);
                    if(pontos == 1){
                        digitalizador("E pelo visto você não começou muito... bem...", 10);
                        Thread.sleep(1000);
                        digitalizador("Mas fica tranquilo, com certeza tudo vai pio-", 10);
                        Thread.sleep(500);
                        System.out.println("DIGO!");
                        Thread.sleep(500);
                        System.out.println("DIGO!");
                        Thread.sleep(500);
                        digitalizador("Melhorar :D, vai melhorar :D",10);
                    } else if (pontos == 10){
                        digitalizador("E aparentemente você já começou acertanto!! Quanto conhecimento!!", 10);
                        System.out.println("Ou sorte.");
                        digitalizador("Devo aumentar a dificuldade?", i);
                        digitalizador("Brinadeiras a parte. Tudo dependerá da questão que você sortear aleatoriamente.", 10);
                    }
                    Thread.sleep(1000);
                    System.out.println("ENFIM");
                    digitalizador("Partiu próxima questão.", 10);
                    Thread.sleep(1000);
                } else {
                    digitalizador("Próxima questão", 10);
                    Thread.sleep(2000);
                }
            }

            digitalizador("Quer jogar de novo?", 15);
            Thread.sleep(500);
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
    //MÉTODOS

    //SELETOR DE QUESTÕES
    public static void questSele() throws InterruptedException{
        
        //TELA DE LOADING DA QUESTÃO
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

        //USA O CHECADOR DE QUESTÕES PARA PEGAR UM NOME ALEATÓRIO
        int numeroQuestao = checadorDeQuestoes();

        //MOSTRANDO A QUESTÃO [0] E AS ALTERNATIVAS [1]
        digitalizador(questoes[numeroQuestao][0],10);
        digitalizador(questoes[numeroQuestao][1],5);

        //VERIFICA A DIGITAÇÃO DA ALTERNATIVA
        anlsDeAlternativa(numeroQuestao);
        
    }

    //DIGITALIZADOR.
    public static void digitalizador(String texto, int delay) throws InterruptedException {
        //DIGITA LETRA POR LETRA COM UM DELAY EM CADA
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
            Thread.sleep(delay);
        }
        System.out.println();
    }

    //CHECADOR DE QUESTÕES
    public static int checadorDeQuestoes(){
        int i = 0;

        //VALOR QUE SERÁ RETORNADO
        int nRand = 0;

        //REPETI ATÉ O MOMENTO QUE FOR UM NÚMERO MAIOR QUE ZERO
        while (i < 1){
            Random rand = new Random();

            //ARMAZENA UM NÚMERO ALEATÓRIO
            int numeroAletorio = rand.nextInt(questoes.length);
            String verifUso = questoes[numeroAletorio][3];
            
            //VERIFICA SE A QUESTÃO FOI OU NÃO USADA
            //USADA = 1 - NÃO USADA = 0
            if(verifUso.equals("1")){
                continue;
            }

            //ARMAZENA O VALOR DA QUESTÃO NO RETORNO
            questoes[numeroAletorio][3] = "1";
            nRand = numeroAletorio;
            i = 1;
            
        }
        return nRand;
    }

    //ALTERNATIVA
    public static void anlsDeAlternativa(int nquest) throws InterruptedException{
        
        //RESPOSTA VAZIA
        String resp = "";

        //SERVIRÁ PARA SAIR DO REPETIDOR SE O VALOR FOR VERDADEIRO
        boolean validador = false;
        
        //DEFINI QUAL RESPOSTA MOSTRAR SE A PESSOA DIGITAR ERRADO UMA OU MAIS VEZES
        int repetidor = 0;

        //SAI DA REPETIÇÃO QUANDO O VALIDADOR FOR VERDADEIRO
        while (validador == false) {
            resp = resposta.next().toUpperCase();
            
            //VALIDA SE A PESSOA DIGITAR A, B, C OU D
            if(resp.equals("A") || resp.equals("B") || resp.equals("C") || resp.equals("D")) {
                validador = true;
                repetidor = 0;
            } else {

                //MOSTRARÁ UMA DAS RESPOSTAS DO SWITCH CONFORME O VALOR DO REPETIDOR
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

        //SE A RESPOSTA ESTIVER CORRETA
        if (resp.trim().equals(questoes[nquest][2])){
            System.out.print("\033[H\033[2J");
            digitalizador("A reposta está EEEEEEEEEEEEEEEEEEEEEEEEEXATA!!!!!",100);
            pontos = pontos + 10;
            System.out.println("Pontuação: " + pontos);
            Thread.sleep(2000);
        } else {

            //SE A RESPOSTA ESTIVER ERRADA
            digitalizador("A reposta está EEEEEEEEEEEEEEEEEEEEEEEEErrada :(",100);
            pontos = pontos + 1;
            System.out.println("Pontuação: " + pontos);
            Thread.sleep(2000);
        }
    }
}