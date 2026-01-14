import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int opcao = 0;

        do {
            System.out.println("=========MENÚ==========");
            System.out.println("1 - Cadastrar novo Contato");
            System.out.println("2 - Listar Contatos cadastrados");
            System.out.println("3 - Buscar Contato pelo Nome");
            System.out.println("4 - Remover Contato");
            System.out.println("5 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Digite o nome:");
                    String nome = sc.nextLine();
                    System.out.println("Digite o Telefone: ");
                    String telefone = sc.nextLine();
                    System.out.println("Digite o E-mail: ");
                    String email = sc.nextLine();

                    Contatos novoContato = new Contatos(nome, telefone, email);
                    Apoio.insereContato(novoContato);

                    System.out.println("Contato cadastrado com Sucesso!");

                    break;

                case 2:
                    if (Apoio.contato.isEmpty()){
                        System.out.println("Não há nenhum contato cadastrado");
                    } else {
                        System.out.println("====LISTA DE CONTATOS====");
                        for (Contatos c : Apoio.contato){
                            System.out.println(c);
                        }
                    }
                    break;

                case 3:
                    if (Apoio.contato.isEmpty()){
                        System.out.println("Não há nenhum contato cadastrado");
                    } else {
                        System.out.println("Digite o Contato a pesquisar: ");
                        String nomePesquisado = sc.nextLine();

                        Contatos escolhido = null;



                        for (Contatos c : Apoio.contato){
                            if (c.getNome().equalsIgnoreCase(nomePesquisado)){
                                escolhido = c;
                                System.out.println(c);
                                break;
                            } else {
                                System.out.println("Contato não localizado!");
                            }
                        }


                    }
                    break;


                case 4:
                    if (Apoio.contato.isEmpty()){
                        System.out.println("Não há nenhum contato cadastrado");
                    } else {
                        System.out.println("Digite o Contato a Excluir: ");
                        String nomeExcluir = sc.nextLine();

                        Contatos excluir = null;

                        for (Contatos c : Apoio.contato) {
                            if (c.getNome().equalsIgnoreCase(nomeExcluir)) {
                                excluir = c;
                                System.out.println(c);
                                break;
                            }
                        }


                        if (excluir == null) {
                            System.out.println("Contato não localizado!");
                        } else {
                            System.out.println("Deseja mesmo excluir o contato "
                                    + excluir.getNome()
                                    + "? Digite S para Sim ou N para não: ");
                            String yn = sc.nextLine();

                            if (yn.equalsIgnoreCase("s")) {
                                Apoio.contato.remove(excluir);
                                System.out.println("Contato Excluido com Sucesso!");

                            } else {
                                System.out.println("Contato mantido!");
                            }


                        }
                    }
                    break;

                case 5:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");

            }

            } while (opcao != 5);

            sc.close();
    }
}