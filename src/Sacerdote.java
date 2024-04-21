public class Sacerdote extends Personagem{
    
    private float fe;

    public Sacerdote(int id, String nome, float vida, float forca, float fe){
        super(id, nome, vida, forca);
        this.fe = fe;
    }

    public float getFe(){
        return fe;
    }

    public void setFe(float fe){
        this.fe = fe;
    }

    @Override
    public String toString(){

        return super.toString() + "\nFe: " + fe;
    }
}