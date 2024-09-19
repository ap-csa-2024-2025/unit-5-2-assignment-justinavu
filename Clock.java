public class Clock
{
  public static void main(String[] args)
  {
          timeOfDay(0);   
          timeOfDay(8);   
          timeOfDay(12);  
          timeOfDay(14);
          timeOfDay(19);  
          timeOfDay(21);  
      }
  public static void timeOfDay(int hour) {
    if (hour == 0) {
        System.out.println("midnight");
    } else if (hour == 12) {
        System.out.println("noon");
    } else if (hour == 18) {
        System.out.println("dusk");
    } else if (hour > 0 && hour < 12) {
        System.out.println("morning");
    } else if (hour > 12 && hour < 18) {
        System.out.println("afternoon");
    } else if (hour > 18 && hour < 24) {
        System.out.println("evening");
    }
  }
}