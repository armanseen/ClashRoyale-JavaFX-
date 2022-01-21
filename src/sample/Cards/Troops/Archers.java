package sample.Cards.Troops;
public class Archers extends TroopsF{
    public Archers(int level){
        switch (level){
            case 1:
                HP = 125;
                Damage = 33;
                break;
            case 2:
                HP = 127;
                Damage = 44;
                break;
            case 3:
                HP = 151;
                Damage = 48;
                break;
            case 4:
                HP = 166;
                Damage = 53;
                break;
            case 5:
                HP = 182;
                Damage = 58;
                break;
        }
        HitSpeed = 1.2f;
        Speed = SpeedTypes.Medium;
        Target = TargetTypes.Air_Ground;
        RangeType = RangeTypes.Ranged;
        RangeSize = 5;
        AreaSplash = false;
        Count = 2;
        Cost = 3;
    }
}
