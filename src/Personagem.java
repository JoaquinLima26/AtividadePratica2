public class Personagem {

    private String nome;
    private float vida;
    private float forca;

    public Personagem(String nome, float vida, float forca){
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public String getNome(){
        return nome;
    }

    public void seNome(String nome){
        this.nome = nome;
    }

    public float getVida(){
        this.vida = vida;
    }

    public void setVida(float vida){
        this.vida = vida;
    }

    public float getForca(){
        this.forca = forca;
    }

    public void setForca(float forca){
        this.forca = forca;
    }

    public String totring() {
        
        return "\nNome: " + nome + 
    "\nVida: " + vida; + "\nForca: " + forca";
    }

}