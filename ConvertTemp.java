//Christian Jackson
//Temperature Conversion Program

public class ConvertTemp {
 //Data members
  private double cTemp, fTemp;

  //constructor
  public ConvertTemp(double inputTemp) {
    this.cTemp = inputTemp;
    this.fTemp = cTemp * (9.0/5.0) + 32;
  }
  
 //methods
  public double getFTemp() {
    return this.fTemp;
  }

  public double getCTemp() {
    return this.cTemp;
  }

  public void updateTemps(double inputCTemp) {
    this.cTemp = inputCTemp;
    this.fTemp = cTemp * (9.0/5.0) +32;
  }
}
