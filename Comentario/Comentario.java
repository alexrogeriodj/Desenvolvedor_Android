package Comentario;

import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;

@SupportedSourceVersion(SourceVersion.RELEASE_16)
public class Comentario {

    private static final long serialVersionUID = 1L;

    /**
     * Documentação - ponto de entrada
     * Este é um comentário para documentar um método e seu funcionamento.É útil para visualizar o que o método faz sem a necessidade de explorar seu código.
     * @param args
     */
    public static void main(String[] args) {

        // Comentário de uma única linha
        System.out.println("Olá, Mundo!"); // Imprime texto

        /*
        Comentário com várias linhas
        Programa OlaMundo.
        */

    }

   
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.RELEASE_16;
    }

    
}
