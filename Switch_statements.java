import java.util.Scanner;
public class Switch_statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the team name to know the homeground: ");
        String ipl = sc.next();
        switch (ipl) {
            case "RCB" -> System.out.println("Chinnaswamy");
            case "CSK" -> System.out.println("M Chidambaram");
            case "MI" -> System.out.println("Wankhede");
            case "PBKS" -> System.out.println("Mohali");
            case "KKR" -> System.out.println("Eden Gardens");
            case "GG" -> System.out.println("Modi");
            case "DC" -> System.out.println("Arun Jaitley");
            default -> System.out.println("Please enter a a valid team!");
        }
        System.out.print("Enter which ball you wanna play with: ");
        String ball = sc.next();
        switch (ball) {
            case "white" -> System.out.println("Used in ODI's and T20's");
            case "red" -> System.out.println("Used in Test cricket");
            case "pink" -> System.out.println("Used in Day/Night Test cricket");
            default -> System.out.println("Please enter a valid ball!");
        }
    }
}