public class Main {
    public static void main(String[] args) {
        
        Etudiant i = new Ing("100","MOHAMED ARSELEN","BEN HASSEN",20,"Sandibed","Takiland");
        System.out.println(i.toString());

        Etudiant[]  T = new Etudiant[4];
        T[0] = new Ing("100","MOHAMED ARSELEN","BEN HASSEN",20,"Sandibed","Sandibed");
        T[1] = new Lmd("200","HAROUN","BEN HASSEN",20,"Sound Tracker");
        T[2] = new Lmd("300","TAYSIR","HAMMOUDA",20,"ROBERT");
        T[3] = new Ing("400","MOHAMED BAHA ELDYNE","HAMMOUDA",20,"Sandibed","steg");

        for (int k=0;k<3;k++){
            System.out.println(T[k].toString());
    }

}
}