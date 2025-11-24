package br.souza.projetofinal;

public abstract class MythologicalCreature {
    private String name;
    private int levelOfDanger;
    private Habitat habitat;
    private float size;
    private MythologyTypeEnum mythology;
    private String historicalSignificance;
    public MythologicalCreature() {
    }

    public MythologicalCreature(String name, int levelOfDanger, Habitat habitat, float size, MythologyTypeEnum mythology, String historicalSignificance) {
        this.name = name;
        this.levelOfDanger = levelOfDanger;
        this.habitat = habitat;
        this.size = size;
        this.mythology = mythology;
        this.historicalSignificance = historicalSignificance;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLevelOfDanger() {
        return levelOfDanger;
    }
    public void setLevelOfDanger(int levelOfDanger) {
        this.levelOfDanger = levelOfDanger;
    }
    public Habitat getHabitat() {
        return habitat;
    }
    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }
    public float getSize() {
        return size;
    }
    public void setSize(float size) {
        this.size = size;
    }
    public MythologyTypeEnum getMythology() {
        return mythology;
    }
    public void setMythology(MythologyTypeEnum mythology) {
        this.mythology = mythology;
    }
    public String getHistoricalSignificance() {
        return historicalSignificance;
    }
    public void setHistoricalSignificance(String historicalSignificance) {
        this.historicalSignificance = historicalSignificance;
    }

    public void info(){
        System.out.println("Name: " + name);
        System.out.println("Level of Danger: " + levelOfDanger);
        System.out.println("Habitat: " + habitat);
        System.out.println("Size: " + size);
        System.out.println("Mythology: " + mythology);
        System.out.println("Historical Significance: " + historicalSignificance);
    }

    public void attack(){
        System.out.println(name + " is attacking!");
    }
}
