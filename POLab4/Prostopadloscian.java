public class Prostopadloscian {

    public int a;
    public int b;
    public int h; 
    public int pole;
    public int objetosc;

    public Prostopadloscian(int a, int b, int h) {

        this.a = a;
        this.b = b;
        this.h = h;
    }

    public int pole(int a, int b, int h) {
        pole = 2 * (a * b) + 2 * (b * h) + 2 * (a * h);
        return pole;
    }
    
    public int objetosc(int a, int b, int h){
        objetosc=a*b*h;
        return objetosc;
    }
    
    public void Pokazdane(){
    
        System.out.println("Pierwszy bok prostopadloscianu to: " + this.a);
        System.out.println("Drugi bok prostopadloscianu to: " + this.b);
        System.out.println("Wysokosc prostopadloscianu to: " + this.h);
        System.out.println("Pole prostopadloscianu = " + pole(a,b,h));
        System.out.println("Objetosc prostopadloscianu " + objetosc(a,b,h));
    }

} 