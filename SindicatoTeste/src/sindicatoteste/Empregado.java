
package sindicatoteste;

/**
 *
 * @author Osvaldo Viana Junior
 */
public class Empregado {
    
    private String nome;
    private double salario;

    public Empregado(String nome, double salario) {
        this.nome = nome;
        this.nome = nome;
        this.salario = salario;
    }
    
    public Empregado(String nome) {
        this.nome = nome;
        this.salario = 5000;
    }
    
    public void trabalhar(){
        System.out.println("Eu trabalho muito");
    }
    
    public double calculaBonificacao(){
        return 0.2*salario;
    }
    
    public double calculaBonificacao(double percentagem) {
        return percentagem*salario;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}