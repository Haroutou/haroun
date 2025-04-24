import java.util.Arrays;

class NumberPrinter extends Thread { 
    private String threadName; 
    public NumberPrinter(String name) {        this.threadName = name;    } 
    @Override 
    public void run() { 
        printNumbers(); 
    } 
    // Méthode synchronisée pour éviter le mélange des sorties 
    class Moyenne extends Thread { 
        private int[] T; 
        public Moyenne(int[] T) {  this.T = T;  } 
        public void run() { 
                        int somme = 0; 
                        for (int valeur : T)   somme += valeur; 
                        double moyenne = (double) somme / T.length; 
                        System.out.println("Moyenne arithmétique après mise à jour : " + moyenne); 
        } 
    } 
     
    class Chargement extends Thread { 
        private final int[] T; 
        public Chargement(int[] T) {  this.T = T;  } 
        public void run() { 
            try { 
                for (int i = 0; i < T.length; i++) { 
                    T[i] = (int) (Math.random() * 100); 
                    System.out.println("Charger T[" + i + "] : " + T[i] + " => " + Arrays.toString(T)); 
                    Thread.sleep(500); // Délai hors du bloc synchronized 
                } 
            } catch (InterruptedException e) {
                throw new RuntimeException("Le chargement a été interrompu.", e); 
            } 
        } 
    } 
     
    class Principal { 
        public static void main(String[] args) throws InterruptedException { 
            System.out.println("\t\t\t\tCHARGEMENT \t\t\t MOYENNE"); 
            int[] T = new int[5]; 
            new Moyenne(T).start(); 
            new Chargement(T).start(); 
        } 
    } 
    private synchronized void printNumbers() { 
        for (int i = 1; i <= 5; i++) { 
            System.out.println(threadName + " : " + i); 
            try { 
                Thread.sleep(500); // Petite pause pour simuler le travail et voir la concurrence 
            } catch (InterruptedException e) {  System.out.println(threadName + " a été interrompu.");  } 
        } 
     } 
     class Chargement extends Thread { 
        int[] T; 
        public Chargement(int[] T) {        this.T = T;    } 
        public void run() { 
            try { 
    synchronized (T) {            //prendre un accès exclusif sur T 
                for (int i = 0; i < T.length; i++) { 
                    T[i] = (int) (Math.random() * 100); 
                    System.out.println("Charger T[" + i + "] : " + T[i] + " => " + Arrays.toString(T)); 
                    T.notify();       // Envoyer une notification au thread  Moyenne pour le Réveiller 
                    Thread.sleep(1000); 
                } 
            } 
                } catch (InterruptedException e) {throw new RuntimeException("Le chargement a été interrompu.",e); 
              } 
             } 
            } 
            class Moyenne extends Thread { 
                int[] T; 
                public Moyenne(int[] T) {        this.T = T;    } 
                public void run() { 
                    synchronized (T) {          //prendre un accès exclusif sur T une fois libéré par notify 
                        try { 
                            while (true) { 
                                   T.wait() ; // Attendre la notification venant du thread Chargement après la mise à jour de T  
                 int somme = 0; 
                 for (int valeur : T) { somme += valeur; 
                 double moyenne = (double) somme / T.length; 
                 System.out.println("Moyenne arithmétique : " + moyenne); }
                            } 
                        } catch (InterruptedException e) { 
                            throw new RuntimeException("Le calcul de la moyenne a été interrompu.", e); 
                        } 
                    } 
                } 
            } 
} 
public class Main { 
    public static void main(String[] args) { 
        // Créer deux threads avec des noms différents 
        NumberPrinter thread1 = new NumberPrinter("Thread-A"); 
        NumberPrinter thread2 = new NumberPrinter("Thread-B"); 
        // Démarrer les threads 
        thread1.start(); 
        try { 
             
            thread1.join();  // suspendre main (donc thread2 n’est pas démarré) jusqu’à terminer thread1 
        } catch (InterruptedException e) { 
            System.out.println("Main a été interrompu."); 
        }
        thread2.start(); 
    } 
} 

