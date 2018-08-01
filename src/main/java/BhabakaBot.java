import org.telegram.abilitybots.api.bot.AbilityBot;

public class BhabakaBot extends AbilityBot {
    public static final String BOT_TOKEN = "671350952:AAEE-HLESD7QuesAebCWthFZFWLobh4o7VQ";
    public static final String BOT_USERNAME = "tony_bot";

    public BhabakaBot() {
        super(BOT_TOKEN, BOT_USERNAME);
    }

    public int creatorId() {
        return 123456789;
    }
}
