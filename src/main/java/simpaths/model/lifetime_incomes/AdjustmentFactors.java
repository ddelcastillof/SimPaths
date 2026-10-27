package simpaths.model.lifetime_incomes;

public class AdjustmentFactors {

    public static double normIncomeZero = 1.0;

    public static double fixedEffect = 0.5;

    public static double[] whiteNoise = {
            0.5000	,        // age0
            0.5000	,        // age1
            0.5000	,        // age2
            0.5000	,        // age3
            0.5000	,        // age4
            0.5000	,        // age5
            0.5000	,        // age6
            0.5000	,        // age7
            0.5000	,        // age8
            0.5000	,        // age9
            0.5000	,        // age10
            0.5000	,        // age11
            0.5000	,        // age12
            0.5000	,        // age13
            0.5000	,        // age14
            0.5000	,        // age15
            0.5000	,        // age16
            0.5000	,        // age17
            0.5000	,        // age18
            0.5000	,        // age19
            0.5000	,        // age20
            0.5000	,        // age21
            0.5000	,        // age22
            0.5000	,        // age23
            0.5000	,        // age24
            0.5000	,        // age25
            0.5000	,        // age26
            0.5000	,        // age27
            0.5000	,        // age28
            0.5000	,        // age29
            0.5000	,        // age30
            0.5000	,        // age31
            0.5000	,        // age32
            0.5000	,        // age33
            0.5000	,        // age34
            0.5000	,        // age35
            0.5000	,        // age36
            0.5000	,        // age37
            0.5000	,        // age38
            0.5000	,        // age39
            0.5000	,        // age40
            0.5000	,        // age41
            0.5000	,        // age42
            0.5000	,        // age43
            0.5000	,        // age44
            0.5000	,        // age45
            0.5000	,        // age46
            0.5000	,        // age47
            0.5000	,        // age48
            0.5000	,        // age49
            0.5000	,        // age50
            0.5000	,        // age51
            0.5000	,        // age52
            0.5000	,        // age53
            0.5000	,        // age54
            0.5000	,        // age55
            0.5000	,        // age56
            0.5000	,        // age57
            0.5000	,        // age58
            0.5000	,        // age59
            0.5000	,        // age60
            0.5000	,        // age61
            0.5000	,        // age62
            0.5000	,        // age63
            0.5000	,        // age64
            0.5000	,        // age65
            0.5000	,        // age66
            0.5000	,        // age67
            0.5000	,        // age68
            0.5000	,        // age69
            0.5000	,        // age70
            0.5000	,        // age71
            0.5000	,        // age72
            0.5000	,        // age73
            0.5000	,        // age74
            0.5000	,        // age75
            0.5000	,        // age76
            0.5000	,        // age77
            0.5000	,        // age78
            0.5000	,        // age79
            0.5000	,        // age80
    };

    public static double getWhiteNoise(int age) {
        return whiteNoise[age];
    }
}
