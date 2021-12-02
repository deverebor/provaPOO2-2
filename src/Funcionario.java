public class Funcionario extends Pessoa {
  private String departament;
  private Integer matriculation;

  public String getDepartament() {
    return departament;
  }
  public Integer getMatriculation() {
    return matriculation;
  }
  public void setMatriculation(Integer matriculation) {
    this.matriculation = matriculation;
  }
  public void setDepartament(String departament) {
    this.departament = departament;
  }

}
