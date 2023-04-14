package day11_Switch;

public class GradeReport {
    public static void main(String[] args) {
        char grade = 'C';
        String report = "";

        switch (grade){
            case 'A': report = "excellent";
            break;
            case 'B': report = "great job";
            break;
            case 'C': report = "good";
            break;
            case 'D': report = "passed";
            break;
            case 'F': report = "failed";
            break;
            default: report = "Invalid";
            break;

        }
        System.out.println(grade + ": " + report);

    }
}
