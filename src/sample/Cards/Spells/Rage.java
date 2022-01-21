package sample.Cards.Spells;

public class Rage extends SpellsF{
    private float Duration;
    public Rage(int level) {
        switch (level) {
            case 1:
                Duration = 6.0f;
                break;
            case 2:
                Duration = 6.5f;
                break;
            case 3:
                Duration = 7.0f;
                break;
            case 4:
                Duration = 7.5f;
                break;
            case 5:
                Duration = 8.0f;
                break;
        }
        Ability = "40%DamageBoost;40%SpeedBoost;40%HitSpeedBoost";
        Radius = 5f;
        Cost = 3;
    }
}