import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
//
//        Rechner r = new Rechner();
//
//
//        while (true) {
//            int eingabe = r.eingabeLesen();
//
//
//            if (eingabe == -1)
//                continue;
//
//
//            if(eingabe == 5)
//                break;
//
//
//            r.setX(r.wertLesen());
//            r.setY(r.wertLesen());
//
//            //kalkulliert den ergebnis nach der
//            double result = r.calculate(eingabe);
//            System.out.println(result);
//
//        }
//        System.out.println("Programm beendet.");

        Komplex z = new Komplex(0,0); // z := 0
        System.out.println("z = " + z);
        z = new Komplex(1,0); // z := 1
        System.out.println("z = " + z);
        z = new Komplex(0,1); // z := i
        System.out.println("z = " + z);
        z = new Komplex(-4,0); // z := -4
        System.out.println("z = " + z);
        Komplex[] wurzeln = z.getWurzel(); // => 2i und -2i
        System.out.println("sqrt(z) = " + Arrays.toString(wurzeln));
        z = new Komplex(1,1); // z := 1+i
        System.out.println("z = " + z);
        double betrag = z.getBetrag();
        System.out.println("|z| = " + betrag); // => sqrt(2) = 1.41...
        Komplex z2 = new Komplex(2,1); // z2 := 2+i
        System.out.println("z2 = " + z2);
        z.addiere(z2); // z := z+z2 = 3.0 + 2.0i
        System.out.println("z nach Addition von z2 = " + z);
        z.multipliziere(z2); // z := z*z2 = 4.0 + 7.0i
        System.out.println("z nach Multiplikation von z2 = " + z);
        z2 = z.getProdukt(new Komplex(-1,0)); // z2 := -z = -4.0 - 7.0i
        System.out.println("z2 = " + z2);
        Komplex summe = z.getSumme(z2); // summe := z + z2 = 0
        System.out.println("summe = " + summe);
    }





}