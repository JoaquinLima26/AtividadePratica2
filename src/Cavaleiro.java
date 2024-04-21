public class Cavaleiro extends Personagem{
    
    private float aurea;

    public Mago(String nome, float vida, float forca, float aurea){
        super(nome, vida, forca);
        this.aurea = aurea;
    }

    public String getAurea(){
        return aurea;
    }

    public void setAurea(float aurea){
        this.aurea = aurea;
    }

    public String totring(){

        return super.totring() + "\nAurea: " + aurea;
    }
}