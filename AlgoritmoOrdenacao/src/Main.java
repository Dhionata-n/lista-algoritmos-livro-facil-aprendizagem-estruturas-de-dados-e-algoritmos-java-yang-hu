import entities.Scores;

public class Main {
    public static void main(String[] args) {
        int [] scores = {60, 50, 95, 80, 70};
        Scores.sort(scores);

        for (int scor:scores
             ) System.out.print(scor + ", ");
        System.out.println();
        int [] scores2 = {200, 10, 25, 89, 60};
        Scores.sort2(scores2);

        for (int scor:scores2
        ) System.out.print(scor + ", ");

    }
}