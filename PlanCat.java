/**
 * Enum PlanCat
 * 
 * LE - Leereenheid
 * HFD - Hoofdstuk
 * TNT - Tentamen
 * HT1 - 1e Hertentamen 
 * HT2 - 2e Hertentamen
 * TNT - Tentamen
 * OPD - Opdracht
 * OPD2 - 2e Opdracht
 * OPD3 - 3e Opdracht
 * EOP - Eindopdracht
 * 
 * @param name String The name of the Enum
 * 
 * @param getName() String Returns the name of the Enum
 * 
 */
public enum PlanCat {
  LE("Leereenheid"),
  HFD("Hoofdstuk"),
  TNT("Tentamen"),
  HT1("1e Hertentamen"),
  HT2("2e Hertentamen"),
  OPD("Opdracht"),
  OPD2("2e Opdracht"),
  OPD3("3e Opdracht"),
  EOP("Eindhopdracht");
  
  private PlanCat(final String name){
    this.name = name;
  }

  private String name;

  private String getName(){
    return this.name;
  }

}
