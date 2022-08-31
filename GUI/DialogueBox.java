package GUI;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DialogueBox {
    public static void main(String[] args){

        JOptionPane.showMessageDialog(null, "Useless Message", "Title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Useless Message 2", "Title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Useless Message", "Title", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Useless Message", "Title", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Useless Message", "Title", JOptionPane.ERROR_MESSAGE);

        int a = JOptionPane.showConfirmDialog(null, "Pagal hai kya", "Hein ?", JOptionPane.YES_NO_CANCEL_OPTION);        
        System.out.println(a);

        String name = JOptionPane.showInputDialog("Enter Your Name ");
        System.out.println("Hello "+ name);
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age "));
        System.out.println("You Are "+age+" years old");
        JOptionPane.showMessageDialog(null, "You Are "+age+" years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height "));
        System.out.println("You are "+height+" cm tall");
        JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");
        
        String[] responses = {"Ha wo toh hai hi", "hahaha chutiya sala", "Bhago Bisi..!!!"};
        ImageIcon icon = new ImageIcon("D:\\VSC Programs\\Java Programs\\pizza.png");

        JOptionPane.showOptionDialog(null, "Chiyari Bhangi", "Secret Messess", 
                                    JOptionPane.YES_NO_CANCEL_OPTION, 
                                    JOptionPane.INFORMATION_MESSAGE, 
                                    icon, 
                                    responses, 
                                    0);

    }
}
