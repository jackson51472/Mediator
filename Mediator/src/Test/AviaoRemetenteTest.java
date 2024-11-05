package Test;

import TorreControle.AviaoRemetente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AviaoRemetenteTest {

    @Test
    void deveElogiarSecretaria() {
        AviaoRemetente aviao = new AviaoRemetente();
        assertEquals("A Torre vai priorizar a sua emergencia\n"+
                        "O Avião que iria pousar respondeu sua demanda conforme mensagem a seguir.\n"+
                        ">>Nos iremos remeter o pouso para a sua emergencia",
                aviao.emergencia());
    }

    @Test
    void deveReclamarSecretaria() {
        AviaoRemetente aviao = new AviaoRemetente();
        assertEquals("A Torre se comunicou com o avião que tem prioridade.\n" +
                             "O Avião Destinatario respondeu sua demanda conforme mensagem a seguir.\n" +
                             ">>A pista ainda não esta liberada para Pouso",
                aviao.pedirPouso());
    }

    @Test
    void deveSugerirSecretaria() {
        AviaoRemetente aviao = new AviaoRemetente();
        assertEquals("A Torre se comunicou com o avião que tem prioridade.\n" +
                        "O Avião Destinatario respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A pista ainda não esta liberada para Decolagem ",aviao.pedriDecolagem());
    }

}