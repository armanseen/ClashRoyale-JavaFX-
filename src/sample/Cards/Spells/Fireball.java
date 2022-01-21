package sample.Cards.Spells;

public class Fireball extends SpellsF{
    private int AreaDamage;
    public Fireball(int level) {
        switch (level) {
            case 1:
                AreaDamage = 325;
                break;
            case 2:
                AreaDamage = 357;
                break;
            case 3:
                AreaDamage = 393;
                break;
            case 4:
                AreaDamage = 432;
                break;
            case 5:
                AreaDamage = 474;
                break;
        }
        Ability = "Incinerates a small area, dealing high damage. Reduced damage to Crown Towers.";
        Radius = 2.5f;
        Cost = 4;
    }
}