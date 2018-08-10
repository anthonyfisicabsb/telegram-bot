class Dado {
    private val resposta1 = "-----\n" +
            "|   |\n" +
            "| *|\n" +
            "|   |\n" +
            "-----"
    private val resposta2 = "-----\n" +
            "|   |\n" +
            "|**|\n" +
            "|   |\n" +
            "-----"
    private val resposta3 = "-----\n" +
            "| *|\n" +
            "| *|\n" +
            "| *|\n" +
            "-----"
    private val resposta4 = "-----\n" +
            "| * |\n" +
            "|**|\n" +
            "| * |\n" +
            "-----"
    private val resposta5 = "-----\n" +
            "| * |\n" +
            "|***|\n" +
            "| * |\n" +
            "-----"
    private val resposta6 = "-----\n" +
            "|**|\n" +
            "|**|\n" +
            "|**|\n" +
            "-----"

    fun rolarDado(): String {
        val valor = (Math.random() * 5).toInt() + 1

        when (valor) {
            1 -> return resposta1
            2 -> return resposta2
            3 -> return resposta3
            4 -> return resposta4
            5 -> return resposta5
            6 -> return resposta6
            else -> return "erro"
        }
    }
}
