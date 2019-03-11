package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK,
    PAPER,
    SCISSOR;
    private RockPaperScissorHandSign sign;


    public RockPaperScissorHandSign getWinner() {
        if (PAPER.equals(sign)) {
            return SCISSOR;
        } else if(SCISSOR.equals(sign)) {
            return ROCK;
        } else {
            return PAPER;
        }

    }

    public RockPaperScissorHandSign getLoser() {
        if (PAPER.equals(sign)) {
            return ROCK;
        } else if(SCISSOR.equals(sign)) {
            return PAPER;
        } else {
            return SCISSOR;
        }
    }
}
