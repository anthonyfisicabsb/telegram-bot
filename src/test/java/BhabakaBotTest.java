import junit.framework.TestCase;

public class BhabakaBotTest extends TestCase {
    public void testaString() {
        var str1 = "MG";
        var esperado1 = "A capital deste Estado é Belo Horizonte";

        var str2 = "sljdksjdk";
        var esperado2 = "Sigla de estado não reconhecida!";

        var str3 = "am";
        var esperado3 = "A capital deste Estado é Manaus";

        var bot = new BhabakaBot();

        var result1 = bot.capitalOfState(str1);
        var result2 = bot.capitalOfState(str2);
        var result3 = bot.capitalOfState(str3);

        assertEquals(esperado1, result1);
        assertEquals(esperado2, result2);
        assertEquals(esperado3, result3);
    }
}
