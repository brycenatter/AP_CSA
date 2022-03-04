public class Main {
  public static void main(String[] args) {
    int x = 10;
    int y = 20;
    System.out.println (x+" "+y);
    swap(x, y);
    System.out.println (x+" "+y);
  }
 
  public static void swap(int x, int y){
      int c = y;
      y = x;
      x = c;
      System.out.println (x+" "+y);
  }

}