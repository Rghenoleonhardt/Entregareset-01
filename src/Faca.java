public class Faca {

    String weapon;
    double attackPower;

    public Faca(String arma, double poderDeAtaque){

        weapon = arma;
        attackPower = poderDeAtaque;
    }

    public static void main(String[] args) {

        Faca knife = new Faca("Faca", 2.5);

        System.out.println("Arma = " + knife.weapon);
        System.out.println("Poder de ataque = " + knife.attackPower);
    }
}
