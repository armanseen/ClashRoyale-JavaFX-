package sample.Cards.Buildings;

public abstract class BuildingsF{
    enum TargetTypes{Air, Ground, Air_Ground}
    enum RangeTypes{Melee, Ranged}
    int HP;
    int Damage;
    float HitSpeed;
    TargetTypes Target;
    RangeTypes RangeType;
    float RangeSize;
    int LifeTime;
    int Cost;
}