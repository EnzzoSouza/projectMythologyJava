package br.souza.projetofinal;

public abstract class LuringCreature extends MythologicalCreature{
    private int victimCount;
    private String lureMethod;
    public LuringCreature(String name, int levelOfDanger, Habitat habitat, float size, MythologyTypeEnum mythology,  String historicalSignificance, int victimCount, String lureMethod) {
        super(name, levelOfDanger, habitat, size, mythology, historicalSignificance);
        this.victimCount = victimCount;
        this.lureMethod = lureMethod;
    }
    public LuringCreature() {
        super();
    }

    public int getVictimCount() {
        return victimCount;
    }
    public void setVictimCount(int victimCount) {
        this.victimCount = victimCount;
    }
    public String getLureMethod() {
        return lureMethod;
    }
    public void setLureMethod(String lureMethod) {
        this.lureMethod = lureMethod;
    }
    public void attractVictim(String target){
       System.out.println(getName() + " is using " + lureMethod + " to attract " + target + "!");
    }
    public void releaseVictim(String target){
       System.out.println(getName() + " has released " + target + "!");
    }

    @Override
    public void attack(){
       System.out.println(getName() + " is attacking with its luring method: " + lureMethod + "!");
       attractVictim("traveler");
    }

}
