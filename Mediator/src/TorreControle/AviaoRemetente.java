package TorreControle;

public class AviaoRemetente implements Aviao{

    public String pedirPouso() {
        return Torre.getInstancia().receberPedidoPouso();
    }

    public String emergencia() {
        return Torre.getInstancia().receberEmergencia();
    }

    public String pedriDecolagem() {
        return Torre.getInstancia().receberPedidoDecolagem();
    }


}
