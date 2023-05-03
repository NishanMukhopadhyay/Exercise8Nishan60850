import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Staff extends Person
{
    String Nishan60850_education;
    String Nishan60850_position;

    public  void  initialize() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialize();
        System.out.println("Enter your education");
        Nishan60850_education = br.readLine();
        System.out.println("Enter your position");
        Nishan60850_position = br.readLine();
    }
    public void NishanDisplay(){
        NishanDisplay();
        System.out.println("Education :" + Nishan60850_education);
        System.out.println("Position :" + Nishan60850_position);
    }
}