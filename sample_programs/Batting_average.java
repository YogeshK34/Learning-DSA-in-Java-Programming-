package sample_programs;

public class Batting_average {
    public static void main(String[] args) {
        //to calculate batting average of virat kohli in ODI's
        // formula is (Batting average: = Total runs scored / Number of dismissals)
        // To calculate how many times a batter has been dismissed,
        // subtract the number of not outs from the number of innings played.
        int innings_played = 280;

        int not_outs = 44;

        int no_of_dismissal = innings_played - not_outs;

        int total_runs = 13848;

        float batting_average = (float)total_runs/no_of_dismissal;

        System.out.print("Batting average of Virat Kohli in ODI's is: " +batting_average);
    }
}
