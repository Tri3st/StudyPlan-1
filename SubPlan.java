import java.time.LocalDate;
import java.util.ArrayList;


/**
 * 
 */
public class SubPlan {
  private String details;
  private ArrayList<String> detailsList;
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

  public SubPlan(PlanCat category, ArrayList<String> details, int timeAmnt, LocalDate dateDue){
    this.detailsList = details;
    this.details = "";
    this.category = category;
    this.timeAmnt = timeAmnt;
    this.dateDue = dateDue;
    this.done = false;
  }

  public String toString(){
    String dueD = dateDue.format(Main.format20y);
    String isDone = done ? "V" : "X";
    String list = "";
    if(detailsList != null) {
      for (int i = 0; i < detailsList.size(); i++) {
        if (i < detailsList.size()) list += detailsList.get(i) + ", ";
      }
    } 
    return String.format("%s %s %d %s %s", category.toString(), list == "" ? details : list, timeAmnt, dueD, isDone);
  }
}