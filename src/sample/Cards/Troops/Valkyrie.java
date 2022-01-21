package sample.Cards.Troops;
public class Valkyrie extends TroopsF{
    public Valkyrie(int level){
        switch (level){
            case 1:
                HP = 880;
                Damage = 120;
                break;
            case 2:
                HP = 968;
                Damage = 132;
                break;
            case 3:
                HP = 1064;
                Damage = 145;
                break;
            case 4:
                HP = 1170;
                Damage = 159;
                break;
            case 5:
                HP = 1284;
                Damage = 175;
                break;
        }
        HitSpeed = 1.5f;
        Speed = SpeedTypes.Medium;
        Target = TargetTypes.Ground;
        RangeType = RangeTypes.Melee;
        RangeSize = 0;
        AreaSplash = true;
        Count = 1;
        Cost = 4;
    }
}
