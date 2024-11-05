package TorreControle;

public class AviaoDestinatario implements Aviao{

    private static AviaoDestinatario instancia = new AviaoDestinatario();

    private AviaoDestinatario() {}

    public static AviaoDestinatario getInstancia() {
        return instancia;
    }

    public String receberEmergencia() {
        return "Nos iremos remeter o pouso para a sua emergencia";
    }

    public String receberPedidoPouso() {
        return "A pista ainda não esta liberada para Pouso" ;
    }

    public String receberPedidoDecolagem() {
        return "A pista ainda não esta liberada para Decolagem ";
    }

}
