public class Kolo {
    
    public int promien;
    public double obwod;
    public double pole;
    
    public Kolo(int promien){
    
        this.promien=promien;
        
        
    }
    
    public double obwod(double promien){
        
    obwod=2*promien*Math.PI;
    return obwod;
    }
    
    public double pole(double promien){
    
   return pole=promien*promien*Math.PI;
     
    }
    
    public void Pokazdane(){
        System.out.println("Promien kola to: "+promien);
        System.out.println("Obwod kola= "+obwod(promien));
        System.out.println("Pole kola= "+pole(promien));
        
    
    
    }
    
}