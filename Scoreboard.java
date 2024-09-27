public class Scoreboard
{
    private String teamOne;
    private String teamTwo;
    private int teamOneScore;
    private int teamTwoScore;
    private String activeTeam;
    public int switches=1;


public Scoreboard(String one, String two)
    {
        teamOne = one;
        teamTwo = two;
        activeTeam = teamOne;
    }

    public String getScore()
    {
        return teamOneScore + "-" + teamTwoScore + "-" + activeTeam;
    }

    public void recordPlay(int score)
    {
        //if score is 0, this means they didnt score any points therefore switching active team, else it'll add score to whichever team is active
        if(score==0)
        {
            switches++;
        }
        else if (activeTeam==teamOne)
        {
            teamOneScore=teamOneScore+score;
        }
        
        else
        {
            teamTwoScore=teamTwoScore+score;
         }

        //checks which team is the active team

        if (switches%2==0)
        {
            activeTeam= teamTwo;
        }
        else 
        {
            activeTeam= teamOne;
        }
    }
}

