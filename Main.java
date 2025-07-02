import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

class Main {

  public static DateTimeFormatter format20y = DateTimeFormatter.ofPattern("dd-MM-yy");
  public static DateTimeFormatter format2y = DateTimeFormatter.ofPattern("d-M-yy");
  public static DateTimeFormatter format4y = DateTimeFormatter.ofPattern("d-M-yyyy");
  
  public static void main(String[] args) {
    Course ica = new Course(
            "Datastructuren en Algoritmen",
            "IB1502",
            "DA");
    
    Planning p1 = new Planning(ica);
    p1.addSub(PlanCat.LE, "2, 4, 5", 10, LocalDate.parse("3-9-21", Main.format2y));
    p1.addSub(PlanCat.LE, "3, 6, 7", 10, LocalDate.parse("13-9-21", Main.format2y));
    p1.addSub(PlanCat.LE, "8, 9", 10, LocalDate.parse("27-9-21", Main.format2y));
    p1.addSub(PlanCat.LE, "10, 11, 12", 10, LocalDate.parse("11-10-21", Main.format2y));
    p1.addSub(PlanCat.LE, "13, 14", 10, LocalDate.parse("25-10-21", Main.format2y));
    p1.addSub(PlanCat.OPD, "Huiswerk", 10, LocalDate.parse("3-11-21", Main.format2y));
    p1.addSub(PlanCat.TNT, "Tentamen", 20, LocalDate.parse("4-11-21", Main.format2y));

    Course ica2 = new Course(
      "Logica & Informatica",
      "IB1902",
      "LI"
    );

    Planning p2 = new Planning(ica2);

    p2.addSub(PlanCat.LE, new String[]{"1", "2", "3"}, 10, LocalDate.parse("01-02-2026", Main.format4y));
    p2.addSub(PlanCat.LE, new String[]{"4", "5", "6"}, 10, LocalDate.parse("01-02-2026", Main.format4y));
    p2.addSub(PlanCat.LE, new String[]{"7", "8"}, 10, LocalDate.parse("01-02-2026", Main.format4y));
    p2.addSub(PlanCat.LE, new String[]{"9", "10", "11"}, 10, LocalDate.parse("01-02-2026", Main.format4y));
    p2.addSub(PlanCat.LE, new String[]{"12", "13"}, 10, LocalDate.parse("01-02-2026", Main.format4y));
    p2.addSub(PlanCat.TNT, "Tentamen", 20, LocalDate.parse("01-02-2026", Main.format4y));

    System.out.println(p1);
    System.out.println(p2);

  }
}