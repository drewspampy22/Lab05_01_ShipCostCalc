public class Main
{
    public static void main(String[] args)
    {
        double ItemCost = 3.50;
        double ShipingCost = 0;
        double TotalCost = 0;

        if (ItemCost >= 100)
        {
           ShipingCost=0;
        }
        else
        {
            ShipingCost= ItemCost * 0.02;
        }

        TotalCost = ItemCost+ ShipingCost;
            System.out.println("Shipping cost is " + ShipingCost);
            System.out.println("Total cost is " + TotalCost);
    }

}