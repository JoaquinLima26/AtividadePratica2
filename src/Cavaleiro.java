public class Cavaleiro extends Personagem {

    private float aurea;

    public Cavaleiro(int id, String nome, float vida, float forca, float aurea) {
        super(id, nome, vida, forca);
        this.aurea = aurea;
    }

    public float getAurea() {
        return aurea;
    }

    public void setAurea(float aurea) {
        this.aurea = aurea;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAurea: " + aurea;
    }
}