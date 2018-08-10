import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Application {
    public static void main(String args[]) {
        //Initialize dependencies necessary for the base dot - Guice
        ApiContextInitializer.init();

        // Create the TelegramBotsApi object to register your bots
        var botsApi = new TelegramBotsApi();

        try {
            // Register your newly created AbilityBot
            botsApi.registerBot(new BhabakaBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
