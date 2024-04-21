import java.util.ArrayList;
import java.util.List;

public class CadastroPersonagens {

    private static List<Personagem> listaPersonagens = new ArrayList<>();

    public static void cadastrar(Personagem func) {
        listaPersonagens.add(func);
    }

    public static List<Personagem> getListaPersonagens() {
        return listaPersonagens;
    }

    public static List<Personagem> getCavaleiros() {
        List<Personagem> tempList = new ArrayList<>();

        for (Personagem tempFunc : listaPersonagens) {
            if (tempFunc instanceof Cavaleiro) {
                tempList.add(tempFunc);
            }
        }

        return tempList;
    }

    public static boolean excluir(int id) {

        for (Personagem tempPersonagem : listaPersonagens) {
            if (tempPersonagem.getId() == id) {
                listaPersonagens.remove(tempPersonagem);
                return true;
            }
        }

        return false;

    }

    public static void excluirLista() {

        listaPersonagens.clear();

    }

}
