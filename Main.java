import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        BigDecimal bigDecimal1 = BigDecimal.valueOf(15.0);
        BigDecimal bigDecimal2 = BigDecimal.valueOf(5.0);
        eseguiOperazione(bigDecimal1, bigDecimal2, OperazioneAritmeticaEnum.ADDIZIONE);
        eseguiOperazione(bigDecimal1, bigDecimal2, OperazioneAritmeticaEnum.SOTTRAZIONE);
        eseguiOperazione(bigDecimal1, bigDecimal2, OperazioneAritmeticaEnum.MOLTIPLICAZIONE);
        eseguiOperazione(bigDecimal1, bigDecimal2, OperazioneAritmeticaEnum.DIVISIONE);
        eseguiOperazione(bigDecimal1, bigDecimal2, OperazioneAritmeticaEnum.MIN);
        eseguiOperazione(bigDecimal1, bigDecimal2, OperazioneAritmeticaEnum.MAX);

    }

    public static void eseguiOperazione(BigDecimal bigDecimal1, BigDecimal bigDecimal2, OperazioneAritmeticaEnum operazioneAritmeticaEnum) {
        if (operazioneAritmeticaEnum.equals(OperazioneAritmeticaEnum.ADDIZIONE)) {
            BigDecimal somma = bigDecimal1.add(bigDecimal2);
            System.out.println("Somma: " + somma);

        } else if (operazioneAritmeticaEnum.equals(OperazioneAritmeticaEnum.SOTTRAZIONE)) {
            BigDecimal sottrazione = bigDecimal1.subtract(bigDecimal2);
            System.out.println("Sottrazione: " + sottrazione);

        } else if (operazioneAritmeticaEnum.equals(OperazioneAritmeticaEnum.MOLTIPLICAZIONE)) {
            BigDecimal moltiplicazione = bigDecimal1.multiply(bigDecimal2);
            System.out.println("Moltiplicazione: " + moltiplicazione);

        } else if (operazioneAritmeticaEnum.equals(OperazioneAritmeticaEnum.DIVISIONE)) {
            BigDecimal divisione = bigDecimal1.divide(bigDecimal2);
            System.out.println("Divisione: " + divisione.setScale(1));

        } else if (operazioneAritmeticaEnum.equals(OperazioneAritmeticaEnum.MIN)) {
            BigDecimal minimo = bigDecimal1.min(bigDecimal2);
            System.out.println("Minimo: " + minimo);

        } else if (operazioneAritmeticaEnum.equals(OperazioneAritmeticaEnum.MAX)) {
            BigDecimal massimo = bigDecimal1.max(bigDecimal2);
            System.out.println("Massimo: " + massimo);
        }

    }
}
