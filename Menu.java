import java.util.Scanner;
import java.util.regex.Pattern;

public class Menu {
    Scanner scan = new Scanner(System.in);
    private int opcao;

    public void loopPrincipal() {
        do {
            mostrarMenu();
            try {
                switch (opcao) {
                    case 1:
                        validarSenha();
                        break;

                    default:
                    limpa();
                    System.out.println("Opção inválida!");
                    voltarMenu();
                    break;
                    }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                voltarMenu();
            }

        } while (opcao != 0);
        }
    

    public void mostrarMenu() {
        limpa();
        System.out.println("*** Menu da senha***");
        System.out.println("1- Validar senha");
        System.out.println("0- Sair");
        System.out.print("Opção: ");
        opcao = scan.nextInt(); scan.nextLine();
    }

    public static String verificarForcaSenha(String senha) {
            int comprimentoMinimo = 8;

            boolean temLetraMaiuscula = Pattern.compile("[A-Z]").matcher(senha).find();
            boolean temLetraMinuscula = Pattern.compile("[a-z]").matcher(senha).find();
            boolean temNumero = Pattern.compile("\\d").matcher(senha).find();
            boolean temCaractereEspecial = Pattern.compile("\\W").matcher(senha).find();
            boolean temSequenciaComum = senha.matches(".*(?i)123456.*|.*(?i)abcdef.*");
            boolean temPalavraComum = senha.equalsIgnoreCase("password") || senha.equalsIgnoreCase("123456") || senha.equalsIgnoreCase("qwerty");

            if (senha.length() < comprimentoMinimo) {
                  return "Sua senha é muito curta. Recomenda-se no minímo 8 caracteres.";
              } else if (!(temLetraMaiuscula && temLetraMinuscula && temNumero && temCaractereEspecial)) {
                  return "Sua senha não atende aos requisitos de segurança.";
              } else if (temSequenciaComum || temPalavraComum) {
                  return "Sua senha não atende aos requisitos de segurança.";
              } else {
                  return "Sua senha atende aos requisitos de segurança. Parabéns!";
              }
            }

    public void validarSenha() {
            limpa();
            System.out.println("*** Requisitos ***");
            System.out.println("Pelo menos uma letra maiúscula.");
            System.out.println("Pelo menos uma letra minúscula.");
            System.out.println("Pelo menos um número.");
            System.out.println("Pelo menos um caractere especial.");
            System.out.println("Não contém sequências comuns (\"123456\" ou \"abcdef\", case-insensitive)");
            System.out.println("Não é uma palavra comum (\"password\", \"123456\" ou \"qwerty\",case-insensitive).");
            System.out.println("Comprimento mínimo de 8 caracteres.");
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.print("Digite a senha para verificar a força: ");
            String senha = scan.nextLine();

            String resultado = verificarForcaSenha(senha);
            System.out.println(resultado);
            System.out.println("--------------------------------------------------------------------------------------");
            voltarMenu();
        }

    public void limpa(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void voltarMenu(){
        System.out.println("Digite [ENTER] para voltar ao menu");
        scan.nextLine();
        scan.nextLine();
    }
}
