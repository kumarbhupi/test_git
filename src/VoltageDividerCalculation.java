import java.util.List;
/**
 * K = Vout / Vin
 * K = voltageDivision
 * k = r2/(r1+r2)
 * |K - k| <= tol
 * tol = K*(100-coincidence) --> % of coincidence
 *
 * */
public class VoltageDividerCalculation {
  public static void calculate(double voltageDivision, double coincidence, Series s){
    List<Resistor> resistors = s.getResistors();
    for(Resistor r1 : resistors){
      for (Resistor r2: resistors){
        double k = r2.getResistance()/(r1.getResistance()+r2.getResistance());

        double tol = voltageDivision*(100-coincidence)*100;
        if( ((voltageDivision- tol) < k) && ((voltageDivision + tol) > k) ){
          System.out.println("R1 = "+ r1 + " R2="+ r2);
          System.out.println("Voltage division "+ k + "\ncoincidence with " + voltageDivision + " : " + (voltageDivision/k)*100  + "% \n");
          //VoltageDivider voltageDivider = new VoltageDivider(r1, r2, coincidence );
        }
        //TODO: Implement pdf formula -- Done
        System.out.println("R1=" + r1 + "R2 = " + r2);
      }
    }
  }
}
