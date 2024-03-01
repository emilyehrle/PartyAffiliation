import java.util.Scanner;

public class PartyAffiliation

    //class PartyAffiliation
    //   main ()
    //      String politcalParty // Democrat, Republican, or Independent
    //output “What is your political party: Democrat, Republican, or Independent? [D, R, I] “
    //      input politcalParty
    //       if politcalParty == “D”
    //          output “You get a Democratic Donkey!”
    //       else if politicalParty == “R”
    //          output “You get a Republican Elephant!”
    //      else
    //          output “You are independent. You get a Man!”
    //       end if
    //   return
    // end class


{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String politicalParty = "";


        System.out.print("Choose your political party: ");
        System.out.print("D - Democrat,");
        System.out.print(" R - Republican,");
        System.out.print(" I - Independent,");
        System.out.print(" Enter your choice: ");
        politicalParty = in.nextLine();
        politicalParty = politicalParty.toUpperCase();

        switch (politicalParty) {
            case "D":
                System.out.println("You get a Democratic Donkey!");
                break;
            case "R":
                System.out.println("You get a Republican Elephant!");
                break;
            case "I":
                System.out.println("You get an Independent Man!");
                break;
            default:
                System.out.println("Invalid " + politicalParty);
                break;
        }
        in.close();
    }}