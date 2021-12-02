public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();

        pessoa.setName("Adeobaldo Pinto de Araújo Chavier");
        pessoa.setAddress("Periperi");
        pessoa.setPhone("71 9 9876-5432");

        pessoa.addPeople(pessoa);

    }
}
