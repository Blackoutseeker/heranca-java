package heranca;
import java.util.Scanner;
public class Heranca {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Front_End front = new Front_End();
        Back_End back = new Back_End();
        String every;
        System.out.print("Qual a linguagem do programador Front-End? ");
        front.linguagem = in.next();
        System.out.print("Qual a IDE do programador Front-End? ");
        front.ide = in.next();
        System.out.print("Qual o salário do programador Front-End? ");
        front.salario = in.nextFloat();
        System.out.print("Qual o GitHub do programador Front-End? ");
        every = in.next();
        front.setGitHub(every);
        System.out.print("Qual a empresa do programador Front-End? ");
        every = in.next();
        front.setEmpresa(every);
        System.out.print("Qual a linguagem do programador Back-End? ");
        back.linguagem = in.next();
        System.out.print("Qual a IDE do programador Back-End? ");
        back.ide = in.next();
        System.out.print("Qual o salário do programador Back-End? ");
        back.salario = in.nextFloat();
        System.out.print("Qual o GitHub do programador Back-End? ");
        every = in.next();
        back.setGitHub(every);
        System.out.print("Qual a empresa do programador Back-End? ");
        every = in.next();
        back.setEmpresa(every);
        System.out.println("O programador Front-End está:");
        front.css();
        front.construirUI();
        front.tornarResponsivo();
        System.out.println("O programador Back-End está:");
        back.fazerAPI();
        back.realizarDeploy();
    }
}
