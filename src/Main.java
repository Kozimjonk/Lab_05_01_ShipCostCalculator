public class Main
{

    public static void main(String[] args)
    {
	double itemPrice = 101.99;
    double shipCost = itemPrice * 0.02;
    double totalPrice = itemPrice + shipCost;
    if (itemPrice >= 100)
    {
        System.out.println("Your item price is: $" + itemPrice +" and your shipping is free! ");
    }
    else
    {
        System.out.println("Your item price is: $" + itemPrice + "and your shipping cost is: $" + shipCost + " Total: $" + totalPrice);

    }
    }
}
