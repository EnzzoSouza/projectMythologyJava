package br.souza.projetofinal;

public class TritonsConch implements AquaticArtefact{
    private String name;
    private int powerLevel;
    private MythologyTypeEnum mythologyType;
    private String description;

    public TritonsConch() {
        this.name = "Triton's Conch";
        this.powerLevel = 85;
        this.mythologyType = MythologyTypeEnum.GREEK;
        this.description = "The conch shell trumpet of Triton, messenger of the sea, said to have the power to calm or raise the waves.";
    }

    public TritonsConch(String name, int powerLevel, MythologyTypeEnum mythologyType, String description) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.mythologyType = mythologyType;
        this.description = description;
    }

    @Override
    public AquaticArtefact clone() {
        return new TritonsConch(this.name, this.powerLevel, this.mythologyType, this.description);
    }
    @Override
    public void activate() {
        System.out.println("Activating Triton's Conch: " + description);
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
