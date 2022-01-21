package sample.Cards.Troops;
public abstract class TroopsF {
    enum SpeedTypes{Slow, Medium, Fast}
    enum TargetTypes{Air, Ground, Air_Ground, Buildings}
    enum RangeTypes{Melee, Ranged}
    int HP;
    int Damage;
    float HitSpeed;
    SpeedTypes Speed;
    TargetTypes Target;
    RangeTypes RangeType;
    int RangeSize;
    boolean AreaSplash;
    int Count;
    int Cost;
}
