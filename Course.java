public class Course {
  private String name;
  private String code;
  private String acr;
  private String description;

  public Course(String code){
    this("-", code, "-");
  }
  
  public Course(String name, String code, String acr){
    this.name = name;
    this.code = code;
    this.acr = acr;
  }

  public String getCode(){
    return this.code;
  }

  public String getDescription(){
    return this.description;
  }

  public void setDescription(String description){
    this.description = description;
  }

  public String toString(){
    return code + " (" + acr + ") - " + name;
  }
}