package studio2;
public class Pi {

  public static void computePi() {
     double ans = 0.0;
     int amount = 0;
     double inside = 0;
     double pi = 0;
     while (amount < 10000) {
    	 
     
    	 double random = Math.random();
     double dart = (Math.sqrt(2)) * random;
     if (dart <= 1) {
    	 inside = inside + 1;
     }
    
     
     amount = amount + 1;
     }
     System.out.println(inside);
     double ratio = inside / 10000;
     pi = ratio * 4;
     System.out.println("Our group shows Pi = " + pi);
  }

  public static void main(String[] args) {
     computePi();
  }
}
