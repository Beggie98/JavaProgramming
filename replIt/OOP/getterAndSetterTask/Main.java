package OOP.getterAndSetterTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter data");
        String data = input.nextLine();
        System.out.println("Enter yint");
        int yint = input.nextInt();
        Db db = new Db(data, yint);

        System.out.println(db.getData());//aaa
        System.out.println(db.getYint());//123

        input.nextLine();

        System.out.println("Set data");
        String data1 = input.nextLine();
        System.out.println("Set yint");
        int yint1 = input.nextInt();

        db.setData(data1);
        db.setYint(yint1);

        System.out.println(db.getData());//zzz
        System.out.println(db.getYint());//200
        input.close();
    }
}
