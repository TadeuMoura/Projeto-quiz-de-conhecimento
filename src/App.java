//* # INFORMATIVO # *// 
//Métodos são iniciados com ##
//* # ----------- # *//

import java.util.Scanner;
import java.util.Random;

public class App {
    // VARIÁVEIS GLOBAIS
    static Scanner resposta = new Scanner(System.in);
    
    static int pontos = 0;
    static int changesDePular = 3;
    static int changesDeEliminar = 3;

    // QUESTÕES
    static String[][] questoes = {

            { "Qual o nome do cantor e dançarino Naldo?",
                    "A) Arnaldo",
                    "B) Ronaldo",
                    "C) Reinaldo",
                    "D) Naldo",
                    "2",
                    "0" },

            { "No seriado 'El Chavo del Ocho', mais conhecido como Chaves aqui no Brasil, a personagem 'Dona Clotilde' foi apelidada pelas crianças como a 'Bruxa do ...'",
                    "A) 71",
                    "B) 91",
                    "C) 51",
                    "D) 361",
                    "1",
                    "0" },

            { "Qual o nome do Super Choque?",
                    "A) Vurgil Hawkins",
                    "B) Vurgil Hawkins Ovid",
                    "C) Willian Hawkins",
                    "D) Virgil Ovid Hawkins",
                    "4",
                    "0" },

            { "O que a palavra legend significa em português?",
                    "A) Legenda",
                    "B) Conto",
                    "C) Lenda",
                    "D) Legendário",
                    "3",
                    "0" },

            { "Qual o número mínimo de jogadores em cada time numa partida de futebol?",
                    "A) 8",
                    "B) 10",
                    "C) 9",
                    "D) 7",
                    "4",
                    "0" },

            { "Quais as duas datas que são comemoradas em novembro?",
                    "A) Independência do Brasil e Dia da Bandeira",
                    "B) Proclamação da República e Dia Nacional da Consciência Negra",
                    "C) Black Friday e Dia da Árvore",
                    "D) Dia de Finados e Dia Nacional do Livro",
                    "2",
                    "0" },

            { "Quanto tempo a luz do Sol demora para chegar à Terra?",
                    "A) 12 minutos",
                    "B) 1 dia",
                    "C) 12 horas",
                    "D) 8 minutos",
                    "4",
                    "0" },

            { "Que animal gruguleja?",
                    "A) o pavão",
                    "B) a garça",
                    "C) o peru",
                    "D) a cacatua",
                    "3",
                    "0" },

            { "Qual destas obras arquitetônicas brasileiras é uma das Sete Maravilhas do Mundo Moderno?",
                    "A) Elevador Lacerda",
                    "B) Cristo Redentor",
                    "C) Estação da Luz",
                    "D) One Tower",
                    "2",
                    "0" },

            { "O que é Pix?",
                    "A) Meio de pagamento instantâneo criado pelo Banco Central do Brasil",
                    "B) Plano de investimento de baixo risco do Banco do Brasil",
                    "C) Conjunto de formas de pagamento realizados por subadquirentes",
                    "D) Forma de pagamento online",
                    "1",
                    "0" },

            { "Qual a montanha mais alta do mundo?",
                    "A) Mauna Kea",
                    "B) Dhaulagiri",
                    "C) Monte Chimborazo",
                    "D) Monte Everest",
                    "4",
                    "0" },

            { "Quanto tempo a Terra demora para dar uma volta completa em torno dela mesma?",
                    "A) Aproximadamente 24 horas",
                    "B) 365 dias",
                    "C) 7 dias",
                    "D) 30 ou 31 dias",
                    "1",
                    "0" },

            { "Qual a maior floresta tropical do mundo?",
                    "A) Mata Atlântica",
                    "B) Pampas",
                    "C) Pantanal",
                    "D) Floresta Amazônica",
                    "4",
                    "0" },

            { "Kryptonita é a fraqueza de qual super-herói?",
                    "A) Batman",
                    "B) Hulk",
                    "C) Super-Homem",
                    "D) Capitão América",
                    "3",
                    "0" },

            { "Qual a personagem mais famosa de Maurício de Sousa?",
                    "A) Mafalda",
                    "B) Mônica",
                    "C) Smurfette",
                    "D) Magali",
                    "2",
                    "0" },

            { "Que cidade brasileira é conhecida por chover todos os dias quase à mesma hora?",
                    "A) São Paulo",
                    "B) Joinville",
                    "C) Belém",
                    "D) Natal",
                    "3",
                    "0" },

            { "Qual o maior podcast do Brasil?",
                    "A)Podpah",
                    "B)PODPAH",
                    "C)Podpah é muito zika assista",
                    "D)PODPAH",
                    "3",
                    "0" },

            { "Em que país foi construído o Muro de Berlim?",
                    "A) Estados Unidos",
                    "B) China",
                    "C) Brasil",
                    "D) Alemanha",
                    "4",
                    "0" },

            { "Depois do futebol, qual o esporte mais popular no Brasil?",
                    "A) Esqui",
                    "B) Vôlei",
                    "C) Hóquei no gelo",
                    "D) Golfe",
                    "2",
                    "0" },

            { "Em que conto de fadas uma princesa adormece com um feitiço e só acorda com o beijo de um príncipe?",
                    "A)A Bela Adormecida",
                    "B)João e Maria",
                    "C)Chapeuzinho Vermelho",
                    "D)Patinho Feio",
                    "1",
                    "0" },

            { "Que fruto nasce da oliveira?",
                    "A)Amêndoa",
                    "B)Abacate",
                    "C)Azeitona",
                    "D)Açaí",
                    "3",
                    "0" },

            { "Qual o plural de chapéu?",
                    "A) Chapéis",
                    "B) Chapéus",
                    "C) Chapéuzes",
                    "D) Chapuzes",
                    "2",
                    "0" },

            { "Que navio famoso naufragou na sua viagem inaugural?",
                    "A) Titanic",
                    "B) Antonov",
                    "C) Boeing",
                    "D) Airbus",
                    "1",
                    "0" },
            { "Qual a altura da rede de vôlei nos jogos masculino e feminino?", 
                    "A)2,4 para ambos",
                    "B)2,5 m e 2,0 m",
                    "C)1,8 m e 1,5 m",
                    "D)2,43 m e 2,24 m",
                    "4",
                    "0" },
        
            { "Qual personagem folclórico costuma ser agradado pelos caçadores com a oferta de fumo?", 
                    "A)Caipora",
                    "B)Saci",
                    "C)Lobisomem",
                    "D)Boitatá",
                    "1",
                    "0" },
        
            { "Qual a montanha mais alta do Brasil?", 
                    "A)Pico da Neblina",
                    "B)Pico Paraná",
                    "C)Monte Roraima",
                    "D)Pico Maior de Friburgo",
                    "1",
                    "0" },
        
            { "Quais destas doenças são sexualmente transmissíveis?", 
                    "A)Aids, tricomoníase e ebola",
                    "B)Chikungunya, aids e herpes genital",
                    "C)Gonorreia, clamídia e sífilis",
                    "D)Botulismo, cistite e gonorreia",
                    "3",
                    "0" },
        
                
            { "Qual o maior animal terrestre?", 
                    "A)Baleia Azul",
                    "B)Dinossauro",
                    "C)Elefante africano",
                    "D)Girafa",
                    "3",
                    "0" },
        
            { "Com que dois países faz fronteira o Equador?", 
                    "A)com o Brasil e com a Colômbia",
                    "B)com a Colômbia e com a Venezuela",
                    "C)com a Colômbia e com o Peru",
                    "D)com o Equador e o Brasil",
                    "3",
                    "0" },
        
            { "Qual das alternativas contém apenas vacinas contra a covid-19?", 
                    "A)VIP/VOP e AstraZeneca",
                    "B)CoronaVac e AstraZeneca",
                    "C)HPV e BioNTech",
                    "D)Pentavalente (DTPa) e Sputnik V",
                    "2",
                    "0" },
        
            { "Qual das alternativas traz uma das medidas do presidente Trump, anunciada em 2017, que causou polêmica?", 
                    "A)Construção de um muro na fronteira com o Canadá",
                    "B)Cessação de Acordo de Comércio Livre (ACL) entre os Estados Unidos e Israel",
                    "C)Saída do Acordo de Paris",
                    "D)Saída da OTAN - Organização do Tratado do Atlântico Norte",
                    "3",
                    "0" },
        
            { "O que é Pix?", 
                    "A)Meio de pagamento instantâneo criado pelo Banco Central do Brasil",
                    "B)Plano de investimento de baixo risco do Banco do Brasil",
                    "C)Conjunto de formas de pagamento realizados por subadquirentes",
                    "D)Forma de pagamento online",
                    "1",
                    "0" },
        
            { "Qual a função da ONU?", 
                    "A)Zelar pela cultura em todas as nações",
                    "B)Unir as nações com o objetivo de manter a paz e a segurança mundial",
                    "C)Financiar países em desenvolvimento",
                    "D)Regular o funcionamento do sistema financeiro a nível internacional",
                    "2",
                    "0" },
    };

