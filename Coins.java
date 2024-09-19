public class Coins
{
  public static void main(String[] args) {
    coinConverter(1179); 
    coinConverter(199);    
    coinConverter(275);  
    coinConverter(6);     
}

public static void coinConverter(int pennies) {
    int dollars = pennies / 100;
    pennies %= 100; 

    int quarters = pennies / 25;
    pennies %= 25; 

    int dimes = pennies / 10;
    pennies %= 10; 

    int nickels = pennies / 5;
    pennies %= 5; 

    System.out.println("Dollar Bills: " + dollars);
    System.out.println("Quarters: " + quarters);
    System.out.println("Dimes: " + dimes);
    System.out.println("Nickels: " + nickels);
    System.out.println("Pennies: " + pennies);
    System.out.println("--------------------------------");
}
}
