class Prizes
{
    protected int winnings, answerCount, dropOut;

    public Prizes ()
    {
  winnings = 0;
	answerCount = 0;
    }


    public void add ()
    {
	answerCount += 1;
    }


    public int dropOut ()
    {
	if (getWinnings < 25000)
	    return 0;
	else
	    return 25000;
    }


    public int getWinnings ()
    {
	if (answerCount == 1)
	    winnings = 1000;
	if (answerCount == 2)
	    winnings = 2000;
	if (answerCount == 3)
	    winnings = 5000;
	if (answerCount == 4)
	    winnings = 10000;
	if (answerCount == 5)
	    winnings = 25000;
	if (answerCount == 6)
	    winnings = 50000;
	if (answerCount == 7)
	    winnings = 100000;
	if (answerCount == 8)
	    winnings = 175000;
	if (answerCount == 9)
	    winnings = 300000;
	if (answerCount == 10)
	    winnings = 500000;
	return winnings;
    }
}
