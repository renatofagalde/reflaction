package br.com.likwi.reflaction.api.estoque;

import br.com.likwi.reflaction.handler.Handler;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.toString());

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String url = s.nextLine();
            final Handler handler = new Handler("br.com.likwi.reflaction.api.estoque.controller");
            while (!url.equals("exit")) {
                Object response = handler.orchestrator(url);
                logger.info((String) response);
                url = s.nextLine();
            }
        }
    }
}
