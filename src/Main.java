public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(100, 20, "FIREBALL"),
                new Medic(80, 10, "HEALING", 50),
                new Warrior(120, 30, "CRITICAL DAMAGE")
        };

        for (Hero hero : heroes) {
            hero.applySuperAbility();

            if (hero instanceof Medic) {
                Medic medic = (Medic) hero;
                medic.increaseExperience();
                System.out.println("Новый опыт лечения медика: " + medic.getHealPoints());
            }
        }
    }
}