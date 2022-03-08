import javax.swing.*;
import javax.swing.JOptionPane;
//GUI PROGRAM

public class GUI {
    public static void main(String[] args)
    {
        //Fetch user information in dialogue box
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        //get age as string, then parse with Integer.parseInt and save to int var
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are "+age+" years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");
    }
}
