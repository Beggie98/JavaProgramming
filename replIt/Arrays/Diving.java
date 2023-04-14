package Arrays;

import java.util.Scanner;

public class Diving {
    /*
    In the sport of diving, seven judges award a score between 0 and 10, where each score may be a floating-point value.
The highest and lowest scores are thrown out, and the remaining scores are added together.
The sum is then multiplied by the degree of difficulty for that dive.
The degree of difficulty ranges from 1.2 to 3.8 points. The total is then multiplied by 0.6 to determine the divers score.

Flow:
- Accept the 7 scores from the judges
- Accept the difficulty number
- Display the final score

```
Enter score for judge 1:
1
Enter score for judge 2:
5
Enter score for judge 3:
5
Enter score for judge 4:
5
Enter score for judge 5:
5
Enter score for judge 6:
8
Enter score for judge 7:
9
Enter difficulty:
2.1
Total: 35.28
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] scores = new int[7];
        int max = 0;
        int min = 10;
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Enter score for judge " + (i+1) + ":");
            scores[i] = input.nextInt();

            if (scores[i]>max){
                max = scores[i];
            }
            if (scores[i]<min){
                min = scores[i];
            }
            sum += scores[i];
        }

        sum = sum - min - max;
        double difficulty = 0;
        do {
            System.out.println("Enter difficulty: (from 1.2 to 3.8)");
            difficulty = input.nextDouble();
        }while (!(difficulty>=1.2 && difficulty <= 3.8));

        System.out.println("Total: " + (sum * difficulty * 0.6));
        input.close();

    }
}
