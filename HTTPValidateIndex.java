import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class HTTPValidateIndex extends Thread {
    public static void main(String[] args) {

        try {
            JSONParser parser = new JSONParser();
        
            Object obj = parser.parse(new FileReader("c:\\Users\\dosia\\OneDrive\\Documents\\jcm.json"));

            JSONObject jsonObject = (JSONObject) obj;

            String firstname = (String) jsonObject.get("firstName");
            System.out.println(firstname);

            String lastname = (String) jsonObject.get("lastName");
            System.out.println(lastname);

            String preferredname = (String) jsonObject.get("preferredName");
            System.out.println(preferredname);            

            if (firstname.length() > 2 && firstname.length() < 16) {
                System.out.println("Passed.");
            } else {
                System.out.println("Failed.");
            }
            
            if (lastname.length() > 2 && lastname.length() < 16) {
                System.out.println("Confirmed.");
            } else {
                System.out.println("Failed.");
            }

            if (preferredname.length() > 2 && preferredname.length() < 16) {
                System.out.println("Confirmed.");
            } else {
                System.out.println("Failed.");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong.");
          } finally {
            System.out.println("The 'try catch' is finished.");
          }
    }
}