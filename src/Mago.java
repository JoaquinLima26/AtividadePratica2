public class Mago extends Personagem {

    private float mana;

    public Mago(int id, String nome, float vida, float forca, float mana) {
        super(id, nome, vida, forca);
        this.mana = mana;
    }

    public float getMana() {
        return mana;
    }

    public void setMana(float mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {

        return super.toString() + "\nMana: " + mana;
    }
}