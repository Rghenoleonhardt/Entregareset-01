public class Chakram {

    String weapon;
    double attackPower;

    public Chakram(String arma, double poderDeAtaque){

        weapon = arma;
        attackPower = poderDeAtaque;
    }

    public static void main(String[] args) {

        Chakram chak = new Chakram("Chakram", 3);

        System.out.println("Arma = " + chak.weapon);
        System.out.println("Poder de ataque = " + chak.attackPower);
    }
}
