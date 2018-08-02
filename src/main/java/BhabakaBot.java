import org.jetbrains.annotations.NotNull;
import org.telegram.abilitybots.api.bot.AbilityBot;
import org.telegram.abilitybots.api.objects.Ability;
import org.telegram.abilitybots.api.objects.Locality;
import org.telegram.abilitybots.api.objects.Privacy;

public class BhabakaBot extends AbilityBot {
    public static final String BOT_TOKEN = "671350952:AAEE-HLESD7QuesAebCWthFZFWLobh4o7VQ";
    public static final String BOT_USERNAME = "tony_bot";

    public BhabakaBot() {
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
}
