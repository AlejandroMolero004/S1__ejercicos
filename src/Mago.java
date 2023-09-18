public class Mago {
    private String nombre;
    private int nivel;
    private int mana;
    public Mago(String n,int niv,int m){
        nombre=n;
        nivel=niv;
        mana=m;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMana() {
        return mana;
    }

    public int getNivel() {
        return nivel;
    }
}
