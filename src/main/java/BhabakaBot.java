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
}
