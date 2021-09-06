import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Main {

  public static DateTimeFormatter format20y = DateTimeFormatter.ofPattern("dd-MM-yy");
  public static DateTimeFormatter format2y = DateTimeFormatter.ofPattern("d-M-yy");
  public static DateTimeFormatter format4y = DateTimeFormatter.ofPattern("d-M-yyyy");
  
  public static void main(String[] args) {
    Course ica = new Course("Inleiding Informatica", "IB0102", "ICA");
    
    Planning p1 = new Planning(ica);
    p1.addSub(PlanCat.LE, "1 - 3", 10, LocalDate.parse("9-9-21", Main.format2y));
    p1.addSub(PlanCat.LE, "4 - 5", 10, LocalDate.parse("11-9-21", Main.format2y));
    System.out.println(p1);

  }
}