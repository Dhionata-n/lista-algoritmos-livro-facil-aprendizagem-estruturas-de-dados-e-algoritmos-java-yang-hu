import entities.Scores;

public class Main {
    public static void main(String[] args) {
        int [] scores = {60, 50, 95, 80, 70};
        Scores.sort(scores);

        for (int scor:scores
             ) System.out.print(scor + ", ");


    }
}