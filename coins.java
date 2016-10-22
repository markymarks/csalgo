package combinations;

/**
 *
 * @author maamiranda
 */
public class combinations {
  public static void main (String args[]) {

     double  money = 572.75;

    int bills = (int) Math.floor(money/10);
    money -= bills * 10;

    int coins = (int) Math.floor(money/0.5);
    money -= coins * 0.5;

    int pesocoin = (int) Math.floor(money/0.1);
    money -= pesocoin * 0.1;

    int cents = (int) Math.floor(money/0.25);
    money -= cents * 0.25;

    
    System.out.println("25 cent coins: " + cents);
    System.out.println("10 peso bills: " + bills);
    System.out.println("5 peso coins: " + coins);
    System.out.println("1 peso coin: " + pesocoin);
    
  }
}