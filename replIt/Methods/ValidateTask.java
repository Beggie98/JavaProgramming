package Methods;

public class ValidateTask {
    public static void main(String[] args) {
        System.out.println(validateTask(false,7,6));
    }

    public static boolean validateTask(boolean param, int taskId, int currentId){
        if (param == true && taskId == currentId + 1){
            return true;
        }
        return false;
    }


}
