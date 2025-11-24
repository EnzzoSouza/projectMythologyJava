package br.souza.projetofinal;

public class Kraken extends MythologicalCreature {
    private int tentacleCount;
    private int depth;
    private boolean swirls;

    public Kraken(String name, int levelOfDanger, Habitat habitat, float size, MythologyTypeEnum mythology, String historicalSignificance, int tentacleCount, int depth, boolean swirls) {
        super(name, levelOfDanger, habitat, size, mythology, historicalSignificance);
        this.tentacleCount = tentacleCount;
        this.depth = depth;
        this.swirls = swirls;
    }
    
    public Kraken(String name, int tentacleCount, int depth, boolean swirls) {
        super(name, 9, 
            new Habitat("North Atlantic Ocean", MythologyTypeEnum.NORSE, "North Atlantic", "Arctic", 
            new WaterConditions(4.0f, 35.0f, depth, 
            new SaltWater("Deep Ocean", 5000, "Deep cold ocean waters"))), 30.0f, MythologyTypeEnum.NORSE, "Gigantic sea monster from Norse mythology that attacks ships and creates deadly whirlpools");
        this.tentacleCount = tentacleCount;
        this.depth = depth;
        this.swirls = swirls;
    }

    public int getTentacleCount() {
        return tentacleCount;
    }

    public void setTentacleCount(int tentacleCount) {
        this.tentacleCount = tentacleCount;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public boolean isSwirls() {
        return swirls;
    }

    public void setSwirls(boolean swirls) {
        this.swirls = swirls;
    }
    
    @Override
    public void attack() {
        System.out.println(getName() + " emerges from the depths!");
        useTentacles();
        if (swirls) {
            createSwirls();
        }
        sinkShip(" perseus");
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("Tentacle Count: " + tentacleCount);
        System.out.println("Maximum Depth: " + depth + " meters");
        System.out.println("Swirl Ability: " + (swirls ? "Yes - can create whirlpools" : "No"));
        System.out.println("Special Ability: Ship destruction and deep ocean control");
    }
    
    public void createSwirls(){
        if(swirls){
            System.out.println(getName() + " is creating massive, ship-swallowing whirlpools!");
        } else {
            System.out.println(getName() + " cannot create whirlpools.");
        }
    }
    
    public void sinkShip(String shipName){
        System.out.println(getName() + " is attacking the " + shipName + " with its " + tentacleCount + " powerful tentacles!");
        System.out.println("The ship is being torn apart and dragged to the depths!");
    }
    
    public void ability(){
        System.out.println(getName() + " has " + tentacleCount + " tentacles, can dive to " + depth + " meters, and swirl ability: " + swirls);
    }

    public void useTentacles() {
        System.out.println(getName() + " lashes out with its " + tentacleCount + " massive tentacles!");
    }
    
    public void emergeFromDepth() {
        System.out.println(getName() + " rises from " + depth + " meters below!");
        if (depth > 1000) {
            System.out.println("The surface boils as the colossal creature ascends!");
        }
    }
    
    public void dragToDepth(String target) {
        System.out.println(getName() + " drags " + target + " down to the dark depths!");
        System.out.println("The pressure at " + depth + " meters is crushing!");
    }
    

}