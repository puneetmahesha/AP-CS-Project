import java.util.ArrayList;
public class WRoster
{
    private ArrayList<Warriors> starters;//makes an arraylist called starters of the warriors type
    private Warriors[] bench;//makes an array called bench of warriors type
    public WRoster()//method to make arraylist and array
    {
        this.starters = new ArrayList<Warriors>();//instantiates the arraylisr
        //(String firstName, String lastName, String position, boolean starter, int number, double weight, int hFeet, int hInches, int FGA, int FGM, int tPA, int tPM, int FTA, int FTM)
        this.starters.add ( new Warriors( "Harrison","Barnes ",  "SF",  true,  40,  225.8,  6,  8,  168,  84,  54,  21,  47,  39));//barnes and index 0 of the arraylist
        this.starters.add ( new Warriors( "Andrew","Bogut    ",  "C",  true,  12,  260.5,  7,  0,  59,  40,  0,  0,  12,  6));//Bogut and index 1 of the arraylist
        this.starters.add ( new Warriors( "Stephen","Curry   ", "PG", true, 30, 190.0, 6, 3, 385, 197, 211, 94, 119,112)); //curry, and index 2 of the arraylist
        this.starters.add ( new Warriors( "Draymond","Green  ",  "PF",  true,  23,  230.0,  6,  7,  191,  90,  72,  29,  55,  41));//Green and index 3 of the arraylist
        this.starters.add ( new Warriors( "Klay","Thompson   ", "SG",  true, 11, 215.3, 6, 7, 240, 109, 109,  45,  36,  30));//thompson and index 4 of the arraylist       
        this.bench = new Warriors[8];//instantiates the array
        this.bench[0] = new Warriors("Leandro","Barbosa ",  "SG",  false,  19,  194.2,  6,  3,  105,  44,  36,  15,  9,  6);//Barbosa and index 1 of array
        this.bench[1] = new Warriors("Ian","Clark       ",  "SG",  false,  21,  175.5,  6,  3,  45,  21,  21,  11,  10,  9);//clack and index 2 of array
        this.bench[2] = new Warriors("Festus","Ezeli    ",  "C",  false,  31,  265.4,  6,  11,  114,  64,  0,  0,  63,  35);//ezeli and index 3 of array
        this.bench[3] = new Warriors("Andre","Iguodala  ",  "SF",  false,  9,  215.7,  6,  6,  124,  68,  54,  26,  18,  10);//Iguodala and index 4 of array
        this.bench[4] = new Warriors("Shaun","Livingston",  "PG",  false,  34,  192.5,  6,  7,  79,  39,  6,  1,  16,  15);//Livingston anf index 5 of array
        this.bench[5] = new Warriors("Brandon","Rush    ",  "SG",  false,  4,  220.8,  6,  6,  38,  17,  23,  12,  8,  5);//Rush and index 6 of array
        this.bench[6] = new Warriors("Mareese","Speights",  "C",  false,  5,  255.9,  6,  10,  88,  31,  5,  1,  26,  19);//Speights annd index 7 of array
        this.bench[7] = new Warriors("Jason","Thompson  ",  "PF",  false,  1,  250.3,  6,  11,  18,  7,  0,  0,  2,  1);//thompson and index 8 of array
    }//end method
    public ArrayList<Warriors> getStarterArrayList()//makes a gettr so that all the info can be retrieved in the driver
    {
        return this.starters;
    }//end getter
    public Warriors[] getBenchArray()//makes a gettr so that all the info can be retrieved in the driver
    {
        return this.bench;
    }//end getter
    public void sort()//this osrt method organizes by last name in the roster method
    {
        int[] weights =  {168, 59, 197,191,109};
        int j;                  
        int key;               
        int i;  
        for (j = 1 ; j <weights.length ; j++)//insertion sort algorithim   
        {
            key = weights[j];
            for(i = j - 1 ; (i >= 0) && (weights[ i ] < key); i--)   
            {
                weights[ i+1 ] = weights[i];
            }
            weights[ i+1 ] = key;    
        }
    }
    public String toString()//to String so that the contents of this toString can be accesses by the main class
    {
        String output = new String();//creates a new output of String
        for( int index = 0 ; index < starters.size(); index++)//for-loop that goes throug the arraylist 
        {
            System.out.println(starters.get(index));
        }
        for( Warriors benchs : bench)//for each loop to go through and print out all of the array
        {
            output += benchs + "\n";
        }
        return output;    
    }//end toString
}