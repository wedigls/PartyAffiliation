import java.util.Scanner;

public class PartyAffil
{
    void main()
    {
        Scanner in = new Scanner(System.in);

        String partyAffil = "";

        IO.print("Enter your party affiliation [DRI]: ");
        partyAffil = in.nextLine();

        /*
        if(partyAffil.equalsIgnoreCase("D"))
            IO.println("You get a democratic donkey!");
        else if(partyAffil.equalsIgnoreCase("R"))
            IO.println("You get a republican elephant!");
        else if(partyAffil.equalsIgnoreCase("I"))
            IO.println("You get an independent person!");
        else
            IO.println("I don't know that party!");
        */

        switch(partyAffil)
        {
            case "D", "d":
                IO.println("You get a democratic donkey!");
                return;
            case "R", "r":
                IO.println("You get a republican elephant!");
                return;
            case "I", "i":
                IO.println("You get an independent person!");
                return;
            default:
                IO.println("I don't know that party!");

        }

    }
}
