public class Komplex {

    private double x; // Re{z = x + iy} (Realteil)
    private double y; // Im{z = x + iy} (Imaginärteil)


    //Default Konstruktor mit z = 0
    public Komplex() {
        this.x = 0;
        this.y = 0;
    }

    /** Konstruktor mit Parametern
     * @param x für den Realteil Re{z}
     * @param y für den Imaginärteil Im{z}
     */
    public Komplex(double x, double y) {
        this.x = x;
        this.y = y;
    }


    //***************************
    // Getters und Setters

    /** Gibt den Realteil zurück
     * @return Realteil
     */
    public double getX() {
        return this.x;
    }

    /** Gibt den Imaginärteil zurück
     * @return Imaginärteil
     */
    public double getY() {
        return this.y;
    }

    /** Setzt den Realteil
     * @param x neuer Realteil
     */
    public void setX(double x) {
        this.x = x;
    }

    /** Setzt den Imaginärteil
     * @param y neuer Imaginärteil
     */
    public void setY(double y) {
        this.y = y;
    }
    //***************************

    /** Addiert eine komplexe Zahl zu dieser
     * @param z komplexe Zahl zum Addieren
     */
    public void addiere(Komplex z) {
        this.x = this.x + z.x;
        this.y = this.y + z.y;
    }

    /** Multipliziert eine komplexe Zahl mit dieser
     * @param z komplexe Zahl zum Multiplizieren
     */
    public void multipliziere(Komplex z) {
        //z1*z2 = (x1*x2 - y1*y2) + i(x1*y2 + y1*x2)

        double tempX = this.x * z.x - this.y * z.y; // reel
        double tempY = this.x * z.y + this.y * z.x; // imag

        this.x = tempX;
        this.y = tempY;
    }

    /** Berechnet den Betrag der komplexen Zahl
     * @return Betrag der Zahl
     */
    public double getBetrag() {
        return
                Math.sqrt(
                        Math.pow(this.x, 2) +
                                Math.pow(this.y, 2)
                );
    }

    /** Gibt die komplexe Zahl als String zurück
     * @return Darstellung der Zahl als String
     */
    @Override
    public String toString() {
        if (this.y == 0) {
            return this.x + "";
        } else if (this.x == 0) { // Bedingung ? Wert_wenn_true : Wert_wenn_false
            return this.y == 1 ? "i" : this.y == -1 ? "-i" : this.y + "i";
        } else { // Bedingung ? Wert_wenn_true : Wert_wenn_false
            return this.x + " + " + (this.y == 1 ? "i" : this.y + "i");
        }
    }

    /** Berechnet die Quadratwurzel der komplexen Zahl
     * @return Array mit den beiden Quadratwurzeln
     */
    public Komplex[] getWurzel() {
        // Wenn die Zahl 0 ist, gibt zwei 0 Komplexzahlen zurück
        if (this.x == 0 && this.y == 0)
            return new Komplex[] { new Komplex(0, 0), new Komplex(0, 0) };

        // Winkelberechnung für Quadratwurzel (durch 2 geteilt)
        double winkel = Math.atan2(y, x);

        // Berechnet die beiden Quadratwurzeln
        Komplex wurzel1 = new Komplex(
                Math.sqrt(this.getBetrag()) * Math.cos(winkel / 2),
                Math.sqrt(this.getBetrag()) * Math.sin(winkel / 2)
        );
        Komplex wurzel2 = new Komplex(
                Math.sqrt(this.getBetrag()) * Math.cos(((winkel / 2) + Math.PI)),
                Math.sqrt(this.getBetrag()) * Math.sin((winkel / 2) + Math.PI)
        );

        return new Komplex[] { wurzel1, wurzel2 };
    }

    /** Gibt die Summe der beiden komplexen Zahlen zurück
     * @param z komplexe Zahl (Objekt)
     * @return Summe der komplexen Zahlen als Objekt
     */
    public Komplex getSumme(Komplex z) {
        Komplex temp = new Komplex(0, 0);
        temp.setX(z.getX() + this.x);
        temp.setY(z.getY() + this.y);
        return temp;
    }

    /** Gibt das Produkt der beiden komplexen Zahlen zurück
     * @param z komplexe Zahl (Objekt)
     * @return Produkt der komplexen Zahlen als Objekt
     */
    public Komplex getProdukt(Komplex z) {
        Komplex temp = new Komplex(0, 0);
        temp.setX(this.x * z.x - this.y * z.y ); //reel
        temp.setY(this.x * z.y + this.y * z.x);
        return temp;
    }

}