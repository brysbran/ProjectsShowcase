// ---------------------------------------------------------------------------
// File name:FinalBoss
// Project name:SesamePokerim
// ---------------------------------------------------------------------------
// Creator’s name and email: Elijah Respeto-Smith - respetosmith@etsu.edu
// Course-Section: 1260-001
// Creation Date: 11/12/21
// Date of Last Modification: 11/16/21
// ---------------------------------------------------------------------------
import java.util.Random;

public class Randomizer
{
    //attack success
    //random effects
    private Random randomizer;

    public boolean hit()
    {
        Random randomizer = new Random();
        int i=randomizer.nextInt(2);
        if(i == 2) 
        {
            return true;
        }
        return false;
    }
    public int narration() {
        Random randomizer = new Random();
        int i=randomizer.nextInt(10);
        return i;
    }
    public double attackShuffle()
    {
        int i=randomizer.nextInt(7);
        double[] values;
        values= new double[]{0, 0.5, 1, 1.5, 2, 2.5, 3.0};
        return values[i];
    }
    public DamageType effectShuffle()
    {
        int i=randomizer.nextInt(5);
        int[] values;
        values= new int[]{1,2,3,4,5};
        switch (values[i])
        {
            case 1: return DamageType.POISON;
            case 2: return DamageType.BLEED;
            case 3: return DamageType.INSANE;
            case 4: return DamageType.ANNOYANCE;
            case 5: return DamageType.SWAG;
            default: {System.out.println("what broke?"); return null;}
        }
    }
    public static void test(Randomizer r)
    {
        r.attackShuffle();
        r.effectShuffle();
        r.attackShuffle();
        r.effectShuffle();
        r.attackShuffle();
        r.effectShuffle();
        r.attackShuffle();
        r.effectShuffle();
        r.attackShuffle();
        r.effectShuffle();
        r.attackShuffle();
        r.effectShuffle();
        r.attackShuffle();
        r.effectShuffle();
        r.attackShuffle();
        r.effectShuffle();
        r.attackShuffle();
        r.effectShuffle();
        r.attackShuffle();
        r.effectShuffle();
        r.attackShuffle();
        r.effectShuffle();
        r.attackShuffle();
        r.effectShuffle();
        r.attackShuffle();
        r.effectShuffle();
        r.attackShuffle();
        r.effectShuffle();
        r.attackShuffle();
        r.effectShuffle();
        r.attackShuffle();
        r.effectShuffle();
        r.attackShuffle();
        r.effectShuffle();
        r.attackShuffle();
        r.effectShuffle();
        r.attackShuffle();
        r.effectShuffle();
        r.attackShuffle();
        r.effectShuffle();
        r.attackShuffle();
        r.effectShuffle();
        r.attackShuffle();
        r.effectShuffle();
        r.attackShuffle();
        r.effectShuffle();
        r.attackShuffle();
        r.effectShuffle();
        r.attackShuffle();
        r.effectShuffle();
        r.attackShuffle();
        r.effectShuffle();
        r.attackShuffle();
        r.effectShuffle();
        r.attackShuffle();
        r.effectShuffle();
        r.attackShuffle();
        r.effectShuffle();
    }

}
