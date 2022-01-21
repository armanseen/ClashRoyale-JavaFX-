package sample.Cards.Buildings;
public class Inferno_Tower extends BuildingsF{
    private int Min_Damage;
    private int Max_Damage;
    public Inferno_Tower(int level){
        switch (level){
            case 1:
                HP = 800;
                Min_Damage = 20;
                Max_Damage = 400;
                break;
            case 2:
                HP = 880;
                Min_Damage = 22;
                Max_Damage = 440;
                break;
            case 3:
                HP = 968;
                Min_Damage = 24;
                Max_Damage = 484;
                break;
            case 4:
                HP = 1064;
                Min_Damage = 26;
                Max_Damage = 532;
                break;
            case 5:
                HP = 1168;
                Min_Damage = 29;
                Max_Damage = 584;
                break;
        }
        HitSpeed = 0.4f;
        Target = TargetTypes.Air_Ground;
        RangeType = RangeTypes.Ranged;
        RangeSize = 6f;
        Cost = 5;
    }
}
