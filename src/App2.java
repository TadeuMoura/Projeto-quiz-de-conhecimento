public class App2 {

    // VALORES GRÁFICOS +  QUESTÕES + MÉTODOS
    ValoresGraficosGlobais vlg = new ValoresGraficosGlobais();
    Questoes q = new Questoes();
    Metodos m = new Metodos();

    // PRINCIPAL
    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[2J");
        Thread.sleep(2000);
        System.out.println(vlg.corVermelho + "Press ENTER to START" + vlg.corBranco);
        vlg.resposta.nextLine();

        System.out.print("\033[H\033[2J");

        char[] animationChars = { '|', '/', '-', '\\' };
        int totalIterations = 90;

        for (int i = 0; i <= totalIterations; i++) {
            int percent = (i * 100) / totalIterations;
            System.out.print(" Carregando " + animationChars[i % 4] + " " + percent + "%\r");
            Thread.sleep(50);
        }
        System.out.println("");
        System.out.print(vlg.corVerde + " COMPLETED" + vlg.corVermelho + "\r");
        Thread.sleep(2000);

        for (int i = 0; i < 10; i++) {
            Thread.sleep(vlg.delay10 * 3);
            System.out.print(" %$#f%?v°/°?/$)(&¨?°/E#@#@?/eq)                 \r");
            Thread.sleep(vlg.delay10 * 3);
            System.out.print(" 1110100 1110010 1101111 1101100 1100101 1101001\r");
            Thread.sleep(vlg.delay10 * 3);
            System.out.print(" CADÊ A TAMPA????                               \r");
        }

        System.out.print("\033[H\033[2J");
        Thread.sleep(1000);
        String cumprimento = " ___ ___              ___ ___\n" +
                "|       |  |         |       |   |\n" +
                "|       |  |         |___ ___|   |\n" +
                "|       |  |         |       |   |\n" +
                "|___ ___|  |___ ___  |       |   0";
        m.Digitalizador(vlg.corAzul + cumprimento + vlg.corBranco, 1);

        Thread.sleep(500);
        System.out.println("");
        m.Digitalizador("Seja bem-vindo ao Quiz do conhecimento.", vlg.delay10);
        vlg.resposta.nextLine();
        System.out.print("\033[H\033[2J");
        m.Digitalizador("Não precisa provar nada, só tu responder certo e seguir feliz.", vlg.delay10);
        vlg.resposta.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.println("Mesmo que seja na base do chute ;D");
        vlg.resposta.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.println("ENFIM!!!!!!");
        vlg.resposta.nextLine();
        System.out.print("\033[H\033[2J");
        m.Digitalizador("Bora começar a diversão ÒuÓ!!!!", vlg.delay10);
        vlg.resposta.nextLine();
        System.out.println("Ou não.");
        Thread.sleep(1500);

        // FAZEDOR DE QUESTÃO
        String simOuNao = "S";

        // REPETIÇÃO QUE SÓ É TERMINADA QUANDO A PESSOA NÃO QUISER JOGAR DENOVO
        while (simOuNao.equals("S")) {
            for (int i = 0; i < vlg.numeroDeQuestoes; i++) {

                System.out.print("\033[H\033[2J");

                m.QuestSele();

                // ALGUNS IF INTERATIVOS
                if (i == 0) {
                    System.out.print("\033[H\033[2J");
                    m.Digitalizador("Aliás esqueci de mencionar, mas existe um sistema de pontuação", 20);
                    vlg.resposta.nextLine();
                    vlg.resposta.nextLine();
                    System.out.print("\033[H\033[2J");
                    m.Digitalizador("Cada questão lhe dá um total de 10 pontos quando corretas e 1 quando erradas", 20);
                    vlg.resposta.nextLine();

                    if (vlg.pontos == 1) {
                        m.Digitalizador("E pelo visto você não começou muito... bem...", vlg.delay10);
                        vlg.resposta.nextLine();
                        System.out.print("\033[H\033[2J");
                        m.Digitalizador("Mas fica tranquilo, com certeza tudo vai pio-", vlg.delay10);
                        Thread.sleep(500);
                        System.out.print("\033[H\033[2J");
                        System.out.println("DIGO!");
                        Thread.sleep(500);
                        System.out.println("DIGO!");
                        Thread.sleep(500);
                        m.Digitalizador("Melhorar :D, vai melhorar :D", vlg.delay10);
                        vlg.resposta.nextLine();
                    } else if (vlg.pontos == 10) {
                        m.Digitalizador("E aparentemente você já começou acertanto!! Quanto conhecimento!!", 10);
                        vlg.resposta.nextLine();
                        System.out.print("\033[H\033[2J");
                        System.out.println("Ou sorte.");
                        vlg.resposta.nextLine();
                        System.out.print("\033[H\033[2J");
                        m.Digitalizador("Devo aumentar a dificuldade?", vlg.delay10);
                        vlg.resposta.nextLine();
                        System.out.print("\033[H\033[2J");
                        m.Digitalizador(
                                "Brincadeiras a parte. Tudo dependerá da questão que você sortear aleatoriamente.",
                                vlg.delay10);
                    }
                    Thread.sleep(1000);
                    System.out.println("ENFIM");
                    Thread.sleep(1000);
                }

                if (vlg.pontos >= 150 && vlg.carro == 0) {
                    m.Digitalizador("Tá acertando várias hein, se continuar assim vai ganhar um carro no final do jogo.",
                            0);
                    vlg.resposta.nextLine();
                    vlg.carro = 1;
                }

                if (vlg.pontos <= 30 && i == 8) {
                    m.Digitalizador("Tempos difíceis em campeão, fé que até o final do quiz você da a volta por cima!!",
                            0);
                    vlg.resposta.nextLine();
                }

                if (vlg.pontos > 100 && vlg.falado == 0) {
                    m.Digitalizador("Mais que 100 pontos parabéns!!! ", vlg.delay10);
                    vlg.resposta.nextLine();
                    vlg.falado = 1;
                }

                if (i < vlg.numeroDeQuestoes - 1) {
                    m.Digitalizador("Próxima questão", vlg.delay10);
                    Thread.sleep(2000);
                } else {
                    if (vlg.carro == 1) {
                        m.Digitalizador(
                                "Sabe aquele carro que eu te prometi no começo do jogo?, então... acabei de bater ele no poste rs.",
                                0);
                        vlg.resposta.nextLine();
                        System.out.print("\033[H\033[2J");
                        m.Digitalizador("Mas tirando a parte ruim,...", vlg.delay10);
                        Thread.sleep(500);
                    }

                    m.Digitalizador(vlg.corMagenta + "Parabéns, você terminou o nosso QUIZ!!!!!" + vlg.corBranco, vlg.delay10);
                    Thread.sleep(1000);
                    if (vlg.pontos < 50) {
                        m.Digitalizador("Você fez: ", vlg.delay10);
                        m.Digitalizador(". . .", 500);
                        Thread.sleep(100);
                        m.Digitalizador("fez: " + vlg.corVermelho + vlg.pontos + vlg.corBranco + " pontos...", 100);
                        vlg.resposta.nextLine();
                        System.out.print("\033[H\033[2J");
                        m.Digitalizador("Realmente foi complicado, mas não desista, você ainda pode tentar de novo. :D",
                                10);
                        vlg.resposta.nextLine();
                        System.out.print("\033[H\033[2J");
                        m.Digitalizador("Alias!!!", 10);
                        Thread.sleep(1000);
                        System.out.print("\033[H\033[2J");

                    } else if (vlg.pontos >= 50 && vlg.pontos < 100) {
                        m.Digitalizador("Você fez: " + vlg.corMagenta + vlg.pontos + vlg.corBranco + " pontos.", vlg.delay10);
                        vlg.resposta.nextLine();
                        System.out.print("\033[H\033[2J");
                        m.Digitalizador("Hmmmmmmmmmmmmmmmmmm...", vlg.delay10);
                        vlg.resposta.nextLine();
                        System.out.print("\033[H\033[2J");
                        m.Digitalizador("Se serve de consolo,", vlg.delay10);
                        vlg.resposta.nextLine();
                        System.out.print("\033[H\033[2J");
                        m.Digitalizador("poderia ter sido bem pior :D", vlg.delay10);
                        vlg.resposta.nextLine();
                        System.out.print("\033[H\033[2J");
                        m.Digitalizador("MAS EU TENHO CERTEZA,", vlg.delay10);
                        vlg.resposta.nextLine();
                        System.out.print("\033[H\033[2J");
                        m.Digitalizador("CERTEZA!!!", vlg.delay10);
                        vlg.resposta.nextLine();
                        System.out.print("\033[H\033[2J");
                        m.Digitalizador("Que se você jogar de novo, sua pontuação vai melhorar :DDD", vlg.delay10);
                        vlg.resposta.nextLine();
                        System.out.print("\033[H\033[2J");
                        m.Digitalizador("ou não", vlg.delay10);
                        Thread.sleep(500);
                        System.out.print("\033[H\033[2J");
                        m.Digitalizador("Mas eae,", vlg.delay10);
                        Thread.sleep(1000);

                    } else if (vlg.pontos >= 100 && vlg.pontos < 150) {
                        m.Digitalizador("Você fez: " + vlg.corAmarela + vlg.pontos + vlg.corBranco + " pontos.", vlg.delay10);
                        vlg.resposta.nextLine();
                        System.out.print("\033[H\033[2J");
                        m.Digitalizador("Fizestes uma boa pontuação parabéns :D.", vlg.delay10);
                        vlg.resposta.nextLine();

                    } else if (vlg.pontos >= 150 && vlg.pontos < 191) {
                        m.Digitalizador("Você fez: " + vlg.corAzul + vlg.pontos + vlg.corBranco + " pontos.", vlg.delay10);
                        vlg.resposta.nextLine();
                        System.out.print("\033[H\033[2J");
                        m.Digitalizador(
                                "Com certeza uma ótima pontuação, continue assim que você pode chegar bem longe ;D",
                                vlg.delay10);
                        vlg.resposta.nextLine();

                    } else if (vlg.pontos >= 191 && vlg.pontos < 200) {
                        m.Digitalizador("Você fez: " + vlg.corCiano + vlg.pontos + vlg.corBranco + " pontos.", vlg.delay10);
                        vlg.resposta.nextLine();
                        System.out.print("\033[H\033[2J");
                        m.Digitalizador(
                                "Puts, por uma questão :(, mas vamos não desanime, olha o quão longe você conseguiu chegar.",
                                vlg.delay10);
                        vlg.resposta.nextLine();
                        System.out.print("\033[H\033[2J");
                        m.Digitalizador(
                                "Se você conseguiu marcar até aqui, com certeza você pode marcar todas corretamente :D.",
                                vlg.delay10);
                                vlg.resposta.nextLine();
                        System.out.print("\033[H\033[2J");
                        m.Digitalizador(vlg.corVerde + "Eu acredito" + vlg.corBranco, 100);
                        vlg.resposta.nextLine();
                        System.out.print("\033[H\033[2J");
                        m.Digitalizador("Mas enfim,", vlg.delay10);
                        Thread.sleep(1000);

                    } else if (vlg.pontos >= 200) {
                        m.Digitalizador(vlg.corVerde + "Você fez 200 PONTOS!!!!!!! ", vlg.delay10);
                        vlg.resposta.nextLine();
                        System.out.print("\033[H\033[2J");
                        m.Digitalizador("Você conseguiu chegar onde poucos pisaram", vlg.delay10);
                        vlg.resposta.nextLine();
                        System.out.print("\033[H\033[2J");
                        m.Digitalizador(
                                "Eu nem pediria pra você jogar denovo, pois você conseguiu atingir um grande patamar, meus sinceros parabéns!!",
                                vlg.delay10);
                                vlg.resposta.nextLine();
                        System.out.print("\033[H\033[2J");
                        m.Digitalizador("Maaasss, como fui programado para falar isso, não posso fazer muita coisa :/",
                        vlg.delay10);
                        vlg.resposta.nextLine();
                        System.out.print("\033[H\033[2J");
                        m.Digitalizador("Mas meus parabéns,continue assim ;D" + vlg.corBranco, vlg.delay10);
                        vlg.resposta.nextLine();

                    }
                }
            }
            System.out.print("\033[H\033[2J");
            m.Digitalizador("Quer jogar de novo?", vlg.delay10);
            Thread.sleep(500);
            System.out.println("S para SIM!!! e n para não.");
            simOuNao = vlg.resposta.next().toUpperCase();
            while (!simOuNao.equals("S") && !simOuNao.equals("N")) {
                System.out.println("Digite para sim e n para não.");
                simOuNao = vlg.resposta.next().toUpperCase();
            }
            // SE SIM, RESETARÁ AS VARIÁVEIS
            if (simOuNao.equals("S")) {
                for (int i = 0; i < q.questoes.length; i++) {
                    q.questoes[i][6] = "0";
                }
                vlg.pontos = 0;
                vlg.carro = 0;
                vlg.chancesDePular = 3;
                vlg.chancesDeEliminar = 3;
                vlg.falado = 0;
            }
        }
    }
}