public class Szescian {

    public int a;
    public int pole;
    public int objetosc;

    public Szescian(int a) {

        this.a = a; 

    }

    public int pole(int a) {
        pole = (a * a) * 6;
        return pole;

    }

    public int objetosc(int a) {

        objetosc = a * a * a;
        return objetosc;
    }

    public void Pokazdane() {
        System.out.println(" Bok szescianu to: " + this.a);
        System.out.println("Pole szescianu = " + pole(a));
        System.out.println("Objetosc szescianu " + objetosc(a));

    }
}