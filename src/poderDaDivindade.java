public class poderDaDivindade {

    String divinePower;
    double intensity;
    double faithCost;
    double initialFaith;

    public poderDaDivindade(String poderDivino, double intensidade, double custoDeFe, double feInicial) {

        divinePower = poderDivino;
        intensity = intensidade;
        faithCost = custoDeFe;
        initialFaith = feInicial;
    }

    public static void main(String[] args) {

        poderDaDivindade oNegocio = new poderDaDivindade("O Negócio", 2, 24, 100);

        poderDaDivindade handsUp = new poderDaDivindade("Erguei as mãos", 4, 50, 110);


    }

    public double saldoFe(double initialFaith, double faithCost) {
        return initialFaith - faithCost;
    }
}
