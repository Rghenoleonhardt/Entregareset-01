public class Arma {

    String weapon;
    double attackPower;

    public Arma(String arma, double poderDeAtaque){

        weapon = arma;
        attackPower = poderDeAtaque;
    }

    public static void main(String[] args) {

        Arma faca = new Arma("Faca", 2.5);

        Arma chakram = new Arma("Chakram", 3);
    }
}
