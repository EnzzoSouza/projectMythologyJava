package br.souza.projetofinal;

public class Jormungandr extends MythologicalCreature {
    private int lengthInMeters;
    private int venomPotencyLevel;
    private boolean worldSerpent;

    public Jormungandr(String name, int levelOfDanger, Habitat habitat, float size, MythologyTypeEnum mythology, String historicalSignificance, int lengthInMeters, int venomPotencyLevel, boolean worldSerpent) {
        super(name, levelOfDanger, habitat, size, mythology, historicalSignificance);
        this.lengthInMeters = lengthInMeters;
        this.venomPotencyLevel = venomPotencyLevel;
        this.worldSerpent = worldSerpent;
    }
    
    public Jormungandr(String name, int lengthInMeters, int venomPotencyLevel, boolean worldSerpent) {
        super(name, 10, 
            new Habitat("Midgard Ocean", MythologyTypeEnum.NORSE, "Surrounding Midgard", "Arctic", 
            new WaterConditions(5.0f, 35.0f, 4000, 
            new SaltWater("World Ocean", 10000, "The ocean that surrounds Midgard"))), lengthInMeters * 0.1f, MythologyTypeEnum.NORSE, "The World Serpent, son of Loki, who encircles Midgard and will battle Thor during Ragnarok");
            this.lengthInMeters = lengthInMeters;
            this.venomPotencyLevel = venomPotencyLevel;
            this.worldSerpent = worldSerpent;
    }
    
    public int getLengthInMeters() {
        return lengthInMeters;
    }
    
    public void setLengthInMeters(int lengthInMeters) {
        this.lengthInMeters = lengthInMeters;
    }
    
    public int getVenomPotencyLevel() {
        return venomPotencyLevel;
    }
    
    public void setVenomPotencyLevel(int venomPotencyLevel) {
        this.venomPotencyLevel = venomPotencyLevel;
    }
    
    public boolean isWorldSerpent() {
        return worldSerpent;
    }
    
    public void setWorldSerpent(boolean worldSerpent) {
        this.worldSerpent = worldSerpent;
    }
    
    @Override
    public void attack() {
        System.out.println(getName() + " rises from the depths!");
        if (worldSerpent) {
            System.out.println("The entire ocean shakes as the World Serpent attacks!");
        }
        useVenom();
        createTidalWave();
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("Length: " + lengthInMeters + " meters");
        System.out.println("Venom Potency: " + venomPotencyLevel);
        System.out.println("World Serpent: " + (worldSerpent ? "Yes - encircles Midgard" : "No"));
        System.out.println("Special Ability: Can create tidal waves and deadly venom");
    }

    public void useVenom() {
        if (venomPotencyLevel > 0) {
            System.out.println(getName() + " unleashes deadly venom (potency level " + venomPotencyLevel + ")!");
        }
    }
    
    public void createTidalWave() {
        System.out.println(getName() + " thrashes its massive body, creating enormous tidal waves!");
        if (worldSerpent) {
            System.out.println("The waves threaten coastal settlements!");
        }
    }
    
    public void encircleWorld() {
        if (worldSerpent) {
            System.out.println(getName() + " positions itself to encircle Midgard, biting its own tail!");
        } else {
            System.out.println(getName() + " is not the World Serpent and cannot encircle Midgard.");
        }
    }
    
    public void prepareForRagnarok() {
        if (worldSerpent) {
            System.out.println(getName() + " senses Ragnarok approaching and prepares to battle Thor!");
            venomPotencyLevel = 10;
            System.out.println("Venom potency increased to maximum level for the final battle!");
        }
    }

}