public class magia {

    String magic;
    double attackPower;
    double manaCost;
    double initialMana;

    public magia(String magia, double poderDeAtaque, double custoDeMana, double manaInicial) {

        magic = magia;
        attackPower = poderDeAtaque;
        manaCost = custoDeMana;
        initialMana = manaInicial;
    }

    public static void main(String[] args) {

        magia sacredBlood = new magia("Sacred Blood", 5, 40, 100);

        magia snakeCatch = new magia("snakeCatch", 4, 30, 100);


    }

    public double saldoMana(double initialMana, double manaCost) {
        return initialMana - manaCost;
    }
}
