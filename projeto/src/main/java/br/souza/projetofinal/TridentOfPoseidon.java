package br.souza.projetofinal;

public class TridentOfPoseidon implements AquaticArtefact {
    private String name;
    private int powerLevel;
    private MythologyTypeEnum mythologyType;
    private String description;

    public TridentOfPoseidon() {
        this.name = "Trident of Poseidon";
        this.powerLevel = 100;
        this.mythologyType = MythologyTypeEnum.GREEK;
        this.description = "The mighty trident wielded by Poseidon, god of the sea, capable of controlling water and causing earthquakes.";
    }

    public TridentOfPoseidon(String name, int powerLevel, MythologyTypeEnum mythologyType, String description) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.mythologyType = mythologyType;
        this.description = description;
    }

    @Override

    public AquaticArtefact clone() {
        return new TridentOfPoseidon(this.name, this.powerLevel, this.mythologyType, this.description);
    }
    @Override
    public void activate() {
        System.out.println("Trident of Poseidon glows with power! Power level: " + powerLevel);
        System.out.println(description);
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public MythologyTypeEnum getMythologyType() {
        return mythologyType;
    }

    public void setMythologyType(MythologyTypeEnum mythologyType) {
        this.mythologyType = mythologyType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

}
