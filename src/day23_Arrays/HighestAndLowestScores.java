package day23_Arrays;

public class HighestAndLowestScores {
    public static void main(String[] args) {
        String[] names = {"Mike", "Adam", "Tonny", "John", "Ammy"};
        int[] scores = {85,70,95,90,100};
        int max = scores[0];
        int min = scores[0];
        String maxName = "";
        String minName = "";

        for (int i=0; i<scores.length;i++){
            int eachScore = scores[i];//gets each score from the array scores
            String eachName = names[i];//gets each name from the array names

            if (eachScore  > max){
                max = eachScore;
                maxName = eachName;
            }

            if (eachScore < min){
                min = eachScore;
                minName = eachName;
            }
        }
        System.out.println(maxName + " has the highest score of " + max);
        System.out.println(minName + " has the lowest score of " + min);


    }
}
