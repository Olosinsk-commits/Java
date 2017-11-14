package essayclass;

/**
 * Essay Class (#4)
 * This class extends the GradedActivity class. 
 * @author olga.osinskaya
 */
public class Essay extends GradedActivity {

    private int Grammar; //to hold the Grammar score
    private int pointsSpelling; //to hold the pointsSpelling score
    private int length; //to hold lenght
    private int pointsContent; //to hold pointsContent

    /**
     * The constructor sets the student's scores
     *
     * @param gr
     * @param ps
     * @param l
     * @param pc
     */
    public Essay(int gr, int ps, int l, int pc) {
        //call the superclass constructor
        int numericScore;
        Grammar = gr;
        pointsSpelling = ps;
        length = l;
        pointsContent = pc;

        numericScore = Grammar + pointsSpelling + length + pointsContent;

        //call the inherited setScore method to set the numeric score
        setScore(numericScore);

    }
/**
 * The getGrammar method returns the grammar score
 * @return the value in the Grammar field
 */
    public int getGrammar() {
        return Grammar;
    }
/**
 * The getPointsSpelling method returns the Spelling score
 * @return the value in the pointsSpelling field
 */
    public int getPointsSpelling() {
        return pointsSpelling;
    }
/**
 * The getLength method returns the score for size of essay
 * @return the value in the length field
 */
    public int getLength() {
        return length;
    }
/**
 * The getPointsContent method returns the Points Content score
 * @return the value in the pointsContent field
 */
    public int getPointsContent() {
        return pointsContent;
    }
}
