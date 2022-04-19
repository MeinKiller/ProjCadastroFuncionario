
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        Funcionario objFuncionario=new Funcionario();
        byte op ;
        
        System.out.println("::::::::::::::::::::::Cadastro de funcionário:::::::::::::::::::::");
        System.out.print("Nome: ");
        objFuncionario.setNome(leia.next());
        System.out.print("Chapa: ");
        objFuncionario.setChapa(leia.nextInt());
        System.out.print("CPF: ");
        objFuncionario.setCpf(leia.nextLong());
        System.out.print("RG: ");
        objFuncionario.setRg(leia.next());
        System.out.print("Endereço: ");
        objFuncionario.setEndereco(leia.next());
        System.out.print("Fone: ");
        objFuncionario.setFone(leia.next());
        System.out.print("Sexo: \n"
                + "1 - Masculino \n"
                + "2 - Feminino \n"
                + "Digite a opção: ");
        do{
            op=leia.nextByte();
            switch(op){
            case 1:
                objFuncionario.setSexo("Masculino");
                break;
            case 2:
                objFuncionario.setSexo("Feminino");
                break;
            default:
                System.out.println("Inválido/Digite novamente:");
            }
        }while(op<1||op>2);
        System.out.println("E-mail: ");
        objFuncionario.setEmail(leia.next());
        System.out.println("Cargo: ");
        objFuncionario.setCargo(leia.next());
        System.out.println("Quantidade de dependentes: ");
        objFuncionario.setQuantidadeDeDependentes(leia.nextByte());
        System.out.println("Quantidade de filhos: ");
        objFuncionario.setQuntidadeDeFilhos(leia.nextByte());
        System.out.println("Tempo de serviço por ano: ");
        objFuncionario.setTempoDeServicoAno(leia.nextByte());
        System.out.println("Valor por hora: ");
        objFuncionario.setValorHora(leia.nextDouble());
        System.out.println("Base de carga horária: ");
        objFuncionario.setCargaHorariaBase(leia.nextDouble());
        System.out.println("Quantidade de horas extras: ");
        objFuncionario.setQuantidadeDeHorasExtras(leia.nextDouble());
        System.out.println("Escolha do Vale Transporte conforme abaixo:  \n" +
                        "1 -  Sim, ganha VT  \n" +
                        "2 -  Não, não ganha VT \n"
                + "Digite a opção: ");
        do{
            op=leia.nextByte();
            switch(op){
            case 1:
                objFuncionario.receberVT();
                System.out.println("Valor pago em passagem: ");
                objFuncionario.setValorPagoEmPassagens(leia.nextDouble());
                break;
            case 2:
                objFuncionario.cancelarVT();
                break;
            default:
                System.out.println("Inválido/Digite novamente:");
            }
        }while(op<1||op>2);
        System.out.println("Escolha a insalubridade desejada \n"
                + "1 - Máximo 40% \n"
                + "2 - Médio 20% \n"
                + "3 - Mínimo 10% \n"
                + "Digite a opção: ");
        do{
            op=leia.nextByte();
            System.out.println("Inválido/Digite novamente:");
        }while(op<1||op>3);
        objFuncionario.setGrauInsalubridade(op);
        System.out.println(objFuncionario);
        
        System.out.println("Digite a opção escolhida: ");
        do{
            op=leia.nextByte();
            switch(op){
            case 1:
                System.out.println("Nome: "+objFuncionario.getNome());
                System.out.println("Salario bruto: "+objFuncionario.calcularSalarioBruto());
                break;
            case 2:
                System.out.println("Nome: "+objFuncionario.getNome());
                System.out.println("Valor de horas extras: "+objFuncionario.calcularHoraExtra());
                break;
            case 3:
                System.out.println("Nome: "+objFuncionario.getNome());
                System.out.println("Valor do vale transporte: "+objFuncionario.calcularVt());
                break;
            case 4:
                System.out.println("Nome: "+objFuncionario.getNome());
                System.out.println("Valor do INSS: "+objFuncionario.calcularInss());
                break;
            case 5:
                System.out.println("Nome: "+objFuncionario.getNome());
                System.out.println("Valor do insalubridade: "+objFuncionario.calcularInsalubridade());
                break;
            case 6:
                System.out.println("Nome: "+objFuncionario.getNome());
                System.out.println("Valor salário família: "+objFuncionario.salarioFamilia());
                break;
            case 7:
                System.out.println("Nome: "+objFuncionario.getNome());
                System.out.println("Valor do plano de carreira: "+objFuncionario.planoDeCarreira());
                break;
            case 8:
                System.out.println("Nome: "+objFuncionario.getNome());
                System.out.println("Valor do plano de saúde: "+objFuncionario.calcularPlanoDeSaude());
                break;
            case 9:
                System.out.println("Nome: "+objFuncionario.getNome());
                System.out.println("Valor do salário liquido: "+objFuncionario.calcularSalarioLiquido());
                break;
            case 10:
                System.out.print("Nome: "+objFuncionario.getNome());
                System.out.print("Chapa: "+objFuncionario.getChapa());
                System.out.print("CPF: "+objFuncionario.getCpf());
                System.out.print("RG: "+objFuncionario.getRg());
                System.out.print("Endereço: "+objFuncionario.getEndereco());
                System.out.print("Fone: "+objFuncionario.getFone());
                System.out.println("Sexo: "+objFuncionario.getSexo());
                System.out.println("E-mail: "+objFuncionario.getEmail());
                System.out.println("Cargo: "+objFuncionario.getCargo());
                System.out.println("Quantidade de dependentes: "+objFuncionario.getQuantidadeDeDependentes());
                System.out.println("Quantidade de filhos: "+objFuncionario.getQuntidadeDeFilhos());
                System.out.println("Tempo de serviço por ano: "+objFuncionario.getTempoDeServicoAno());
                System.out.println("Valor por hora: "+objFuncionario.getValorHora());
                System.out.println("Base de carga horária: "+objFuncionario.getCargaHorariaBase());
                System.out.println("Quantidade de horas extras: "+objFuncionario.getQuantidadeDeHorasExtras());
                System.out.println("Vale transporte: "+objFuncionario.mostrarLegenda());
                System.out.println("Valor vale transporte: "+objFuncionario.calcularVt());
                break;
            case 11:
                
            case 0:
                System.out.println("!Sistema encerrado!");
            default:
                System.out.println("Inválido/Digite novamente: ");
            }
        }while(op!=0);
    }
                
}
        