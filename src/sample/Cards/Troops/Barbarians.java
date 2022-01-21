package sample.Cards.Troops;
public class Barbarians extends TroopsF{
    public Barbarians(int level){
        switch (level){
            case 1:
                HP = 300;
                Damage = 75;
                break;
            case 2:
                HP = 330;
                Damage = 82;
                break;
            case 3:
                HP = 363;
                Damage = 90;
                break;
            case 4:
                HP = 438;
                Damage = 99;
                break;
            case 5:
                HP = 480;
                Damage = 109;
                break;
        }
        HitSpeed = 1.5f;
        Speed = SpeedTypes.Medium;
        Target = TargetTypes.Ground;
        RangeType = RangeTypes.Melee;
        RangeSize = 0;
        AreaSplash =false;
        Count = 4;
        Cost = 5;
    }
}
