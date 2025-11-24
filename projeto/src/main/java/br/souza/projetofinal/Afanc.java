package br.souza.projetofinal;

public class Afanc extends LuringCreature {
    private boolean isInvisible;
    private int waterTurbulenceLevel;
    public Afanc(String name, int levelOfDanger, Habitat habitat, float size, MythologyTypeEnum mythology, String historicalSignificance, int victimCount, String lureMethod, boolean isInvisible, int waterTurbulenceLevel) {
        super(name, levelOfDanger, habitat, size, mythology, historicalSignificance, victimCount, lureMethod);
        this.isInvisible = isInvisible;
        this.waterTurbulenceLevel = waterTurbulenceLevel;
    }
    
    public Afanc(String name, int victimCount, String lureMethod, boolean isInvisible, int waterTurbulenceLevel) {
        super(name, 7, 
            new Habitat("Welsh Lakes", MythologyTypeEnum.WELSH, "Wales", "Temperate", 
         
            new WaterConditions(15.0f, 0.8f, 12, 
            new MixedWater("Welsh Lake", 20, "Mountain lake water"))), 2.8f, MythologyTypeEnum.WELSH, "Welsh lake monster that resembles a beaver-crocodile hybrid, known for causing floods and drowning victims", victimCount, lureMethod);
        this.isInvisible = isInvisible;
        this.waterTurbulenceLevel = waterTurbulenceLevel;
    }
    
    public boolean isInvisible() {
        return isInvisible;
    }
    
    public void setInvisible(boolean isInvisible) {
        this.isInvisible = isInvisible;
    }
    
    public int getWaterTurbulenceLevel() {
        return waterTurbulenceLevel;
    }
    
    public void setWaterTurbulenceLevel(int waterTurbulenceLevel) {
        this.waterTurbulenceLevel = waterTurbulenceLevel;
    }
    
    @Override
    public void attractVictim(String target){
        if (isInvisible) {
            System.out.println(getName() + " is invisibly using " + getLureMethod() + " to attract " + target + "!");
        } else {
            System.out.println(getName() + " is using " + getLureMethod() + " to attract " + target + "!");
        }
    }
    
    public void dragUnderwater(String target){
        System.out.println(getName() + " is dragging " + target + " underwater with tremendous force!");
        if (waterTurbulenceLevel > 5) {
            System.out.println("The water churns violently with turbulence level " + waterTurbulenceLevel + "!");
        }
    }
    
    @Override
    public void attack() {
        System.out.println(getName() + " emerges from the depths!");
        if (isInvisible) {
            System.out.println("It's invisible - victims can't see it coming!");
        }
        attractVictim("lake traveler");
        createTurbulence();
        dragUnderwater("victim");
        setVictimCount(getVictimCount() + 1);
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("Invisible: " + (isInvisible ? "Yes" : "No"));
        System.out.println("Water Turbulence Level: " + waterTurbulenceLevel + "/10");
        System.out.println("Special Ability: Can become invisible and control water turbulence");
    }
    

    public void createTurbulence() {
        if (waterTurbulenceLevel > 0) {
            System.out.println(getName() + " creates violent water turbulence (level " + waterTurbulenceLevel + ")!");
            if (waterTurbulenceLevel >= 8) {
                System.out.println("The turbulence is causing minor flooding!");
            }
        }
    }
    
    public void becomeInvisible() {
        this.isInvisible = true;
        System.out.println(getName() + " has become invisible!");
    }
    
    public void becomeVisible() {
        this.isInvisible = false;
        System.out.println(getName() + " has become visible!");
    }
    

    

}