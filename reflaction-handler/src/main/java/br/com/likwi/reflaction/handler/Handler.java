package br.com.likwi.reflaction.handler;

import br.com.likwi.reflaction.handler.protocolo.RequestNomeControle;

import java.util.logging.Logger;

public class Handler {
    private static final Logger logger = Logger.getLogger(Handler.class.toString());
    private static final String DOT = ".";
    private final String pacote;

    public Handler(String pacote) {
        this.pacote = pacote;
    }

    public Object orchestrator(String url) {

        final String nomeControle = new RequestNomeControle(url).getNomeControle();
        final Object instanciaControle = new Reflaction()
                .refletirClasse(pacote.concat(DOT).concat(nomeControle))
                .getConstrutorPadrao()
                .invocar();
        return instanciaControle;
    }
}
