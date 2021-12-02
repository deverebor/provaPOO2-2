public class Usuario {
  private String login;
  private String password;
  private String encryptePassword;

  public String getPassword() {
    return password;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String encrypt(String password) {
    for(int c = 0; c < password.length(); c++) {
      this.encryptePassword += (char)(password.charAt(c) + 1);
    }

    return this.encryptePassword.toString();
  }
}
