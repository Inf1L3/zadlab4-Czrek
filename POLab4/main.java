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

                int a = in.nextInt();
                Kolo kolo1 = new Kolo(a);
                kolo1.Pokazdane();break;
              
            case 2:
                System.out.println("Wprowadz bok");
                int b=in.nextInt();
                Kwadrat kwadrat1= new Kwadrat(b);
                
                kwadrat1.Pokazdane();break;
                
            case 3:
                System.out.println("Wprowadz 1 bok");
                int c=in.nextInt();
                System.out.println("Wprowadz2 bok");
                int d=in.nextInt();
                Prostokat prostokat1= new Prostokat(c,d);
                prostokat1.Pokazdane();break;
            case 4:
                System.out.println("Wprowadz bok");
                int e=in.nextInt();
                Szescian szescian1= new Szescian(e);
                szescian1.Pokazdane();break;
            case 5:
                System.out.println("Wprowadz pierwszy bok");
                int f=in.nextInt();
                System.out.println("Wprowadz drugi bok");
                int g=in.nextInt();
                System.out.println("Wprowadz wysokosc");
                int h=in.nextInt();
                Prostopadloscian prosto1 = new Prostopadloscian(f,g,h);
                prosto1.Pokazdane();break;               
            case 6:
                System.out.println("Wprowadz promien");
                int i=in.nextInt();
                Kula kula1= new Kula(i);
                kula1.Pokazdane();break;
            case 7:
               System.out.println("Wprowadz bok");
                int j=in.nextInt();
                System.out.println("Wprowadz promien");
                int k=in.nextInt();
                System.out.println("Wprowadz wysokosc");
                int l=in.nextInt();
                Stozek stozek1= new Stozek(j,k,l);
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
                int indeks1 = in.nextInt();
                t[indeks1].wprowadzDane();
                break;
            case 2:
                System.out.println("1)Wprowadz numer indeksu (od 1 do 100)");
                int indeks2 = in.nextInt();
                t[indeks2].wprowadzDane();
                break;
 
            case 3:
                System.out.println("1)Wprowadz numer indeksu (od 1 do 100)");
                int indeks3 = in.nextInt();
                t[indeks3] = new Student("", "", 0, "", 0);
                t[indeks3].pokazDane();
                break;
            case 4:
                System.out.println("Wszyscy Studenci");
                for (int i = 0; i < 100; i++) {
                    t[i].pokazDane();
                }
                break;

            case 5:
                System.out.println("1)Wprowadz numer indeksu (od 1 do 100)");
                int indeks4 = in.nextInt();
                t[indeks4].pokazDane();
                break;

        }

    }

} 
     

