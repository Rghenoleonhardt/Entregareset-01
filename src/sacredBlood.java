public class sacredBlood {

    String magic;
    double attackPower;
    double manaCost;

    public sacredBlood(String magia, double poderDeAtaque, double custoDeMana){

        magic = magia;
        attackPower = poderDeAtaque;
        manaCost = custoDeMana;
    }

    public static void main(String[] args) {

        sacredBlood sangue = new sacredBlood("Sacred Blood", 5, 40);

        System.out.println("Magia = " + sangue.magic);
        System.out.println("Poder de ataque = " + sangue.attackPower);
        System.out.println("Custo de Mana = " + sangue.manaCost);
    }
}
