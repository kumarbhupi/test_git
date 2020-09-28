import java.util.SortedSet;

public class Client {
  public static void main(String[] args) {
    SeriesCatalog seriesCatalog = new SeriesCatalog();

    double k = 0.5;
    String name = "E6";
    double coincidence = 80.;
    Series series = seriesCatalog.findSeriesByName(name);
    //SortedSet<VoltageDivider>
    VoltageDividerCalculation.calculate(0.5, coincidence, series);

  }
}
