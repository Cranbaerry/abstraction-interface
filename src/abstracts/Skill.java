package abstracts;

public abstract class Skill {
    private String skillName;
    private int skillDamage;
    private int skillManaCost;
    
    // They all have name, let's implement it for everybody
    public String getName() {
        return skillName;
    }
    
    public void setName(String name) {
    	this.skillName = name;
    }
    
    public int getSkillManaCost() {
    	return this.skillManaCost;
    }
    
    public void setSkillManaCost(int cost) {
    	this.skillManaCost = cost;
    }
    
    public int getSkillDamage() {
    	return this.skillDamage;
    }
    
    public void setSkillDamage(int damage) {
    	this.skillDamage = damage;
    }
    
    // Every entity might have different set of skill (implementation)
    public abstract void useSkill(Entity player, Entity monster);
}
