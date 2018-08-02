import java.util.HashMap;
import java.util.Map;

// classe com método que retorna mapa de capitais e seus respectivos estados
public class CapitalMap {
    public Map<String, String> mapaCapitaisBr() {
        var mapaCapitais = new HashMap<String, String>();

        // região Sul
        mapaCapitais.put("RS", "Porto Alegre");
        mapaCapitais.put("SC", "Florianopolis");
        mapaCapitais.put("PR", "Curitiba");

        // região Centro-Oeste
        mapaCapitais.put("MS", "Campo Grande");
        mapaCapitais.put("MT", "Cuiaba");
        mapaCapitais.put("GO", "Goiania");
        mapaCapitais.put("DF", "Brasilia");

        // regiao Sudeste
        mapaCapitais.put("SP", "Sao Paulo");
        mapaCapitais.put("RJ", "Rio de Janeiro");
        mapaCapitais.put("ES", "Vitoria");
        mapaCapitais.put("MG", "Belo Horizonte");

        // região Nordeste
        mapaCapitais.put("BA", "Salvador");
        mapaCapitais.put("AL", "Maceio");
        mapaCapitais.put("SE", "Aracaju");
        mapaCapitais.put("PB", "Joao Pessoa");
        mapaCapitais.put("PE", "Recife");
        mapaCapitais.put("RN", "Natal");
        mapaCapitais.put("MA", "Sao Luis");
        mapaCapitais.put("CE", "Fortaleza");
        mapaCapitais.put("PI", "Teresina");

        // região Norte
        mapaCapitais.put("AC", "Rio Branco");
        mapaCapitais.put("AM", "Manaus");
        mapaCapitais.put("RR", "Boavista");
        mapaCapitais.put("RO", "Porto Velho");
        mapaCapitais.put("PA", "Belem");
        mapaCapitais.put("AP", "Macapa");
        mapaCapitais.put("TO", "Palmas");

        return mapaCapitais;
    }
}
