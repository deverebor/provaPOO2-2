public class Pessoa implements IPessoa {
  private Pessoa[] listaPessoas;
  private String name;
  private String address;
  private String phone;
  private Integer max = 5;
  private Integer pointer = 0;

  public Pessoa() {
    listaPessoas = new Pessoa[max];
  }

  public String getPhone() {
    return phone;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public void addPeople(Pessoa p){
    if (pointer <= max) {
      listaPessoas[pointer] = p;
      this.pointer++;

      System.out.println("Pessoa adicionado com sucesso!");
    } else {
      System.err.println("[ERROR]: Não existe pessoas cadastradas, adicione alguma.");
    }
  }

  @Override
  public void removePeople(int id){
    if (listaPessoas == null || pointer < 0) {
      System.err.println("[ERROR]: Não existe pessoas cadastradas, adicione alguma.");

    } else {
      for (id = 0; id < pointer; id++) {
        listaPessoas[id] = null;
      }

      System.out.println("\nPessoa removido com sucesso!\n");
    }
  }

  @Override
  public void updatePeople(int i, Pessoa p){
    for (i = 0; i < pointer; i++) {
      if (p.equals(listaPessoas[i])) {
        listaPessoas[i].setName("");
        listaPessoas[i].setAddress("");
        listaPessoas[i].setPhone("");

        System.out.println("Pessoa alterado com sucesso!");
      }
    }
    if (listaPessoas == null || pointer < 0) {
      System.err.println("[ERROR]: Não existe pessoa na agenda, adicione algum.");
    }
  }

  @Override
  public void showPeople(){
    for (Integer i = 0; i < pointer; i++) {
      System.out.println("\nSeu nome é: " + listaPessoas[i].getName());
      System.out.println("Seu telefone é: " + listaPessoas[i].getAddress());
      System.out.println("Seu endereço é: " + listaPessoas[i].getPhone());
    }
  }
}
