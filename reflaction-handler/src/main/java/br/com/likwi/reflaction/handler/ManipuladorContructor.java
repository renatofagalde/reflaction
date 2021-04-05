package br.com.likwi.reflaction.handler;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ManipuladorContructor {
    private final Constructor<?> constructor;

    public ManipuladorContructor(Constructor<?> constructor) {
        this.constructor = constructor;
    }

    public Object invocar() {
        try {
            return this.constructor.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro no construtor", e.getCause());
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro no construtor", e.getTargetException());
        }

    }
}
