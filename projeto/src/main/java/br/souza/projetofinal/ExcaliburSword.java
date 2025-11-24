package br.souza.projetofinal;

public class ExcaliburSword implements AquaticArtefact{
    private String name;
    private int power;
    private MythologyTypeEnum mythologyType;
    private String description;

    public ExcaliburSword() {
        this.name = "Excalibur";
        this.power = 95;
        this.mythologyType = MythologyTypeEnum.ARTHURIAN;
        this.description = "The legendary sword of King Arthur, said to possess magical powers and grant its wielder unmatched strength and authority.";
    }

    public ExcaliburSword(String name, int power, MythologyTypeEnum mythologyType, String description) {
        this.name = name;
        this.power = power;
        this.mythologyType = mythologyType;
        this.description = description;
    }

    @Override
    public AquaticArtefact clone() {
        return new ExcaliburSword(this.name, this.power, this.mythologyType, this.description);
    }
    
    @Override
    public void activate() {
        System.out.println("Excalibur glows with divine light! Power level: " + power);
        System.out.println(description);  
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
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