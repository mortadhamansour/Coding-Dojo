import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String Hello = String.format("Hello, %s Lovely to see you.", "Beth Kane");
        return Hello;
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently" + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        String alexisTest = "Alexis ! Play some low-fi beats.";
        int a = alexisTest.indexOf("Alexis");
        // int b = alfredTest.indexOf("Alfred");
        // int c = notRelevantTest.indexOf("estrt");
        if(a > 0){
            System.out.println("Right away, sir. She certainly isn't sophisticated enough for that.");
        }
        return "for snarky response return string";
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
        // SENSEI BONUS
        // Write your own AlfredQuote method using any of the String methods you have learned!
}

