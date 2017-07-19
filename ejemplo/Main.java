package ejemplo;

public class Main {
  
  public static void main(String[] args) {
    System.out.println("Hola");
    int s = suma(20,30);       
    System.out.println(s);
    int r = resta(25,17);
    System.out.println(r);
    
  }
      
   public static int suma (int n1,int n2){
     return  n1+n2 ;
     
    }
  public static int resta(int n1, int n2){
   
    return n1-n2 ;
  }
}