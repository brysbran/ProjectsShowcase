//Joseph Brooks Lays Claim



public class Combat extends Randomizer{

    private Room room;
    private MainCharacter player;
    private Inventory inventory;
    private boolean combat, monsterDead;
    private Enemy enemy;
    private ItemObject weapon;
    private DamageType status;

    private double playerDamage, enemyDamage;
    private double playerHealth, enemyHealth;

    public Combat(Room room, MainCharacter mainCharacter, Inventory inventory) {
        player = mainCharacter;
        this.inventory = inventory;
        this.room = room;
        combat = false;
    }

    public void engageCombat() {
        enemy = room.getEnemyInforamtion();
        combat = true; monsterDead = false;
        enemyDamage = enemy.getDamage();
        playerDamage = player.getDamage();
        enemyHealth = enemy.getHealth();
        playerHealth = player.getHealth();
    }

    public void refreshValues() {

        if(weapon != null) {
            weapon = inventory.getCurrentItemHeld();
            playerDamage = player.getDamage()+ weapon.getDmg();
        }

        enemyDamage = enemy.getDamage();
        playerDamage = player.getDamage();

    }


    public void quit() {
        combat = false;
    }

    public void flee() {
        combat = false;
    }

    public boolean attack() {
        enemyHealth -= playerDamage; //player hits
        if(hit()) {
            playerHealth -= enemyDamage; //enemy has chance of hitting
            return true;
        } 
        return false;
    }

    public void block() {
        
    }

    public boolean isCombat() {
        return combat;
    }

    public void setCombat(boolean combat) {
        this.combat = combat;
    }

    public boolean isMonsterDead() {
        return monsterDead;
    }


    public String getPlayerDamage() {
        return String.valueOf(playerDamage);
    }

    public String getEnemyDamage() {
        return String.valueOf(enemyDamage);
    }

    public String getPlayerHealth() {
        return String.valueOf(playerHealth);
    }

    public double getEnemyHealth() {
        return enemyHealth;
    }

    public DamageType getStatus() {
        return status;
    }
    
}
