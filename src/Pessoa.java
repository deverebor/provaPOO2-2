public class Pessoa implements IPessoa {
  private Pessoa[] listaPessoas;
  private String name;
  private String adress;
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

  public String getAdress() {
    return adress;
  }

  public void setAdress(String adress) {
    this.adress = adress;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public void addPeople(Pessoa p){
    if (pointer <= max) {
      listaPessoas[pointer] = p;
      this.pointer++;

      System.out.println("Contato adicionado com sucesso!");
    } else {
      System.err.println("[ERROR]: Já existe contatos demais na agenda, remova algum.");
    }
  }

  @Override
  public void removePeople(int id){
    if (listaPessoas == null || pointer < 0) {
      System.err.println("[ERROR]: Não existe contatos na agenda, adicione algum.");

    } else {
      for (id = 0; id < pointer; id++) {
        listaPessoas[id] = null;
      }

      System.out.println("\nContato removido com sucesso!\n");
    }
  }

  @Override
  public void updatePeople(int i, Pessoa p){
    for (i = 0; i < pointer; i++) {
      if (p.equals(listaPessoas[i])) {
        listaPessoas[i].setName("");
        listaPessoas[i].setAdress("");
        listaPessoas[i].setPhone("");

        System.out.println("Contato alterado com sucesso!");
      }
    }
    if (listaPessoas == null || pointer < 0) {
      System.err.println("[ERROR]: Não existe contatos na agenda, adicione algum.");
    }
  }

  @Override
  public void showPeople(){
    for (Integer i = 0; i < pointer; i++) {
      System.out.println("\nSeu nome é: " + listaPessoas[i].getName());
      System.out.println("Seu telefone é: " + listaPessoas[i].getAdress());
      System.out.println("Seu endereço é: " + listaPessoas[i].getPhone());
    }
  }
}
