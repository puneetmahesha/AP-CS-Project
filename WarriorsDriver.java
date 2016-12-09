import java.util.Scanner;//imports JScanner
import java.util.ArrayList;//imports ArrayList
public  class WarriorsDriver implements yell
{
    public static void main(String[] args)
    {
        WRoster project = new WRoster();//makes a roster object of Warriors
        SportsTeam warriors = new Warriors();//polymorphism
        ArrayList<Warriors> warriorsList = project.getStarterArrayList();//gets the ArrayList from roster
        Warriors[] warriorsArray = project.getBenchArray();//gets the array from roster
        Scanner input = new Scanner(System.in);
        System.out.println("_ _       _ _     _ _     _ _ _ _  _ _ _ _   _ _ _ _   _ _ _ _  _ _ _ _   _ _ _ _  ");//prints out banner of word warriors 
        System.out.println("\\   \\    /   /   / _ \\    | |  | | | |  | | |_     _| |  _ _  | | |  | | |  _ _ _|  ");
        System.out.println(" \\   \\/\\/   /   / /_\\ \\   | | _|_| | | _|_|   |   |   |  |  | | | | _|_| |_  _ _    ");
        System.out.println("  \\   _    /   /  _ _  \\  | | \\ \\  | | \\ \\   _|   |_  |  |_ | | | | \\ \\   _ _ _  |   ");
        System.out.println("   \\_/ \\_ /   /__/   \\__\\ |_|  \\_\\ |_|  \\_\\ |_ _ _ _| |_ _ _ _| |_|  \\_\\ |_ _ _ _|   ");   
        System.out.println();
        System.out.println("How many times would you like to run this program?");
        int userRunAmount = input.nextInt();
        for(int run = 0; run < userRunAmount; run++){        
            System.out.println("What would you like to do?");//gives options on what the user would like to do
            System.out.println("#1 Look at stats for a single player");//acces the class singlePlayerStats
            System.out.println("#2 See the full Roster");//prints out the toString()
            System.out.println("#3 See the top players");//accesses the top player classes
            System.out.println("#4 See facts about the Warriors");
            System.out.println();
            System.out.print("Enter the number of your selection: #");
            int sPick = input.nextInt();//input of selection number      
            System.out.println();
            if(sPick> 4  || sPick<0)//if the selection is out out of bounds anerror pops up
            {
                System.out.println("Please pick a number from 1 to 4!");
            } //end if
            if(sPick == 1)//prints out the roster so that the user can choose what player they want to see that stats for
            {
                System.out.println("Which player would you like to see the stats for??");//lists out all the players
                System.out.println("1. Harrison Barnes");
                System.out.println("2. Andrew Bogut");
                System.out.println("3. Stephen Curry  ");
                System.out.println("4. Draymond green  ");
                System.out.println("5. Klay Thompson  ");
                System.out.println("6. Leandro Barbosa  ");
                System.out.println("7. Ian Clark  ");
                System.out.println("8. Festus Ezeli ");
                System.out.println("9. Andre Iguodala ");
                System.out.println("10. Shaun Livingston ");
                System.out.println("11. Brandon Rush ");
                System.out.println("12. Mareese Speights");
                System.out.println("13. Jason Thompson"); 
                System.out.print("Enter the Number of the player you want to see stats for: ");
                int pPick = input.nextInt();//input to pick the player they want to see
                if(!(pPick > 0  || pPick<14))//if the selection is NOT in the gievn area an error pops up
                {
                    System.out.println("Pick a different player for 1 to 13!!");
                }//end if
                System.out.println();
                System.out.println();
                if (pPick == 1)//curry
                {
                    Warriors starter1 = warriorsList.get(0);//acceses the first 0 index of arraylist
                    starter1.singlePlayerStats();//takes the index and runs it through getPlayerStats() Method
                }
                else if (pPick == 2)//thompson
                {
                    Warriors starter2 = warriorsList.get(1);//acceses the second 1 index of arraylist
                    starter2.singlePlayerStats(); //takes the index and runs it through getPlayerStats() Method 
                }
                else if (pPick == 3)//barnes
                {
                    Warriors starter3 = warriorsList.get(2);//acceses the third 2 index of arraylist
                    starter3.singlePlayerStats(); //takes the index and runs it through getPlayerStats() Method
                }
                else if (pPick == 4)//bogut
                {
                    Warriors starter4 = warriorsList.get(3);//acceses the fourth 3 index of arraylist
                    starter4.singlePlayerStats(); //takes the index and runs it through getPlayerStats() Method
                }
                else if (pPick == 5)//green
                {
                    Warriors starter5 = warriorsList.get(4);//acceses the fifth 4 index of arraylist
                    starter5.singlePlayerStats();//takes the index and runs it through getPlayerStats() Method
                }
                else if (pPick ==6)//Thompson
                {
                    Warriors bench1 = warriorsArray[0];//acceses the first 0 index of array
                    bench1.singlePlayerStats();//takes the index and runs it through getPlayerStats() Method
                }
                else if (pPick == 7)//livingston
                {
                    Warriors bench2 = warriorsArray[1];//acceses the secind 1 index of array
                    bench2.singlePlayerStats();//takes the index and runs it through getPlayerStats() Method
                }
                else if (pPick == 8)//rush
                {
                    Warriors bench3 = warriorsArray[2];//acceses the third 2 index of array
                    bench3.singlePlayerStats(); //takes the index and runs it through getPlayerStats() Method
                }
                else if (pPick == 9)//iquodala
                {
                    Warriors bench4 = warriorsArray[3];//acceses the fourth 3 index of array
                    bench4.singlePlayerStats();//takes the index and runs it through getPlayerStats() Method
                }
                else if (pPick ==10)//ezeli
                {
                    Warriors bench5 = warriorsArray[4];//acceses the fifth 4 index of array
                    bench5.singlePlayerStats();//takes the index and runs it through getPlayerStats() Method
                }
                else if (pPick == 11)//barbosa
                {
                    Warriors bench6 = warriorsArray[5];//acceses the sixth 5 index of array
                    bench6.singlePlayerStats();//takes the index and runs it through getPlayerStats() Method
                }
                else if (pPick == 12)//clark
                {
                    Warriors bench7 = warriorsArray[6];//acceses the seventh 6 index of array
                    bench7.singlePlayerStats();//takes the index and runs it through getPlayerStats() Method
                }
                else if (pPick == 13)//speights
                {
                    Warriors bench8 = warriorsArray[7];//acceses the eighth 7 index of array
                    bench8.singlePlayerStats(); //takes the index and runs it through getPlayerStats() Method
                }//end if
                System.out.println();
                System.out.println("                                 Percentages are out of 1 so 1 = 100%");
            }//end if
            if(sPick == 2)//user wants to see the full roster
            {
                System.out.println("Name                            Number              Position             Starter/Bench");
                project.toString();//runs the toString to print out all of the arraylist and array
            }//end if
            if(sPick == 3)//user wants to see best player for a category
            {
                System.out.println("What would you like to see?");//lists out choices of what they want to see
                System.out.println("#1 See the best field-goal shooter.");
                System.out.println("#2 See the best 3-point shooter.");
                System.out.println("#3 See the best free-throw shooter.");
                System.out.print("Enter your selection: #");
                int bPick = input.nextInt();//user input on what choice
                System.out.println();
                if(bPick == 1)
                {
                    System.out.println(" Andrew bogut is the best shooter from the field, he has an avergae Field-goal percentage of 0.677%");
                    //project.findBestFG(); is accesed
                }
                else if(bPick == 2)
                {
                    System.out.println("Ian Clark is the best 3-point shooter, he has an average 3-point percentage of 0.5%");
                    //project.findBest3P(); is accesed
                }
                else if(bPick == 3)
                {
                    System.out.println("Stephen Curry is the best free throw shooter, he has an average free throw percentage of 0.91%");
                    //hardcoded
                }//end if
                System.out.println();
                System.out.println("*based on best percentage in category*");
            }//end if
            if (sPick == 4)
            {
                SportsTeam facts = new SportsTeam("Golden State Warriors", 73, 9, "National BasketBall Association", "Western", "Pacific", "Steve Kerr", 4);
                System.out.print("This is the Warriors yell: "); 
                warriors.yell();
            }
        }
    }
    public void yell(){
        System.out.print("Test");
    }
}
