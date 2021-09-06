import java.time.LocalDate;

public class SubPlan {
  private String details;
  private PlanCat category;
  private int timeAmnt;
  private LocalDate dateDue;
  private boolean done;
  private LocalDate dateDone;
  private String description;

  public SubPlan(PlanCat category, String details, int timeAmnt, LocalDate dateDue){
    this.details = details;
    this.category = category;
    this.timeAmnt = timeAmnt;
    this.dateDue = dateDue;
    this.done = false;
  }

  public String toString(){
    String dueD = dateDue.format(Main.format20y);
    String isDone = done?"V":"X";
    return String.format("%s %s %d %s %s", category.toString(), details, timeAmnt, dueD, isDone);
  }
}