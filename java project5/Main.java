import java.util.Scanner;
public class Main{
public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("enter you name :");
    String name = scanner.nextLine();
    scanner.close();
    //this my new programm
    //println statements
        System.out.println("I am best youtuber "+"and "+"best hacker");
        //variable
        String Name="haroun"; String familly_name="ben hassen"; String AKA="Haroutou Uzumaki ";
        int age=25;int year=2000;int month=9; int day=9;
        double prize=20.50;double pi=3.14;
        char currency='T';
        boolean isStudent=true;
        System.out.println("my name is "+Name+" "+familly_name+" AKA "+AKA);
        System.out.println("my age is "+age+" because i born in "+day+"/"+month+"/"+year+" and i hope to get today "+prize+currency);
        System.out.println("and i know the value of PI which is pi= "+pi+".");
        if(isStudent){
            System.out.println("you are a student");
        }
        else{
            System.out.println("you are Not a student");
        }
        System.out.println(isStudent);
}
}