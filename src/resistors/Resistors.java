/*
 * The purpose is to create a program that takes three colours, 
   separated by hyphens, and prints the value of the resistor. 
   Use a one-dimensional array for the colours.
 */

package resistors;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Gloria Song
 * Date : 2018.09.19
 */
public class Resistors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create arraylist
        ArrayList<String>colour =new ArrayList<String>(); 
        colour.add("BLACK");
        colour.add("BROWN");
        colour.add("RED");
        colour.add("ORANGE");
        colour.add("YELLOW");
        colour.add("GREEN");
        colour.add("BLUE");
        colour.add("VIOLET");
        colour.add("GREY");
        colour.add("WHITE");
        
        String inputInfo = "What is your resistors coulour code? \n" + 
                "Separate each colour by hyphens \n" +
                "Ex: Red-Orange-Black \n";
        String a = JOptionPane.showInputDialog(inputInfo);
        String[]StringList= a.split("-");
        
        int res1=((colour.indexOf(StringList[0].toUpperCase())*10));
        int res2=((colour.indexOf(StringList[1].toUpperCase())*1));
        int res3=((colour.indexOf(StringList[2].toUpperCase())*1));
        
        System.out.println("You entered " + a);
        System.out.println("The value of the resistor is " + (res1+res2)*Math.pow(10,res3)+ "ohoms");
        
    }
    
}
