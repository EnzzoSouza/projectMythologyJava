package br.souza.projetofinal;

public class Habitat {
    private String name;
    private MythologyTypeEnum mythology;
    private String geographicalRegion;
    private String climate;
    private WaterConditions waterConditions;
    public Habitat() {
    }
    public Habitat(String name, String geographicalRegion) {
        this.name = name;
        this.geographicalRegion = geographicalRegion;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public MythologyTypeEnum getMythology() {
        return mythology;
    }
    public void setMythology(MythologyTypeEnum mythology) {
        this.mythology = mythology;
    }
    public String getGeographicalRegion() {
        return geographicalRegion;
    }
    public void setGeographicalRegion(String geographicalRegion) {
        this.geographicalRegion = geographicalRegion;
    }
    public String getClimate() {
        return climate;
    }
    public void setClimate(String climate) {
        this.climate = climate;
    }
    public WaterConditions getWaterConditions() {
        return waterConditions;
    }
    public void setWaterConditions(WaterConditions waterConditions) {
        this.waterConditions = waterConditions;
    }
    public Habitat(String name, MythologyTypeEnum mythology, String geographicalRegion, String climate, WaterConditions waterConditions) {
        this.name = name;
        this.mythology = mythology;
        this.geographicalRegion = geographicalRegion;
        this.climate = climate;
        this.waterConditions = waterConditions;
    }
    public boolean isHistoricallyAccurate() {
        return true;
    }
    
}
