package sample.Cards.Troops;
public class Wizard extends TroopsF{
    public Wizard(int level){
        switch (level){
            case 1:
                HP = 340;
                Damage = 130;
                break;
            case 2:
                HP = 374;
                Damage = 143;
                break;
            case 3:
                HP = 411;
                Damage = 157;
                break;
            case 4:
                HP = 452;
                Damage = 172;
                break;
            case 5:
                HP = 496;
                Damage = 189;
                break;
        }
        HitSpeed = 1.7f;
        Speed = SpeedTypes.Medium;
        Target = TargetTypes.Air_Ground;
        RangeType = RangeTypes.Ranged;
        RangeSize = 5;
        AreaSplash = true;
        Count = 1;
        Cost = 5;
    }
}
