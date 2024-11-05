package TorreControle;

public class Torre {

    private static Torre instancia = new Torre();

    private Torre() {}

    public static Torre getInstancia() {
        return instancia;
    }

    public String receberEmergencia() {
        return "A Torre vai priorizar a sua emergencia\n"+
                "O Avião que iria pousar respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + AviaoDestinatario.getInstancia().receberEmergencia();
    }

    public String receberPedidoPouso() {
        return "A Torre se comunicou com o avião que tem prioridade.\n"+
                "O Avião Destinatario respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + AviaoDestinatario.getInstancia().receberPedidoPouso();
    }

    public String receberPedidoDecolagem() {
        return "A Torre se comunicou com o avião que tem prioridade.\n"+
                "O Avião Destinatario respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + AviaoDestinatario.getInstancia().receberPedidoDecolagem();
    }

}
