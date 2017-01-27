package studio2;
public class Pi {

  public static void computePi() {
     double ans = 0.0;
     int amount = 0;
     double inside = 0;
     double pi = 0;
     while (amount < 10000) {
    	 
     
    	 double dartX = Math.random();
    	 double dartY = Math.random();
    	 double distance = Math.sqrt(Math.pow(dartX, 2) + Math.pow(dartY, 2));
    	 
     if (distance <= 1) {
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
