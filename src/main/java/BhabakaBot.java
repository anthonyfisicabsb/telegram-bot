import org.jetbrains.annotations.NotNull;
import org.telegram.abilitybots.api.bot.AbilityBot;
import org.telegram.abilitybots.api.objects.*;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;

import static org.telegram.abilitybots.api.util.AbilityUtils.getChatId;

public class BhabakaBot extends AbilityBot {
    private static String BOT_TOKEN;
    private static String BOT_USERNAME;

    // bloco para inicializar o token e o nome do bot
    static {
        var leitor = new Scanner(System.in);

        System.out.print("Digite o token do bot e aperte enter: ");
        BOT_TOKEN = leitor.next();

        System.out.print("Digite o nome do bot e digite: ");
        BOT_USERNAME = leitor.next();

        leitor.close();
    }

    BhabakaBot() {
        super(BOT_TOKEN, BOT_USERNAME);
    }

    public int creatorId() {
        return 123456789;
    }

    // adicionando habilidade para o bot dizer hello
    public Ability sayHelloWorld() {
        return Ability
                .builder()
                .name("hello")
                .info("says hello world")
                .locality(Locality.ALL)
                .privacy(Privacy.PUBLIC)
                .action(ctx -> silent.send("hello world!", ctx.chatId()))
                .build();
    }

    // adicionado a habilidade do bot de reverter uma palavra
    public Ability revertWord() {
        return Ability
                .builder()
                .name("revert")
                .info("revert the string")
                .locality(Locality.ALL)
                .input(1)
                .privacy(Privacy.PUBLIC)
                .action(ctx -> silent.send(revertString(ctx.firstArg()), ctx.chatId()))
                .build();
    }

    // método para reverter a string inserida
    private String revertString(@NotNull String word) {
        var caracteres = word.toCharArray();

        var array_len = caracteres.length;

        for (int i = 0; i < array_len / 2; i++) {
            char aux = caracteres[i];
            caracteres[i] = caracteres[array_len - (1 + i)];
            caracteres[array_len - (1 + i)] = aux;
        }

        return new String(caracteres);
    }

    // habilidade de retornar a capital do estado indicado pela sigla
    public Ability giveCapital() {
        return Ability
                .builder()
                .name("capital")
                .info("gives the capital of state")
                .locality(Locality.ALL)
                .input(1)
                .privacy(Privacy.PUBLIC)
                .action(ctx -> silent.send(capitalOfState(ctx.firstArg()), ctx.chatId()))
                .build();
    }

    // método que retorna a capital do estado selecionado
    @NotNull
    String capitalOfState(String word) {
        Map<String, String> mapaCidadeCapital = new CapitalMap().mapaCapitaisBr();
        word = word.toUpperCase();

        if (!mapaCidadeCapital.containsKey(word))
            return "Sigla de estado não reconhecida!";

        return "A capital deste Estado é " + mapaCidadeCapital.get(word);
    }

    // habilidade para retornar as raizes de uma equação de segundo grau
    public Ability giveRoots() {
        return Ability
                .builder()
                .name("roots")
                .info("return roots of a equation")
                .locality(Locality.ALL)
                .input(3)
                .privacy(Privacy.PUBLIC)
                .action(ctx -> silent.send(roots2Degree(ctx.firstArg(), ctx.secondArg(), ctx.thirdArg()), ctx.chatId()))
                .build();
    }

    private String roots2Degree(String a, String b, String c) {
        try {
            var c1 = Double.parseDouble(a);
            var c2 = Double.parseDouble(b);
            var c3 = Double.parseDouble(c);

            // conferindo se a equação realmente é de segundo grau
            if (c1 == 0.0)
                return "'a' deve ser diferente de 0.0";

            double delta = c2 * c2 - 4 * c1 * c3;

            if (delta >= 0) {
                double root1 = (-c2 + Math.sqrt(delta)) / 2.0 * c1;
                double root2 = (-c2 - Math.sqrt(delta)) / 2.0 * c1;

                return String.format("As raizes sao %f e %f", root1, root2);
            } else {
                double real = -c2 / 2.0 * c1;
                double imag = Math.sqrt(-delta) / 2.0 * c1;

                return String.format("As raizes sao %f + i%f e %f - i%f", real, imag, real, imag);
            }
        } catch (NumberFormatException e) {
            return "Insira somente numeros, como 2.0, 3.45 e etc.";
        }
    }

    public Ability rollDice() {
        return Ability
                .builder()
                .name("dado")
                .info("rola um dado")
                .locality(Locality.ALL)
                .input(0)
                .privacy(Privacy.PUBLIC)
                .action(ctx -> silent.send(new Dado().rolarDado(), ctx.chatId()))
                .build();
    }

    public Ability responderFoto() {
        return Ability
                .builder()
                .name(DEFAULT)
                .flag(Flag.PHOTO)
                .privacy(Privacy.PUBLIC)
                .locality(Locality.ALL)
                .input(0)
                .action(ctx -> silent.send("Vocês humanos sabem que bots não sabem dar palpites sobre " +
                        "fotos não é?", ctx.chatId()))
                .build();
    }

    public Reply interrogatorio() {
        Consumer<Update> action = update -> {
            silent.send("Para ser sincero eu não espero de você " +
                    "mais do que edeucação... beijos sem paixão... cansei de cantar, essa música soa tão meio " +
                    "robótica. Mudou uma mensagem? Então vamos lá, vai ser do balaco baco nossa " +
                    "experiência juntos!", getChatId(update));
        };

        return Reply.of(action, Flag.EDITED_MESSAGE);
    }
}
