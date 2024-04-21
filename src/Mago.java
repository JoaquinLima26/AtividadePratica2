public class Mago extends Personagem{
    
    private float mana;

    public Mago(String nome, float vida, float forca, float mana){
        super(nome, vida, forca);
        this.mana = mana;
    }

    public String getMana(){
        return mana;
    }

    public void setMana(float mana){
        this.mana = mana;
    }

    public String totring(){

        return super.totring() + "\nMana: " + mana;
    }
}