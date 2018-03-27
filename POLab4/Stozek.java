public class Stozek {
    
   public int tworzaca;
   public int promien;
   public int wysokosc;
   public double pole;
   public double objetosc;
    
        public Stozek(int tworzaca,int promien, int wysokosc){
        this.tworzaca=tworzaca;
        this.promien=promien;
        this.wysokosc=wysokosc; 
        
        }
        
        public double pole(int tworzaca,int promien, int wysokosc){
            pole=(promien*promien*Math.PI)+tworzaca*promien*Math.PI;
        return pole;
        
        }
        
        public double objetosc(int tworzaca,int promien, int wysokosc){
            objetosc=0.3333*wysokosc*promien*promien*Math.PI;
            return objetosc;
        }
        
        public void Pokazdane(){
        
         System.out.println("Tworzaca stozka wynosci : " + this.tworzaca);
         System.out.println("Promien stozka to: " + this.promien);
         System.out.println("Wysokosc stozka to: " + this.wysokosc);
        System.out.println("Pole stozka = " + pole(tworzaca,promien,wysokosc));
        System.out.println("Objetosc stozka = " + objetosc(tworzaca,promien,wysokosc));
        }
}