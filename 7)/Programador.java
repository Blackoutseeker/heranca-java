package heranca;
public class Programador {
    String linguagem;
    String ide;
    float salario;
    private String GitHub;
    private String empresa;
    public String getEmpresa() {
        return this.empresa;
    }
    public void setEmpresa(String emp) {
        this.empresa = emp;
    }
    public String getGitHub () {
        return this.GitHub;
    }
    public void setGitHub(String git) {
        this.GitHub = git;
    }
    public void programar() {
        System.out.println("Programando em " + linguagem);
    }
}
