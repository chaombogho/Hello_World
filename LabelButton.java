/*
The window has two buttons

*/
//Import statements needed for Frame, Button and Events
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

/*Our window will be in a frame from the JFrame class and will fire actions from
the button so we need the ActiionListener interface
*/
public class LabelAndButton extends JFrame implements ActionListener
{
   JButton button;
   JLabel label1; 

 //Remember that a constructor is used to initialise objects
 //So we build the look of the frame in the constructor
 public  LabelAndButton()
 {
   //Sets the title of this frame
   setTitle("Label and Button");
   
   //set the size of the window frame in pixels
    setSize(600,300);  
    
    setLayout(new FlowLayout());
    
    //This makes the program end on clicking close button     
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //Create a button object using the JButton class    
    button = new JButton("Click me"); 
    label1 = new JLabel("answer here"); 
    
    //Add the buttons to this window using the add() method
    this.add(label1); 
    this.add(button);             
           
   //Register the button to the listener
   //The button should listen to a press action
   button.addActionListener(this);         
 
 }
   
 
 //This method was defined in the ActionListener interface
 //It listens to the button-press

 public void actionPerformed(ActionEvent e)
 {
      label1.setText("The button is clicked!"); 
  }
 
 //Execute the frame
 public static void main(String arg[])
 { 
      //Make GUI object
       LabelAndButton w = new  LabelAndButton();
      
      //show this object on the screen
      w.setVisible(true);
 }
}
