public class Prostokat {
    
    public int bok1;
     public int bok2;
     public int obwod;
     public int pole;
    public Prostokat(int bok1, int bok2){
    
    this.bok1=bok1;
    this.bok2=bok2;
    }
    
    public int obwod(int bok1,int bok2){
    
    obwod=bok1+bok1+bok2+bok2;
    return obwod;
    }
    
    public int pole(int bok1,int bok2){
    
    pole=bok1*bok2;
            return pole;
    }
    
    public void Pokazdane(){
    
    System.out.println("Pierwszy bok prostoakta to: "+this.bok1);
     System.out.println("Drugi bok prostoakta to: "+this.bok2);
        System.out.println("Obwod prostokata= "+obwod(bok1,bok2));
        System.out.println("Pole prostokata= "+pole(bok1,bok2));
    } 
    
    
}
