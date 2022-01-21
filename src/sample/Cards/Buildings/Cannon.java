package sample.Cards.Buildings;
public class Cannon extends BuildingsF{
    public Cannon(int level){
        switch (level){
            case 1:
                HP = 380;
                Damage = 60;
                break;
            case 2:
                HP = 418;
                Damage = 66;
                break;
            case 3:
                HP = 459;
                Damage = 72;
                break;
            case 4:
                HP = 505;
                Damage = 79;
                break;
            case 5:
                HP = 554;
                Damage = 87;
                break;
        }
        HitSpeed = 0.8f;
        Target = TargetTypes.Ground;
        RangeType = RangeTypes.Ranged;
        RangeSize = 5.5f;
        Cost = 6;
    }
}
