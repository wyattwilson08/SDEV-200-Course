//Wyatt Wilson
//p.141

public class DogTriathlonParticipant {
    private final int NUM_EVENTS;
    private static int totalCumulativeScore = 0;
    private String name;
    
    private int obedienceScore;
    private int conformationScore;
    private int agilityScore;
    private int total;
    private double avg;

    public DogTriathlonParticipant(String name,
            int numEvents, int score1, int score2, int score3) {
        this.name = name;
        this.NUM_EVENTS = numEvents;
        this.obedienceScore = score1;
        this.conformationScore = score2;
        this.agilityScore = score3;
        this.total = this.obedienceScore + this.conformationScore + this.agilityScore;
        this.avg = (double) this.total / this.NUM_EVENTS;
        totalCumulativeScore += this.total;
    }

    public void display() {
        System.out.println(this.name + " participated in " +
                this.NUM_EVENTS +
                " events and has an average score of " + this.avg);
        System.out.println(" " + this.name +
                " has a total score of " + this.total +
                " bringing the total cumulative score to  " +
                totalCumulativeScore);
    }
}