package day27_Recap;

public class Shopping {
    /*
    String[] items  = {"Shoes", "Jacket",  "Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index of "Gloves" (for loop)

        2. find out if "iPad" is contained in the item list (for loop or for each)

        3. Print a report of each shopping item (for loop)
        	name - price - #ID
     */
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket",  "Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        for (int i=0; i < items.length; i++){
            String each = items[i];
            if (each.equals("Gloves")){
                System.out.println(i);
                break;
            }
        }
        System.out.println("-----------------------------------");

        boolean hasIpad = false;
        for (String each : items){
            if (each.equals("iPad")){
                hasIpad = true;
            }
        }
        System.out.println("hasIpad = " + hasIpad);

        System.out.println("--------------------------------------");

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - $" + prices[i] + " - " + itemIDs[i]);
        }

    }
}
