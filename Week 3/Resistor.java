public class Resistor {
      //instance variables
  private int value;
  private int tol;
  //------------------------
  //constructor
  public Resistor(int value, int tol) {
    this.value = value;
    this.tol = tol;
  }
  //------------------------
  //methods
  public void dispResSpecs()
  {
    System.out.printf("Value = %d Ohms\tTolerance = %d %%\n", value, tol);
  }
}
