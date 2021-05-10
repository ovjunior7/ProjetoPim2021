
package sindicatoteste;

/**
 *
 * @author Osvaldo Viana Junior
 */
public class SindicatoTeste {

    public static void main(String[] args) {
        Empregado presidente = new Empregado("Joao Ferreira",35);
        Sindicato sindicato = new Sindicato("Os empregados felices",presidente);
        sindicato.incluirEmpregado(new Empregado("Marcio"));
        sindicato.incluirEmpregado(new Empregado("Leandro"));
        sindicato.incluirEmpregado(new Empregado("Fulgencio"));
        System.out.println("Número de Empregados = " + sindicato.getTotalEmpregados());
        sindicato.imprimirEmpregados();
    }
    
}
