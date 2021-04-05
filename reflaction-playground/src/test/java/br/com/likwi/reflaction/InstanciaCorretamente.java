package br.com.likwi.reflaction;

import br.com.likwi.reflaction.controle.SubControle;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.text.MessageFormat;
import java.util.logging.Logger;

import static org.assertj.core.api.Assertions.assertThat;

public class InstanciaCorretamente {
    private static final Logger logger = Logger.getLogger(InstanciaCorretamente.class.toString());

    @Test
    public void deve_criar_novas_instancias_de_Controle() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        final Class<SubControle> subControleClass1 = SubControle.class;
        final Class<?> subControleClass2 = Class.forName("br.com.likwi.reflaction.controle.SubControle");
        final Class<?> controleClass = Class.forName("br.com.likwi.reflaction.controle.Controle");

        final Constructor<SubControle> constructorPublicSubControle1 = subControleClass1.getConstructor();
        final Constructor<SubControle> constructorPrivateSubControle1 = subControleClass1.getDeclaredConstructor(String.class);
        logger.info(MessageFormat.format("\nConstrutor publico -> {0}\nContrutor privado -> {1}",
                constructorPublicSubControle1, constructorPrivateSubControle1));

        final SubControle subControle = constructorPublicSubControle1.newInstance();
        logger.info(MessageFormat.format("Tipo do objeto subControle {0}",subControle));

        assertThat(constructorPublicSubControle1).isNotNull();
        assertThat(subControle).isNotNull();

    }
}
