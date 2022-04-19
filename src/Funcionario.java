public class Funcionario {
    private String nome;
    private int chapa;
    private long cpf;
    private String rg;
    private String endereco;
    private String fone;
    private String sexo;
    private String email;
    private String cargo;
    private byte quantidadeDeDependentes;
    private byte quntidadeDeFilhos;
    private byte tempoDeServicoAno;
    private double valorHora;
    private double cargaHorariaBase;
    private double quantidadeDeHorasExtras;
    private boolean opcaoVT;
    private double valorPagoEmPassagens;
    private byte grauInsalubridade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getChapa() {
        return chapa;
    }

    public void setChapa(int chapa) {
        this.chapa = chapa;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public byte getQuantidadeDeDependentes() {
        return quantidadeDeDependentes;
    }

    public void setQuantidadeDeDependentes(byte quantidadeDeDependentes) {
        this.quantidadeDeDependentes = quantidadeDeDependentes;
    }

    public byte getQuntidadeDeFilhos() {
        return quntidadeDeFilhos;
    }

    public void setQuntidadeDeFilhos(byte quntidadeDeFilhos) {
        this.quntidadeDeFilhos = quntidadeDeFilhos;
    }

    public byte getTempoDeServicoAno() {
        return tempoDeServicoAno;
    }

    public void setTempoDeServicoAno(byte tempoDeServicoAno) {
        this.tempoDeServicoAno = tempoDeServicoAno;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getCargaHorariaBase() {
        return cargaHorariaBase;
    }

    public void setCargaHorariaBase(double cargaHorariaBase) {
        this.cargaHorariaBase = cargaHorariaBase;
    }

    public double getQuantidadeDeHorasExtras() {
        return quantidadeDeHorasExtras;
    }

    public void setQuantidadeDeHorasExtras(double quantidadeDeHorasExtras) {
        this.quantidadeDeHorasExtras = quantidadeDeHorasExtras;
    }

    public double getValorPagoEmPassagens() {
        return valorPagoEmPassagens;
    }

    public void setValorPagoEmPassagens(double valorPagoEmPassagens) {
        this.valorPagoEmPassagens = valorPagoEmPassagens;
    }

    public byte getGrauInsalubridade() {
        return grauInsalubridade;
    }

    public void setGrauInsalubridade(byte grauInsalubridade) {
        this.grauInsalubridade = grauInsalubridade;
    }
    
    public void receberVT(){
        this.opcaoVT=true;
    }
    public void cancelarVT(){
        this.opcaoVT=false;
    }
    
    public String mostrarLegenda(){
        if(this.opcaoVT){
            return "Sim, ganha VT";
        }else{
            return "Não, não ganha VT";
        }
        
    }
    
    public double calcularSalarioBruto(){
        return this.valorHora*this.cargaHorariaBase;
        
    }
    
    public double calcularVt(){
        double salarioBruto=this.calcularSalarioBruto()*0.06;
        if(salarioBruto<this.valorPagoEmPassagens){
          return salarioBruto;  
        }else{
            return this.valorPagoEmPassagens;
        }
        
    }
    
    public double calcularHoraExtra(){
        if(this.quantidadeDeHorasExtras>0&&this.quantidadeDeHorasExtras<3){
            return (this.quantidadeDeHorasExtras*this.valorHora)*0.5;
        }else if(this.quantidadeDeHorasExtras>=3){
            return (this.quantidadeDeHorasExtras*this.valorHora)-((2*this.valorHora)*0.5);
        }else{
            return this.valorHora;
        }
        
    }
    
    public double calcularInss(){
        if(this.calcularSalarioBruto()<=1659.38){
            return this.calcularSalarioBruto()*0.08;
        }else if(this.calcularSalarioBruto()<=2765.66){
            return this.calcularSalarioBruto()*0.09;
        }else if(this.calcularSalarioBruto()<=5531.31){
            return this.calcularSalarioBruto()*0.11;
        }else{
            return this.calcularSalarioBruto()*0.11;
        }
        
    }
    
    public double calcularInsalubridade(){
        switch(this.grauInsalubridade){
        case 1:
            return 1030.06*0.4;
        case 2:
            return 1030.06*0.2;
        case 3:
            return 1030.06*0.1;
        }
        return 0;
    }
    
    public double salarioFamilia(){
        if(this.quntidadeDeFilhos==0){
            return this.calcularSalarioBruto()*0;
        }else if(this.quntidadeDeFilhos==1){
            return this.calcularSalarioBruto()*0.02;
        }else if(this.quntidadeDeFilhos>1 && this.quntidadeDeFilhos<4){
            return this.calcularSalarioBruto()*0.04;
        }else{
            return this.calcularSalarioBruto()*0.05;
        }
    }
    
    public double calcularPlanoDeSaude(){
        return (this.quantidadeDeDependentes)*0.005;
        
    }
    
    public double planoDeCarreira(){
        return 0;
        
        
    }
    
    public double calcularSalarioLiquido(){
        return this.calcularSalarioBruto()-this.calcularInss()-this.calcularInsalubridade()-this.calcularPlanoDeSaude()+this.calcularInsalubridade()+this.valorPagoEmPassagens;
        
    }
    
    @Override
    public String toString(){
        return "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: \n"
             + "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: \n"
             + "::::::::::::::::::::::::ESCOLHA UMA OPÇÃO:::::::::::::::::::::::::::::::::::: \n"
             + "::::: 1 - Mostrar nome e Salário Bruto                                  :::::\n"
             + "::::: 2 - Mostrar nome e Válor de horas extras                          :::::\n"
             + "::::: 3 - Mostrar nome e Válor do VT                                    :::::\n"
             + "::::: 4 - Mostrar nome e Válor do INSS                                  :::::\n"
             + "::::: 5 - Mostrar nome e Válor da Insalubridade                         :::::\n"
             + "::::: 6 - Mostrar nome e Válor do Salário Famália                       :::::\n"
             + "::::: 7 - Mostrar nome e Válor do Plano de Carreira                     :::::\n"
             + "::::: 8 - Mostrar nome e Válor total de Plano de Saúde                  :::::\n"
             + "::::: 9 - Mostrar nome e Válor do Salário Líquido                       :::::\n"
             + "::::: 10- Mostrar todos os dados e cálculos de funcionário              :::::\n"
             + "::::: 11- Cadastrar novo funcionário                                    :::::\n"
             + "::::: 0 - Sair do sistema                                               ::::: \n"
             + "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: \n"
             + "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: \n"
             + "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: \n";  
    }
}
