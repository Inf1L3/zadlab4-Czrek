public class Kula {

    public int r;
    public double pole;
    public double objetosc;
        
    public Kula(int r) {

        this.r = r;
    } 

    public double pole(int r) {

        pole = 4 * r * r * Math.PI;
        return pole;
    }

    public double objetosc(int r) {

        objetosc = 1.333 * r * r * r * Math.PI;
        return objetosc;
    }

    public void Pokazdane() {

        System.out.println("Pierwszy bok prostopadloscianu to: " + this.r);
        System.out.println("Pole kuli = " + pole(r));
        System.out.println("Objetosc kuli " + objetosc(r));
    }
}