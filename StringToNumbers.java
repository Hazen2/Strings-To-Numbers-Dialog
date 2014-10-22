import javax.swing.JOptionPane;

/** This program demonstrates converting strings to numbers using Dialog Boxes.
*/

public class StringToNumbers
{
  /** This is the main method.
  */
  public static void main(String[] args)
  {
    
    String inputString;
    String name;
    double hourlyWage = 15;
    double hoursWorked;
    double grossPay;
    
    // Get the user's name.
    name = JOptionPane.showInputDialog("Please enter your name.");
    
    // Ask the user's hourly wage.
    inputString = JOptionPane.showInputDialog("Enter your hourly wage.");
   
    // Convert hourly wage to a double.
    hourlyWage = Double.parseDouble(inputString);
    
    // Ask how many hours worked this month.
    inputString = JOptionPane.showInputDialog("Enter the hours worked this month.");
    
    // Convert hours worked from String to double
    hoursWorked = Double.parseDouble(inputString);
    
    // Calculate gross pay.
    grossPay = hoursWorked * hourlyWage;
    
    // Display the gross pay in a message dialog box.
    JOptionPane.showMessageDialog(null, name + " , you have worked " + hoursWorked + " hours this month." +
                                  " With a pay rate of $" + hourlyWage + " an hour, you have made a " +
                                  "total of $" + grossPay + " this month.");
    
    System.exit(0);
  }
}
    
    
