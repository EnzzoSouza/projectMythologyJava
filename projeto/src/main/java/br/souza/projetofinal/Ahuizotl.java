package br.souza.projetofinal;

public class Ahuizotl extends LuringCreature {
    private int handStrength;
    private boolean luringCry;
    
    public Ahuizotl(String name, int levelOfDanger, Habitat habitat, float size, MythologyTypeEnum mythology, String historicalSignificance, int victimCount, String lureMethod, int handStrength, boolean luringCry) {
        super(name, levelOfDanger, habitat, size, mythology, historicalSignificance, victimCount, lureMethod);
        this.handStrength = handStrength;
        this.luringCry = luringCry;
    }
    
    public Ahuizotl(String name, int handStrength, boolean luringCry) {
        super(name, 8, 
        new Habitat("Lake Texcoco", MythologyTypeEnum.AZTEC, "Central Mexico", "Temperate", 
        new WaterConditions(22.0f, 1.5f, 8,
        new MixedWater("Lake Texcoco", 15, "Brackish lake water"))), 1.2f, MythologyTypeEnum.AZTEC, "Aztec water creature with a hand on its tail that drowns victims to collect their eyes, teeth, and nails for the gods", 0, "mimicking crying baby sounds");
        this.handStrength = handStrength;
        this.luringCry = luringCry;
    }
    
    public int getHandStrength() {
        return handStrength;
    }
    
    public void setHandStrength(int handStrength) {
        this.handStrength = handStrength;
    }
    
    public boolean isLuringCry() {
        return luringCry;
    }
    
    public void setLuringCry(boolean luringCry) {
        this.luringCry = luringCry;
    }
    
    @Override
    public void attractVictim(String target){
        if (luringCry) {
            System.out.println(getName() + " is mimicking a crying baby to attract " + target + "!");
        } else {
            System.out.println(getName() + " is using " + getLureMethod() + " to attract " + target + "!");
        }
    }
    
    public void dragUnderwater(String target){
        System.out.println(getName() + " is dragging " + target + " underwater with its powerful hand (strength: " + handStrength + ")!");
    }
    
    @Override
    public void attack() {
        System.out.println(getName() + " attacks with its tail-hand!");
        if (luringCry) {
            System.out.println("It mimics a crying baby to lure victims closer...");
        }
        attractVictim("curious traveler");
        dragUnderwater("victim");
        collectBodyParts();
        setVictimCount(getVictimCount() + 1);
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("Hand Strength: " + handStrength);
        System.out.println("Luring Cry: " + (luringCry ? "Active" : "Inactive"));
        System.out.println("Special Ability: Tail with a powerful hand that collects body parts for the gods");
    }
    
    public void collectBodyParts() {
        System.out.println(getName() + " collects eyes, teeth, and nails from its victim for the Aztec gods!");
    }
    
    public void activateLuringCry() {
        this.luringCry = true;
        setLureMethod("crying baby mimicry");
        System.out.println(getName() + " has activated its luring cry ability!");
    }
    
    public void deactivateLuringCry() {
        this.luringCry = false;
        setLureMethod("stealth approach");
        System.out.println(getName() + " has deactivated its luring cry.");
    }
}