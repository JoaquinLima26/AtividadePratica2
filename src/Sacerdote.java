public class Sacerdote extends Personagem{
    
    private float fe;

    public Mago(String nome, float vida, float forca, float fe){
        super(nome, vida, forca);
        this.fe = fe;
    }

    public String getFe(){
        return fe;
    }

    public void setFe(float fe){
        this.fe = fe;
    }

    public String totring(){

        return super.totring() + "\nFe: " + fe;
    }
}