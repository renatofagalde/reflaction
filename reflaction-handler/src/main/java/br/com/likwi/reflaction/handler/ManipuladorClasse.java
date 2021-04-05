package br.com.likwi.reflaction.handler;

import java.lang.reflect.Constructor;

public class ManipuladorClasse {
    private final Class<?> classe;

    public ManipuladorClasse(Class<?> classe) {
        this.classe = classe;
    }

    public ManipuladorContructor getConstrutorPadrao() {
        try {
            final Constructor<?> declaredConstructor = this.classe.getDeclaredConstructor();
            return new ManipuladorContructor(declaredConstructor);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new RuntimeException("erro no contrutor padrão", e.getCause());
        }
    }
}
