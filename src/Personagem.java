public class Personagem {

    private int id;
    private String nome;
    private float vida;
    private float forca;

    public Personagem(int id, String nome, float vida, float forca) {
        this.id = id;
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }

    public float getForca() {
        return forca;
    }

    public void setForca(float forca) {
        this.forca = forca;
    }

    @Override
    public String toString() {

        return "\nNome: " + nome +
                "\nVida: " + vida + "\nForca: " + forca;
    }

}