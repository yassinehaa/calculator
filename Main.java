import java.util.Scanner;

 public class Main {

    static void addition(Scanner input){
        System.out.print("Enter a: ");
        float a = input.nextInt();
        System.out.print("Enter b: ");
        float b = input.nextInt();
        System.out.println(a + b);
    }

    static void soustraction(Scanner input){
        System.out.print("Enter a: ");
        float a = input.nextInt();
        System.out.print("Enter b: ");
        float b = input.nextInt();
        System.out.println(a - b);
    }

    static void multiplication(Scanner input){
        System.out.print("Enter a: ");
        float a = input.nextInt();
        System.out.print("Enter b: ");
        float b = input.nextInt();
        System.out.println(a * b);
    }

    static void division(Scanner input){
        System.out.print("Enter a: ");
        float a = input.nextInt();
        System.out.print("Enter b: ");
        float b = input.nextInt();
        System.out.println(a / b);

    }
    static void puissance (Scanner input){
        System.out.println("entrer a: ");
        float a = input.nextInt();
        System.out.println("entrer b: ");
        float b = input.nextInt();
        System.out.println(STR."la puissance de \{a}^ \{b} est: \{Math.pow(a, b)}");
    }
    static void racine(Scanner input){
        System.out.println("entrer le numero: ");
        float a = input.nextInt();
        System.out.println(STR."la racine carré est /\{Math.sqrt(a)}");
    }
    static void factorielle(Scanner input){
        System.out.println("entrer le numero: ");
        int a = input.nextInt();
        int f = 1;
        for (int i=1; i<=a; i++){
            f *= i;
        }System.out.println(f);


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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

            System.out.println("ENTRER VOTRE COIX");
            n = input.nextInt();
            switch (n) {
                case 1:
                    addition(input);
                    break;
                case 2:
                    soustraction(input);
                    break;
                case 3:
                    multiplication(input);
                    break;
                case 4:
                    division(input);
                    break;
                case 5:
                    puissance(input);
                    break;
                case 6:
                    racine(input);
                    break;
                case 7:
                    factorielle(input);
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

