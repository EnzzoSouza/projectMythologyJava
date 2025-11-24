package br.souza.projetofinal;

public class Leviathan extends MythologicalCreature {
    private int scalesHardness;
    private boolean firesBreath;
    private int wingsSize;

    public Leviathan(String name, int levelOfDanger, Habitat habitat, float size, MythologyTypeEnum mythology, String historicalSignificance, int scalesHardness, boolean firesBreath, int wingsSize) {
        super(name, levelOfDanger, habitat, size, mythology, historicalSignificance);
        this.scalesHardness = scalesHardness;
        this.firesBreath = firesBreath;
        this.wingsSize = wingsSize;
    }

    public Leviathan(String name, int scalesHardness, boolean firesBreath, int wingsSize) {
        super(name, 10, 
            new Habitat("Primordial Ocean", MythologyTypeEnum.MESOPOTAMIAN, "Ancient Seas", "Tropical", 
            new WaterConditions(25.0f, 35.0f, 3000, 
            new SaltWater("Primordial Sea", 5000, "Ancient cosmic waters"))), 50.0f, MythologyTypeEnum.MESOPOTAMIAN, "Primordial sea monster of immense size, often depicted as a dragon-like creature with impenetrable scales and fire-breathing ability");
        this.scalesHardness = scalesHardness;
        this.firesBreath = firesBreath;
        this.wingsSize = wingsSize;
    }
    
    public int getScalesHardness() {
        return scalesHardness;
    }
    
    public void setScalesHardness(int scalesHardness) {
        this.scalesHardness = scalesHardness;
    }
    
    public boolean isFiresBreath() {
        return firesBreath;
    }
    
    public void setFiresBreath(boolean firesBreath) {
        this.firesBreath = firesBreath;
    }
    
    public int getWingsSize() {
        return wingsSize;
    }
    
    public void setWingsSize(int wingsSize) {
        this.wingsSize = wingsSize;
    }
    
    @Override
    public void attack() {
        System.out.println(getName() + " emerges from the primordial depths!");
        if (firesBreath) {
            breathFire();
            awakenPrimordialPower();
        }
        summonsStorm();
        createTsunami();
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("Scales Hardness: " + scalesHardness + "/10");
        System.out.println("Fire Breath: " + (firesBreath ? "Yes - can breathe fire" : "No"));
        System.out.println("Wings Size: " + wingsSize + " meters");
        System.out.println("Special Ability: Storm summoning and primordial destruction");
    }
    
    public void summonsStorm(){
        System.out.println(getName() + " is summoning a cataclysmic storm!");
        System.out.println("Lightning cracks across the sky as hurricane winds howl!");
        if (wingsSize > 10) {
            System.out.println("The storm intensifies as " + getName() + " beats its massive wings!");
        }
    }
    
    public void breathFire(){
        if(firesBreath){
            System.out.println(getName() + " breathes a torrent of primordial fire!");
            System.out.println("The ocean boils where the fire touches the water!");
        } else {
            System.out.println(getName() + " cannot breathe fire.");
        }
    }
    
    public void ability(){
        System.out.println(getName() + " has scales hardness of " + scalesHardness + "/10, wings size of " + wingsSize + "m and fire breath: " + firesBreath);
    }
    
    public void createTsunami() {
        System.out.println(getName() + " thrashes its body, creating a colossal tsunami!");
        System.out.println("Coastal cities would be wiped out by such a wave!");
    }
    
    public void awakenPrimordialPower() {
        System.out.println(getName() + " awakens its primordial power!");
        scalesHardness = 10;
        firesBreath = true;
        System.out.println("Scales hardened to maximum and fire breath activated!");
    }
}