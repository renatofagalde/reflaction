package br.com.likwi.reflaction.handler.protocolo;

public class RequestNomeControle {
    private static final String CONTROLLER = "Controller";
    private static final String SLASH = "/";
    private String nomeControle;

    public RequestNomeControle(String url) {
        url = url.replaceFirst(SLASH, "");
        String[] uriPiece = url.split(SLASH);
        this.nomeControle = Character.toUpperCase(uriPiece[0].charAt(0))
                + uriPiece[0].substring(1).concat(CONTROLLER);

    }

    public String getNomeControle() {
        return this.nomeControle;
    }
}
