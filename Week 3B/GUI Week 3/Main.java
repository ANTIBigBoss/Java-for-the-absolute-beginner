import javax.swing.JOptionPane;
public class Main {
  public static void main(String[] args) {
    String name = JOptionPane.showInputDialog("What is your name?");
    String message = String.format("Hello %s!", name);
    JOptionPane.showMessageDialog(null, message);
  }  
}