public  class SportsTeam implements yell
{
    public static String teamName;//creates a team name vaiable that is public
    public static double wins;//creates a win variable which is public
    public static double losses;//creates a losses varible which is public
    public static String league;//creates a league varible which is public
    public static String conference;//creates a conference varible which is public
    public static String division;//creates a division varibale which is public
    public static String coach;//creates a coach variable whiich is public
    public static int championships;//creates a championship variable which iss public
    public SportsTeam()//0 arg constructor
    {
        teamName= "Golden State Warriors";
        wins= 73;
        losses= 9;
        league= "National Basketball Association";
        conference= "Western";
        division= "Pacific";
        coach= "Steve Kerr";
        championships= 4;
    }
    public SportsTeam(String teamName, int wins, int losses, String league, String conference, String division, String coach, int championships)//multi arg constructor
    {
        this.teamName=teamName;
        this.wins=wins;
        this.losses=losses;
        this.league=league;
        this.conference=conference;
        this.division=division;
        this.coach=coach;
        this.championships=championships;
        System.out.println("The " + teamName + " play in the " + league + " in the " + conference + " and the " + division + "." + "\nTheir coach is " + coach + " and they have a win percentage of " 
            + calcWinPercentage() + " and have won " + championships + " championship(s)");
    }
    public void yell()//acceses the interface
    {
        System.out.print("Hello");
    }
    public String getName()
    {
        return this.teamName;
    }
    public double getWins()
    {
        return this.wins;
    }
    public double getLosses()
    {
        return this.losses;
    }
    public String getLeague()
    {
        return this.league;
    }
    public String getConference()
    {
        return this.conference;
    }
    public String getDivision()
    {
        return this.division;  
    }
    public String getCoach()
    {
        return this.coach;
    }
    public int getChampionships()
    {
        return this.championships;
    }
    public double calcWinPercentage()
    {
        double WP;
        WP = Math.round((this.wins/this.losses)*1000)/100.0;
        return WP;
    }
    public String toString()
    {
        String output = new String();
        System.out.println("The " + teamName + " play in the " + league + " in the " + conference + " and the " + division + "." + "\nTheir coach is " + coach + " and they have a win percentage of " 
            + calcWinPercentage() +  "%% and have won " + championships + " championships(s)");
        return output;
    }
}