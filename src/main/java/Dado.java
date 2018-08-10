public class Dado {
    private String resposta1 = "-----\n" +
                               "|   |\n" +
                               "| * |\n" +
                               "|   |\n" +
                               "-----";
    private String resposta2 = "-----\n" +
                               "|   |\n" +
                               "|* *|\n" +
                               "|   |\n" +
                               "-----";
    private String resposta3 = "-----\n" +
                               "| * |\n" +
                               "| * |\n" +
                               "| * |\n" +
                               "-----";
    private String resposta4 = "-----" +
                               "| * |\n" +
                               "|* *|\n" +
                               "| * |\n" +
                               "-----";
    private String resposta5 = "-----\n" +
                               "| * |\n" +
                               "|***|\n" +
                               "| * |\n" +
                               "-----";
    private String resposta6 = "-----\n" +
                               "|* *|\n" +
                               "|* *|\n" +
                               "|* *|\n" +
                               "-----";

    public String rolarDado() {
        int valor = (int)(Math.random() * 5) + 1;

        switch (valor) {
            case 1:
                return resposta1;
            case 2:
                return resposta2;
            case 3:
                return resposta3;
            case 4:
                return resposta4;
            case 5:
                return resposta5;
            case 6:
                return resposta6;
            default:
                return "erro";
        }
    }
}
