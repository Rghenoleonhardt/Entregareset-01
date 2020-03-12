public class snakeCatch {
    String magic;
    double attackPower;
    double manaCost;

    public snakeCatch(String magia, double poderDeAtaque, double custoDeMana){

        magic = magia;
        attackPower = poderDeAtaque;
        manaCost = custoDeMana;
    }

    public static void main(String[] args) {

        snakeCatch snaCat = new snakeCatch("Snake Catch", 4, 30);

        System.out.println("Magia = " + snaCat.magic);
        System.out.println("Poder de ataque = " + snaCat.attackPower);
        System.out.println("Custo de Mana = " + snaCat.manaCost);
    }

}
