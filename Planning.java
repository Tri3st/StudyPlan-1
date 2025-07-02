import java.time.LocalDate;
import java.util.ArrayList;

public class Planning {
  private LocalDate date;
  private Course course;
  private boolean ready;
  private LocalDate readyDate;
  private ArrayList<SubPlan> subs;

  
  
  public Planning(LocalDate date, Course course){
    this.date = date;
    this.course = course;
    ready = false;
    subs = new ArrayList<>();
  }

  public Planning(Course course){
    this(LocalDate.now(), course);
  }

  public boolean addSub(PlanCat category, String planDetails, int timeAmnt, LocalDate dateDue){
    SubPlan s = new SubPlan(category, planDetails, timeAmnt, dateDue);
    subs.add(s);
    return true;
  }

  public boolean addSub(PlanCat category, String[] planDetails, int timeAmnt, LocalDate dateDue){
    ArrayList<String> lst = new ArrayList<>();
    for (String s: planDetails) lst.add(s);
    subs.add(new SubPlan(category, lst, timeAmnt, dateDue));
    return true;
  }

  public String toString(){
    String t = "";
    t += this.course.getCode() + "\n";
    for(SubPlan sub : subs){
      t += sub + "\n";
    }

    return t;
  }
}