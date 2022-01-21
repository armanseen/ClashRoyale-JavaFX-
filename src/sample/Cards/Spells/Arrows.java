package sample.Cards.Spells;

public class Arrows extends SpellsF{
    private int AreaDamage;
    public Arrows(int level) {
        switch (level) {
            case 1:
                AreaDamage = 144;
                break;
            case 2:
                AreaDamage = 156;
                break;
            case 3:
                AreaDamage = 174;
                break;
            case 4:
                AreaDamage = 189;
                break;
            case 5:
                AreaDamage = 210;
                break;
        }
        Ability = " Arrows pepper a large area, damaging everyone hit. Reduced damage to Crown Towers.";
        Radius = 4f;
        Cost = 3;
    }
}