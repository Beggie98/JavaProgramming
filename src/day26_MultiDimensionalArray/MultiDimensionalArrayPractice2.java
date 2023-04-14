package day26_MultiDimensionalArray;

public class MultiDimensionalArrayPractice2 {
    public static void main(String[] args) {
        /*
        String[] group1 = {"Selda", "Ibrahim", "Temerland", "Mehmut", "Sina"},
                group2 = {"Sabir", "Abbos", "Kseniia", "Vitalii", "Merve"},
                group3 = {"Oz", "Ibrahim", "Davut", "Dontrell", "Muhammed"},
                group4 = {"Inesa", "Aysu", "Suat", "Esra"},
                group5= {"Ahmed", "Ahmet", "Igor","Andrei", "Mykyta"};

         */
        String[][] cybertekGroups = {
                {"Selda", "Ibrahim", "Temerland", "Mehmut", "Sina"},
                {"Sabir", "Abbos", "Kseniia", "Vitalii", "Merve"},
                {"Oz", "Ibrahim", "Davut", "Ahmed", "Dontrell", "Muhammed"},
                {"Inesa", "Aysu", "Ahmed", "Suat", "Esra"},
                {"Ahmed", "Ahmet", "Igor","Andrei", "Mykyta"}
        };

        int count = 0;
        for (String[] arr1D : cybertekGroups){
            for (String element : arr1D) {
                if (element.equals("Ahmed")){
                    count++;
                }
            }
        }
        System.out.println(count);


    }
}
