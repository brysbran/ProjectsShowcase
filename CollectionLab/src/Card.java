public class Card
{
    String creatureType;
    String elementalDmgType;
    int atkStrength;
    int defStrength;


    public void setCreatureType(String creatureType)
    {
        this.creatureType = creatureType;
    }

    public void setElementalDmgType(String elementalDmgType)
    {
        this.elementalDmgType = elementalDmgType;
    }

    public String getCreatureType()
    {
      return creatureType;
    }

    public String getElementalDmgType()
    {
        return elementalDmgType;
    }

    public int getAtkStrength()
    {
        return atkStrength;
    }

    public int getDefStrength()
    {
        return defStrength;
    }
}
