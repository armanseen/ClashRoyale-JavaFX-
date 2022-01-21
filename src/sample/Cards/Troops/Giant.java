package sample.Cards.Troops;
public class Giant extends TroopsF{
    public Giant(int level){
        switch (level){
            case 1:
                HP = 2000;
                Damage = 126;
                break;
            case 2:
                HP = 2200;
                Damage = 138;
                break;
            case 3:
                HP = 2420;
                Damage = 152;
                break;
            case 4:
                HP = 2660;
                Damage = 167;
                break;
            case 5:
                HP = 2920;
                Damage = 183;
                break;
        }
        HitSpeed = 1.5f;
        Speed = SpeedTypes.Slow;
        Target = TargetTypes.Buildings;
        RangeType = RangeTypes.Melee;
        RangeSize = 0;
        AreaSplash = false;
        Count = 1;
        Cost = 5;
    }
}
