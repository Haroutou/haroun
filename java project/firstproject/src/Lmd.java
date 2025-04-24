public class  Lmd  extends Etudiant{

    private String pfe;
    public String toString (){
        return super.toString() +
                "pfe=" + pfe  +
                '}';
    }
    public Lmd(String id, String nom,String prenom ,float moy, String pfe) {
        super(id, nom,prenom,moy);
        this.pfe = pfe;
    }

    public String getPfe() {
        return pfe;
    }

    public void setPfe(String pfe) {
        this.pfe = pfe;
    }

}