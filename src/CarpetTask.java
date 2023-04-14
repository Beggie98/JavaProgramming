import java.util.ArrayList;
import java.util.Arrays;

class Carpet{
    public int width, length;
    public double unitPrice;
    public boolean isPersian;

    public void customerOrder(int width, int length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        double totalPrice = (width*length)*unitPrice;
        if (isPersian){
            totalPrice += 200;
        }

        return totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total cost=$" + calcCost() +
                '}';
    }
}

public class CarpetTask {
    public static void main(String[] args) {

        day38_CustomClass.carpetTask.Carpet carpet1 = new day38_CustomClass.carpetTask.Carpet();
        day38_CustomClass.carpetTask.Carpet carpet2 = new day38_CustomClass.carpetTask.Carpet();
        day38_CustomClass.carpetTask.Carpet carpet3 = new day38_CustomClass.carpetTask.Carpet();
        day38_CustomClass.carpetTask.Carpet carpet4 = new day38_CustomClass.carpetTask.Carpet();
        day38_CustomClass.carpetTask.Carpet carpet5 = new day38_CustomClass.carpetTask.Carpet();

        carpet1.customerOrder(3,2,100,true);
        carpet2.customerOrder(2,1,80,false);
        carpet3.customerOrder(1,4,130,false);
        carpet4.customerOrder(2,2,95,true);
        carpet5.customerOrder(3,5,150,true);

        day38_CustomClass.carpetTask.Carpet[] carpets = {carpet1, carpet2, carpet3, carpet4, carpet5};
         /*
        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};

        carpets[0].customerOrder(3,2,100,true);
        carpets[1].customerOrder(2,1,80,false);
        carpets[2].customerOrder(1,4,130,false);
        carpets[3].customerOrder(2,2,95,true);
        carpets[4].customerOrder(3,5,150,true);

         */

        ArrayList<day38_CustomClass.carpetTask.Carpet> allCarpets = new ArrayList<>();
        allCarpets.addAll(Arrays.asList(carpets));

        ArrayList<day38_CustomClass.carpetTask.Carpet> persianCarpets = new ArrayList<>();
        //ArrayList<Carpet> regularCarpets = new ArrayList<>();

        for (day38_CustomClass.carpetTask.Carpet each : allCarpets) {
            if (each.isPersian){
                persianCarpets.add(each);
            }
            //else {
            //    regularCarpets.add(each);
            //}
        }

        for (day38_CustomClass.carpetTask.Carpet each : persianCarpets) {
            System.out.println(each);
        }

        System.out.println("---------------------------------------------");

        ArrayList<day38_CustomClass.carpetTask.Carpet> regularCarpets = new ArrayList<>(allCarpets);
        regularCarpets.removeIf(p -> p.isPersian);

        for (day38_CustomClass.carpetTask.Carpet each : regularCarpets) {
            System.out.println(each);
        }

        System.out.println("Total persian carpets: " + persianCarpets.size());
        System.out.println("Total regular carpets: " + regularCarpets.size());

    }

}
