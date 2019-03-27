
package prueba;

import javax.swing.JPasswordField;  
import javax.swing.JButton;  
import javax.swing.JFrame;  
  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
  
import java.awt.GridLayout; 

/**
 *
 * @author Alba
 */
public class ClearJPasswordFieldText implements ActionListener{
    //Create password field  
JPasswordField passwordField=new JPasswordField(12);  
  
//Create button with text ( Click here to clear password )  
JButton button=new JButton("Click here to clear password");  
  
//Create layout that will be use by JFrame  
GridLayout gl=new GridLayout(2,1);  
  
//Create window using JFrame with title ( Clear JPasswordField text )  
JFrame frame=new JFrame("Clear JPasswordField text");  
  
//Constructor  
public ClearJPasswordFieldText()  
{  
 button.addActionListener(this);  
  
 frame.setLayout(gl);  
 frame.add(passwordField);  
 frame.add(button);  
  
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
 frame.setSize(400,130);  
 frame.setVisible(true);  
}  
  
//override actionPerformed method  
public void actionPerformed(ActionEvent event)  
{  
 //Action that will perform when someone click the button  
 if(event.getSource()==button)  
 {  
  //Clear password in JPasswordField  
  passwordField.setText("");  
 }  
}  
}
