import java.util.Scanner;

public class Student {

    public String imie;
    public String nazwisko;
    public int nr_indeksu;
    public String nazwa_spec;
    public int rok;
    Scanner input= new Scanner(System.in);

    public Student(String imie, String nazwisko, int nr_indeksu, String nazspec, int rok) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
        this.nazwa_spec = nazspec;
        this.rok = rok;
    }

    public Student(String imie) {

        this.imie = imie;
    }

    public Student(String nazwisko, String imie) {

        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Student(int rok, String imie) {

        this.rok = rok;
        this.imie = imie;
    }

    public Student(int rok) {

        this.rok = rok;
    }

     public void pokazDane() {
        System.out.println("Osoba");
        System.out.println("imię: " + this.imie);
        System.out.println("nazwisko: " + this.nazwisko);
        System.out.println(this.nr_indeksu);
        System.out.println(this.nazwa_spec);
        System.out.println(this.rok);
    }
    public void wprowadzDane(){
        
        System.out.println("Imie: ");
        imie=input.nextLine();
        System.out.println("Nazwisko: ");
        nazwisko=input.nextLine();
        System.out.println("Nr_indeksu: ");
        nr_indeksu=input.nextInt();
        System.out.println("Nazwa specjalizacji: ");
        nazwa_spec=input.next();
        System.out.println("Rok: ");
        rok=input.nextInt();
    
    }
} 