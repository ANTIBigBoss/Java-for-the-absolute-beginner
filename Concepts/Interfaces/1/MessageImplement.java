/*Class Implements Interfaces 1 & 2 */
public class MessageImplement implements Message, Factorial{
    public void printMessage(String message){
        System.out.println(message);
    }
    public int factorial (int n){
        int f = 1;
        for(int i = 1; i <= n; i++) f *= i;
        return f;
        }
    }