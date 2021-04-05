package br.com.likwi.reflaction.handler;

public class Reflaction {
    public ManipuladorClasse refletirClasse(String fullyQualifiedName) {
        try {
            final Class<?> classe = Class.forName(fullyQualifiedName);
            return new ManipuladorClasse(classe);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao criar classe", e.getCause());
        }
    }
}
