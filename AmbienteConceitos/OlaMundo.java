package AmbienteConceitos;

import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;

/**
 * Qualquer código Java que é capaz de rodar deve estar presente dentro de uma classe.
 * A função 'main' é a função de entrada de um programa Java. É ela que será o primeiro código a ser executado.
 * Não pode haver mais de uma função main por classe, pois desta maneira o compilador não saberia qual função chamar.
 * Também não pode haver mais de um classe no mesmo arquivo java.
 * Cada classe deve ficar dentro de um arquivo com o mesmo nome da classe.
 */
@SupportedSourceVersion(SourceVersion.RELEASE_16)
public class OlaMundo {

    private static final long serialVersionUID = 1L;
    public static void main(String[] args) {
        System.out.println("Olá, Mundo!");
    }

    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }
}