    // PRINCIPAL
    public static void main(String[] args) throws Exception {

        System.out.print("\033[H\033[2J");
        Thread.sleep(1000);
        String cumprimento = " ___ ___              ___ ___\n" +
                "|       |  |         |       |   |\n" +
                "|       |  |         |___ ___|   |\n" +
                "|       |  |         |       |   |\n" +
                "|___ ___|  |___ ___  |       |   0";
        Digitalizador(cumprimento, 1);

        Thread.sleep(500);
        System.out.println("");
        Digitalizador("Seja bem-vindo ao Quiz do conhecimento.", 10);
        Thread.sleep(2000);
        Digitalizador("Não precisa provar nada, só tu responder certo e seguir feliz.", 10);
        Thread.sleep(3000);
        System.out.println("Mesmo que seja na base do chute ;D");
        Thread.sleep(1000);
        System.out.println("ENFIM!!!!!!");
        Thread.sleep(1000);
        Digitalizador("Bora começar a diversão ÒuÓ!!!!", 10);
        Thread.sleep(2000);
        System.out.println("Ou não.");
        Thread.sleep(1000);

        // FAZEDOR DE QUESTÃO
        String simOuNao = "S";

        // REPETIÇÃO QUE SÓ É TERMINADA QUANDO A PESSOA NÃO QUISER JOGAR DENOVO
        while (simOuNao.equals("S")) {
            for (int i = 0; i < 20; i++) {
                System.out.print("\033[H\033[2J");
                QuestSele();

                // ALGUNS IF INTERATIVOS
                if (i == 0) {
                    Digitalizador("Aliás esqueci de mencionar, mas existe um sistema de pontuação", 20);
                    Thread.sleep(1000);
                    Digitalizador("Cada questão lhe dá um total de 10 pontos quando corretas e 1 quando erradas", 20);
                    Thread.sleep(500);
                    if (pontos == 1) {
                        Digitalizador("E pelo visto você não começou muito... bem...", 10);
                        Thread.sleep(1000);
                        Digitalizador("Mas fica tranquilo, com certeza tudo vai pio-", 10);
                        Thread.sleep(500);
                        System.out.println("DIGO!");
                        Thread.sleep(500);
                        System.out.println("DIGO!");
                        Thread.sleep(500);
                        Digitalizador("Melhorar :D, vai melhorar :D", 10);
                    } else if (pontos == 10) {
                        Digitalizador("E aparentemente você já começou acertanto!! Quanto conhecimento!!", 10);
                        System.out.println("Ou sorte.");
                        Digitalizador("Devo aumentar a dificuldade?", i);
                        Digitalizador("Brinadeiras a parte. Tudo dependerá da questão que você sortear aleatoriamente.",
                                10);
                    }
                    Thread.sleep(1000);
                    System.out.println("ENFIM");
                    Digitalizador("Partiu próxima questão.", 10);
                    Thread.sleep(1000);
                } else {
                    Digitalizador("Próxima questão", 10);
                    Thread.sleep(2000);
                }
            }

            Digitalizador("Quer jogar de novo?", 15);
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
            }
        }
    }

    // ------------------------------------------------------------------
    // MÉTODOS

    // ## SELETOR DE QUESTÕES
    public static void QuestSele() throws InterruptedException {

        // TELA DE LOADING DA QUESTÃO
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

        // USA O CHECADOR DE QUESTÕES PARA PEGAR UM NOME ALEATÓRIO
        int numeroQuestao = ChecadorDeQuestoes();

        // MOSTRANDO A QUESTÃO [0] E AS ALTERNATIVAS [1][2][3][4]
        Digitalizador(questoes[numeroQuestao][0], 10);
        Digitalizador(questoes[numeroQuestao][1], 5);
        Digitalizador(questoes[numeroQuestao][2], 5);
        Digitalizador(questoes[numeroQuestao][3], 5);
        Digitalizador(questoes[numeroQuestao][4], 5);

        
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
            Digitalizador("A reposta está EEEEEEEEEEEEEEEEEEEEEEEEEXATA!!!!!", 100);
            pontos = pontos + 10;
            System.out.println("Pontuação: " + pontos);
            Thread.sleep(2000);
        } else {

            // SE A RESPOSTA ESTIVER ERRADA
            Digitalizador("A reposta está EEEEEEEEEEEEEEEEEEEEEEEEErrada :(", 100);
            pontos = pontos + 1;
            System.out.println("Pontuação: " + pontos);
            Thread.sleep(2000);
        }
    }

    // ## PULA QUESTÃO

    // ## ELIMINA ALTERNATIVA

}
