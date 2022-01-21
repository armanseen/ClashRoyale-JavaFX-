package sample.Cards.Troops;
public class Mini_PEKKA extends TroopsF{
    public Mini_PEKKA(int level){
        switch (level){
            case 1:
                HP = 600;
                Damage = 352;
                break;
            case 2:
                HP = 660;
                Damage = 357;
                break;
            case 3:
                HP = 726;
                Damage = 393;
                break;
            case 4:
                HP = 798;
                Damage = 432;
                break;
            case 5:
                HP = 876;
                Damage = 474;
                break;
        }
        HitSpeed = 1.8f;
        Speed = SpeedTypes.Fast;
        Target = TargetTypes.Ground;
        RangeType = RangeTypes.Melee;
        RangeSize = 0;
        AreaSplash = false;
        Count = 1;
        Cost = 4;
    }
}
