public class QuizOne {
    
    public static void main(String[] args) {
        System.out.println("What is the temperature?"); //Asks user the temp
        double temp = Double.parseDouble(System.console().readLine()); //Parses the temp
        System.out.println("Will that be in Celcius or in Farenheit?");
        String tempType = System.console().readLine(); //Asks user the tempType
        if (tempType.equals("Celcius")) {
            System.out.println("That's " + 9/5 * temp + " degrees Fahrenheit");   
    } else if (tempType.equals("Farenheit")) 
    System.out.println("That's " +  5/9 * temp + " degrees Celcius");

}
}
