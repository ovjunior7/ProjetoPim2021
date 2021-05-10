
package sindicatoteste;

import java.util.ArrayList;

/**
 *
 * @author Osvaldo Viana Junior
 */
public class Sindicato {
        
    private ArrayList<Empregado> lstEmpregados;
    private String nomeSindicato;
    private Empregado presidente;
    
    public Sindicato(){
        lstEmpregados = new ArrayList<>();
    }
    
    public Sindicato(String nomeSindicato, Empregado ipresidente){
        lstEmpregados = new ArrayList<>();
        this.presidente = ipresidente;
        lstEmpregados.add(ipresidente);
    }
    
    public void incluirEmpregado(Empregado emp){
        lstEmpregados.add(emp);
    }
    
    public void excluirEmpregado(Empregado emp){
        lstEmpregados.remove(emp);
    }
    
    public void excluirTodosOsEmpregados(Empregado emp){
        lstEmpregados.removeAll(lstEmpregados);
    }
    
    public int getTotalEmpregados(){
        return lstEmpregados.size();
    }
    
    public void imprimirEmpregados(){
        for(Empregado empregado : lstEmpregados){
            System.out.println("- " + empregado.getNome());
            System.out.println("Salario = " + empregado.getSalario());
        }
    }
    
}
