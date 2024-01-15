public enum OperazioneAritmeticaEnum {
    ADDIZIONE("+"),
    SOTTRAZIONE("-"),
    MOLTIPLICAZIONE("*"),
    DIVISIONE("/"),
    MIN("min"),
    MAX("MAX");

    private final String operazione;

    OperazioneAritmeticaEnum(String operazione) {
        this.operazione = operazione;
    }

}
