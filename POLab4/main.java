import java.util.Scanner;
 public class main {
 
public static void main(String[] args) {

         // zad 4
         Scanner in= new Scanner(System.in);
         System.out.println("Wybierz figure:");
        System.out.println("1-- Kolo");
        System.out.println("2-- Kwadrat");
        System.out.println("3-- Prostokat");
        System.out.println("4-- Szescian");
        System.out.println("5-- Prostopadloscian");
        System.out.println("6-- Kula");
        System.out.println("7-- Stozek");
      
 int figura = in.nextInt();

        switch (figura) {
            case 1:
                System.out.println("Wprowadz promien");

                int r = in.nextInt();
                Kolo kolo1 = new Kolo(r);
                kolo1.Pokazdane();break;
              
            case 2:
                System.out.println("Wprowadz bok");
                int a=in.nextInt();
                Kwadrat kwadrat1= new Kwadrat(a);
                
                kwadrat1.Pokazdane();break;
                
            case 3:
                System.out.println("Wprowadz 1 bok");
                int b=in.nextInt();
                System.out.println("Wprowadz2 bok");
                int c=in.nextInt();
                Prostokat prostokat1= new Prostokat(b,c);
                prostokat1.Pokazdane();break;
            case 4:
                System.out.println("Wprowadz bok");
                int d=in.nextInt();
                Szescian szescian1= new Szescian(d);
                szescian1.Pokazdane();break;
            case 5:
                System.out.println("Wprowadz pierwszy bok");
                int z=in.nextInt();
                System.out.println("Wprowadz drugi bok");
                int y=in.nextInt();
                System.out.println("Wprowadz wysokosc");
                int x=in.nextInt();
                Prostopadloscian prosto1 = new Prostopadloscian(z,y,x);
                prosto1.Pokazdane();break;               
            case 6:
                System.out.println("Wprowadz promien");
                int p=in.nextInt();
                Kula kula1= new Kula(p);
                kula1.Pokazdane();break;
            case 7:
               System.out.println("Wprowadz bok");
                int m=in.nextInt();
                System.out.println("Wprowadz promien");
                int n=in.nextInt();
                System.out.println("Wprowadz wysokosc");
                int l=in.nextInt();
                Stozek stozek1= new Stozek(m,n,l);
                stozek1.Pokazdane();break;
        }
   
        // zad 5
        
        
       Student[] t = new Student[100];
        for (int i = 0; i < 100; i++) {

            t[i] = new Student("", "", 0, "", 0);

        }
        System.out.println("Co chcesz zrobic?: ");
        System.out.println("1)Wprowadz dane studenta pod wybrany indeks tablicy");
        System.out.println("2)Edytuj dane studenta z pod wybranego indeksu");
        System.out.println("3)Usun dane studenta");
        System.out.println("4)Wyswietl wszystkich studentow");
        System.out.println("5)Wyswietl dane wybranego studenta");
    in = new Scanner(System.in);
        int a = in.nextInt();

        switch (a) {
            case 1:
                System.out.println("1-- Wprowadz ktory ma to byc student z zakresu od 1 do 100");
                int ix1 = in.nextInt();
                t[ix1].wprowadzDane();
                break;
            case 2:
                System.out.println("1)Wprowadz numer indeksu (od 1 do 100)");
                int ix2 = in.nextInt();
                t[ix2].wprowadzDane();
                break;
 
            case 3:
                System.out.println("1)Wprowadz numer indeksu (od 1 do 100)");
                int ix3 = in.nextInt();
                t[ix3] = new Student("", "", 0, "", 0);
                t[ix3].pokazDane();
                break;
            case 4:
                System.out.println("Wszyscy Studenci");
                for (int i = 0; i < 100; i++) {
                    t[i].pokazDane();
                }
                break;

            case 5:
                System.out.println("1)Wprowadz numer indeksu (od 1 do 100)");
                int ix5 = in.nextInt();
                t[ix5].pokazDane();
                break;

        }

    }

} 
     

