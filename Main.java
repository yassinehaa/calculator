import javax.print.DocFlavor;
import java.util.Scanner;

 public class Main {
     static Scanner input = new Scanner(System.in);
     static float[] infos() {
         System.out.println("Entrer a :");
         float a = input.nextFloat();
         System.out.println("Entrer b :");
         float b = input.nextFloat();

         return new float[]{a, b};
    }
    static void addition(){
        float[] values = infos();
        System.out.println(STR."la somme de \{values[0]} et \{values[1]} est: \{values[0] + values[1]}");
    }

    static void soustraction(){
        float[] values = infos();
        System.out.println(STR."\{values[0]} - \{values[1]} est: \{values[0] - values[1]}");
    }

    static void multiplication(){
        float[] values = infos();
        System.out.println(STR. "\{values[0]} multiplié par \{values[1]} est: \{values[0]*values[1]}");
    }

    static void division(){
        float[] values = infos();
        System.out.println(STR."\{values[0]} divisé par \{values[1]} est: \{values[0] / values[1]}");

    }
    static void puissance (){
        float[] values = infos();
        System.out.println(STR."la puissance de \{values[0]}^ \{values[1]} est: \{Math.pow(values[0], values[1])}");
    }
    static void racine(){
        System.out.println("entrer le numero: ");
        float a = input.nextFloat();
        System.out.println(STR."la racine carré est : \{Math.sqrt(a)}");
    }
    static void factorielle(){
        System.out.println("entrer le numero: ");
        int a = input.nextInt();
        int f = 1;
        for (int i=1; i<=a; i++){
            f *= i;
        }System.out.println(STR."la factorielle de \{a} est : \{f}");


    }

    public static void main(String[] args) {

        int n;
        do {
            System.out.println("MENU");
            System.out.println("1: ADDITION");
            System.out.println("2: SOUSTRACTION");
            System.out.println("3: MULTIPLICATION");
            System.out.println("4: DIVISION");
            System.out.println("5: PUISSANCE");
            System.out.println("6: RACINE QUARRE");
            System.out.println("7: FACTORIELLE");
            System.out.println("8: QUITTER");

            System.out.println("ENTRER VOTRE CHOIX");
            n = input.nextInt();
            switch (n) {
                case 1:
                    addition();
                    break;
                case 2:
                    soustraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    puissance();
                    break;
                case 6:
                    racine();
                    break;
                case 7:
                    factorielle();
                    break;
                case 8:
                    System.out.println("quitter");
                    break;
                default:
                    System.out.println("choix invalid.");
            }
        }
        while (n != 8);
    }
}