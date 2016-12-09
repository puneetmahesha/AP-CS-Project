
public class Warriors extends SportsTeam implements yell
{
    private boolean starter;//true/false to see if the player is on the bench true=starter false=bench
    private String lastName;//first name of the player
    private String firstName;//last name of the player
    private String position;//what position the player plays
    private int number;//what number the player is aka the number on the back of their jeresy
    private double weight;//how much the player weighs in lbs
    private int hFeet;//the feet componet of the player
    private int hInches;//the inches component of the the players height
    private double FGA;//how many filed goals the player has attaempted
    private double FGM;//how many of the attempted flield goals tha player has made
    private double tPA;//how many three pointers the player has attampted
    private double tPM;//how many of the three ponters that are made
    private double FTA;//the amount of freethrows that are atempted
    private double FTM;//the number of freethrows that are made
    public Warriors()//zero arg constructor that sets values for each player
    {
        super();
        firstName="Kevon";
        lastName="Looney";
        position="Center";
        starter= false;
        weight= 200.0;
        hFeet = 7;
        hInches = 0;
        FGA = 0.0;
        FGM = 0.0;
        tPA = 0.0;
        tPM = 0.0;
        FTA = 0.0;
        FTM = 0.0;
    }//end 0 arg
    public Warriors(String firstName, String lastName, String position, boolean starter, int number, double weight, int hFeet, int hInches, double FGA, double FGM, double tPA, double tPM, double FTA, double FTM)
    //multi arg constuctor for inputs, this is accesses by the arraylist and the arrays
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.number = number;
        this.starter = starter;
        this.weight = weight;
        this.hFeet = hFeet;
        this.hInches= hInches;
        this.FGA = FGA;
        this.FGM = FGM;
        this.tPA = tPA;
        this.tPM = tPM;
        this.FTA = FTA;
        this.FTM = FTM;
    }//end multi arg
    public void yell()//accesees the interface which supplies the value in the driver
    {
        System.out.println("We are Dub-Nation!!!");
    }
    public String getLastName()//acceses the last name of each player in case of change
    {
        return this.lastName;
    }
    public double getFGA()//get the FGA in case of change
    {
        return this.FGA;
    }//end getter
    public double getFGM()//get the FGM in case of change
    {
        return this.FGM;
    }//end getter
    public double gettPA()//get the tPA in case of change
    {
        return this.tPA;
    }//end getter
    public double gettPM()//get the tPM in case of change
    {
        return this.tPM;
    }//end getter
    public double getFTA()//get the FTA in case of change
    {
        return this.FTA;
    }//end getter
    public double getFTM()//get the FTM in case of change
    {
        return this.FTM;
    }//end getter
    public String isStarter()//changes the boolean value to a string
    {
        String isStarter = "";
        if(this.starter== true)//if the boolean from the instance variable is true that makes the player a starter
        {
            isStarter = "Starter";
        }
        if(this.starter== false) //if the boolean from the instance variable if false that makes the player on the bench
        {
            isStarter = "Bench";
        }
        return isStarter;//returns the string that is set from the if statement
    }//end method
    public String playerPosition()//changes the abbreviation for the position to the full word when retrieved from the instance variables
    {
        String playerPosition = "";
        if(this.position == "PG")//PG become point guard
        {
            playerPosition = "Point Guard";
        }
        else if (this.position == "C")//c becomes center
        {
            playerPosition ="Center";
        }
        else if (this.position == "SG")//sg becomes shooting guard
        {
            playerPosition ="Shoooting Guard";
        }
        else if (this.position == "PF")//pf becomes power 
        {
            playerPosition = "Power Forward";
        }
        else if (this.position == "SF")//sf becomes small forward
        {
            playerPosition = "Small Forward";
        }
        return playerPosition;
    }//end method
    int best = 0 ;
    public void findBestFG()//finds the best field goal shooter in both of the arrays
    {
        int greatest = 0;
        int least = 0; 
        String findBestFG = "";
        int starters = 0;
        int bench = 0;
        while( best< starters )//while the number is at a certain digit this loop runs///// While loop
        {
            if(greatest>least)
            {
                least = greatest;//changes the number if the last digit is higher
            }
            else
            {
                greatest = greatest;//keeps the number the same if it is lower or the same
            }//end if
        }//end while
        best++;
    }//end method
    public void findBest3p()//find the best 3 point shooter in both the arraylist and in the array
    {
        int greatest = 0;
        int least = 0; 
        String findBestFG = "";
        int starters = 0;
        int bench = 0;
        do//run this code
        {
            if(greatest>least)
            {
                least = greatest;//changes the number if the last digit is higher
            }
            else
            {
                greatest = greatest;//keeps the number the same if it is lower or the same
            }//end if
        }
        while( best< starters );//while the number is at a certain digit this loop runs///end do-while
    }//end method
    public double calcFGP()//calulates the field goal percentage in which 1 = 100%
    {
        double FGP; //field-goal percentage
        FGP = Math.round((this.FGM/this.FGA)*1000)/1000.0;//Math.round makes the number get rounded down to the thousandths place this is done by dividing by 1000.0    
        return FGP;
    }//end method
    public double calcTPP()//calulates the 3-point percentage in which 1 = 100%
    {
        double TPP; //three-point percentage
        TPP = Math.round((this.tPM/this.tPA)*1000)/1000.0;//Math.round makes the number get rounded down to the thousandths place this is done by dividing by 1000.0           
        return TPP;
    }//end method
    public double calcFTP()//calulates the free throw percentage in which 1 = 100%
    {
        double FTP; //free-throw percentage
        FTP =  Math.round((this.FTM/this.FTA)*1000)/1000.0; //Math.round makes the number get rounded down to the thousandths place this is done by dividing by 1000.0           
        return FTP;
    }//end method
    public String singlePlayerStats()//this method is used if the player requests to see the stats of a single player, the indexes are run through this method and then returned if requested
    //the method accesses multiple other methods so it can draw the returned numbers from there.
    {
        String singlePlayerStats = "";
        System.out.println( firstName + " " + lastName + " is # " + number + " and is a " + isStarter() + " for the Warriors and plays " + playerPosition()  + "\n\n" + 
            "Weight: " + weight + "lbs     " + "Height: " + hFeet + "'" + hInches + "\"" + "\n\n" + 
            "Field Goal Percentage: " + calcFGP()+ "%" + "      3-Point Percentage: " + calcTPP()+"%" + "     Free Throw Percentage: " + calcFTP()+"%" );
        return singlePlayerStats;
    }//end method
    public String toString()//toString that prints out if the full roster is requested
    {
        String output = new String();
        System.out.println(firstName+ " " + lastName + "                 " + "#"+ number + "                   " + position + "                 " + isStarter()+ "\n");
        return output;
    }//end method
}//end class