package projetoex;
import java.util.List;

public class ServicoUsuarios {
    public int somaIdades(List<Usuario> usuarios){
        int somaIdades = 0;

        for (Usuario usuario: usuarios) {
            somaIdades += usuario.idade();
        }
        return somaIdades;
    }

    //FUNCIONAL

    public int somaIdadeFuncional(List<Usuario> usuarios){
        return usuarios.stream().mapToInt(idade->idade.idade()).sum();
    }
}
