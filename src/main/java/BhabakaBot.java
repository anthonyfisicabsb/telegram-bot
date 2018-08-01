import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class BhabakaBot extends TelegramLongPollingBot {
    public void onUpdateReceived(Update update) {
        // We check if the update has a message and the message has a text
        if(update.hasMessage() && update.getMessage().hasText()) {
            var message = new SendMessage() // Create SendMessage object
                    .setChatId(update.getMessage().getChatId())
                    .setText(update.getMessage().getText());

            try{
                execute(message); // Call method to send the message
            } catch(TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    public String getBotUsername() {
        return "tony-bot";
    }

    public String getBotToken() {
        return "671350952:AAEE-HLESD7QuesAebCWthFZFWLobh4o7VQ";
    }

}
