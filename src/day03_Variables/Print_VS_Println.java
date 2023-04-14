package day03_Variables;

public class Print_VS_Println {

    public static void main(String[] args) {
        System.out.println("Hello Class"); // appends a new line after printing
        System.out.println("How are you today?");

        System.out.println("-------------------------------------------");

        System.out.print("Hello Class"); // does not append a new line after printing
        System.out.print(". How are you today?");

        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("JRE stands for Java Runtime Environment, JAVAC stands for Java Compiler, JDK stands for Java Development Kit");
        System.out.println("---------------------------------------------");
        System.out.print("JRE stands for Java Runtime Environment, ");
        System.out.print("JAVAC stands for Java Compiler, ");
        System.out.print("JDK stands for Java Development Kit");
    }

}
