import java.util.HashMap;

// classe com método que retorna mapa de capitais e seus respectivos estados
class CapitalMap {
    fun mapaCapitaisBr(): Map<String, String> {
        val mapaCapitais = HashMap<String, String>()

        // região Sul
        mapaCapitais["RS"] = "Porto Alegre"
        mapaCapitais["SC"] = "Florianopolis"
        mapaCapitais["PR"] = "Curitiba"

        // região Centro-Oeste
        mapaCapitais["MS"] = "Campo Grande"
        mapaCapitais["MT"] = "Cuiaba"
        mapaCapitais["GO"] = "Goiania"
        mapaCapitais["DF"] = "Brasilia"

        // regiao Sudeste
        mapaCapitais["SP"] = "Sao Paulo"
        mapaCapitais["RJ"] = "Rio de Janeiro"
        mapaCapitais["ES"] = "Vitoria"
        mapaCapitais["MG"] = "Belo Horizonte"

        // região Nordeste
        mapaCapitais["BA"] = "Salvador"
        mapaCapitais["AL"] = "Maceio"
        mapaCapitais["SE"] = "Aracaju"
        mapaCapitais["PB"] = "Joao Pessoa"
        mapaCapitais["PE"] = "Recife"
        mapaCapitais["RN"] = "Natal"
        mapaCapitais["MA"] = "Sao Luis"
        mapaCapitais["CE"] = "Fortaleza"
        mapaCapitais["PI"] = "Teresina"

        // região Norte
        mapaCapitais["AC"] = "Rio Branco"
        mapaCapitais["AM"] = "Manaus"
        mapaCapitais["RR"] = "Boavista"
        mapaCapitais["RO"] = "Porto Velho"
        mapaCapitais["PA"] = "Belem"
        mapaCapitais["AP"] = "Macapa"
        mapaCapitais["TO"] = "Palmas"

        return mapaCapitais
    }
}
