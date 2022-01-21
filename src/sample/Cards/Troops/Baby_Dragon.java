package sample.Cards.Troops;
public class Baby_Dragon extends TroopsF{
    public Baby_Dragon(int level){
        switch (level){
            case 1:
                HP = 800;
                Damage = 100;
                break;
            case 2:
                HP = 880;
                Damage = 110;
                break;
            case 3:
                HP = 968;
                Damage = 121;
                break;
            case 4:
                HP = 1064;
                Damage = 133;
                break;
            case 5:
                HP = 1168;
                Damage = 146;
                break;
        }
        HitSpeed = 1.8f;
        Speed = SpeedTypes.Fast;
        Target = TargetTypes.Air_Ground;
        RangeType = RangeTypes.Ranged;
        RangeSize = 3;
        AreaSplash = true;
        Count = 1;
        Cost = 4;
    }
}
