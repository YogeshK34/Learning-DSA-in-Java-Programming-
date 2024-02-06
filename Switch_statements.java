import java.util.Scanner;
public class Switch_statements {
    public static void main(String[] args) {
        /*
        sytnax is: 
        switch(expression) {
        case value1:
            // code block
            break;
        case value2:
            // code block
            break;
  // we can have any number of case statments.
        default:
        // code block
}
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the team name to know the home ground: ");
        String ipl = sc.next();
        switch (ipl) {
            case "RCB":
                System.out.println("Chinnaswamy");
                break;
            case "CSK":
                System.out.println("M Chidambaram");
                break;
            case "MI":
                System.out.println("Wankhede");
                break;
            case "PBKS":
                System.out.println("Mohali");
                break;
            case "KKR":
                System.out.println("Eden Gardens");
                break;
            case "GG":
                System.out.println("Modi");
                break;
            case "DC":
                System.out.println("Arun Jaitley");
                break;
            default:
                System.out.println("Please enter a a valid team!");
                break;
        }
        /*So in the above mentioned program when user enters one of the team then the value attached to the team will be executed but we also have
        to make sure to put a break after every switch case or else the interpreter will check all the cases until the default case */
    }
}
