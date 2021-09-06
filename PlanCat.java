public enum PlanCat {
  LE("Leereenheid"),
  HFD("Hoofdstuk"),
  TNT("Tentamen"),
  HT1("1e Hertentamen"),
  HT2("2e Hertentamen"),
  OPD("Opdracht");
  
  private PlanCat(final String name){
    this.name = name;
  }

  private String name;

  private String getName(){
    return this.name;
  }

}
