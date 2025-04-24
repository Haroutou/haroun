public class Etudiant {
    private String id, nom,prenom; float moy;
        public Etudiant(String id, String nom,String prenom, float moy) {
            this.id = id;
            this.nom = nom;
            this.prenom = prenom;
            this.moy = moy;
    }
    public String getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public float getMoy() {
        return moy;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setMoy(float moy) {
        this.moy = moy;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", moy=" + moy +
                '}';
    }
}