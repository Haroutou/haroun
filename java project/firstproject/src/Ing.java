public class Ing extends Etudiant{
    private String stage1, stage2;
    public String toString(){
        return super.toString() +
                "{ stg1=" + stage1 +
                ", stg2=" + stage2 + "}" ;
    }
    Ing(String id , String nom,String prenom, float moy , String stage1, String stage2) {
        super(id, nom, prenom, moy);
        this.stage1 = stage1;
        this.stage1 = stage1;
    }
    public String getStage1() {
        return stage1;
    }
    public String getStage2() {
        return stage2;
    }

    public void setStage1(String stage1) {
        this.stage1 = stage1;
    }

    public void setStage2(String stage2) {
        this.stage2 = stage2;
    }
}