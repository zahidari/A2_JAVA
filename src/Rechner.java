import java.util.Scanner;

public class Rechner {

    private double  x;
    private double y;

    //******************* Constructors ***************************************


    // Constructor with both parameters
    public Rechner() {
        this.x = 0;
        this.y = 0;
    }

     //********************* GETTER SETTER **********************************
    public double getX (){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    //********************* Methods ****************************************

    private double addieren(){
        return  x + y;
    }
    private double subtrahieren(){
        return  x - y;
    }

    private double multiplizieren(){
        return  x * y;
    }

    private double dividieren(){
        if(y == 0){
            System.out.println("Sie können nicht durch 0 teilen. 0 wird zurückgegeben.");
            return 0;
        }

        return  x / y;
    }
    //*******************************************************************

    public void printMenu(){
        System.out.println("Bitte waehlen Sie eine Operation:");
        System.out.println("1 : Addieren");
        System.out.println("2 : Subtrahieren");
        System.out.println("3 : Multiplizieren");
        System.out.println("4 : Dividieren");
        System.out.println("5: PROGRAMM BEENDEN");
    }


    /** liest die Eingabe des Users und gibt den Integer wert von 1 bis 5 zurück.
     *
     * @return eingabewert, beim falschen Umwandlung wird -1 zurückgegeben.
     */
    public int eingabeLesen(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl zwischen 1-5 ein.");

       int eingabe = -1;


       // String to Integer umwandeln
       try{
            eingabe =  (sc.nextInt());

        } catch (Exception e){
            System.out.println("falsche Eingabe.");
        }

        return eingabe;
    }
    public int wertLesen(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte erste Zahl eingeben:");

        int eingabe;
        int counter = 0;
        while(true) {

            // String to Integer umwandeln
            try {
                eingabe = Integer.parseInt(sc.nextLine());
                break;
            } catch (ClassFormatError e) {
                System.out.println("falsche Eingabe. geben Sie eine double Zahl ein:");
                counter ++;
                if(counter == 3){
                    throw new NumberFormatException("3 mal falsche Zahl eingegenen. Exit Programm..");
                }
            }
        }
        return eingabe;
    }

    public double calculate(int i) throws Exception {
        switch (i){
            case 1: return addieren();
            case 2: return subtrahieren();
            case 3: return multiplizieren();
            case 4: return dividieren();
        }

        return 0;
    }


}
