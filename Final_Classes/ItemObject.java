// ---------------------------------------------------------------------------
// File name:ItemObject
// Project name:SesamePokerim
// ---------------------------------------------------------------------------
// Creator’s name and email: Bryson Brandon - brandonbc@etsu.edu
// Course-Section: 1260-001
// Creation Date: 11/10/21
// Date of Last Modification:
// ---------------------------------------------------------------------------

public class ItemObject
{
    private int itemLevel;
    private int itemX;
    private int itemY;
    private String name;
    private int dmg;
    private DamageType statusEffect;
    private String description;


    //default constructor
    public ItemObject(int itemLevel, int itemX, int itemY, String name, int dmg, DamageType statusEffect, String description)
    {
    
    }

    public ItemObject()
    {

    }

    public int getItemLevel()
    {
        return itemLevel;
    }

    public void setItemLevel(int itemLevel)
    {
        this.itemLevel = itemLevel;
    }

    public int getItemX()
    {
        return itemX;
    }

    public void setItemX(int itemX)
    {
        this.itemX = itemX;
    }

    public int getItemY()
    {
        return itemY;
    }

    public void setItemY(int itemY)
    {
        this.itemY = itemY;
    }

    public DamageType getStatusEffect()
    {
        return statusEffect;
    }

    public void setStatusEffect(DamageType statusEffect)
    {
        this.statusEffect = statusEffect;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getDmg()
    {
        return dmg;
    }

    public void setDmg(int dmg)
    {
        this.dmg = dmg;
    }

    public String getDescription()
    {
        return description;
    
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    


}