package br.souza.projetofinal;

public class WaterConditions {
    private float temperature;
    private float salinity;
    private int depth;
    private WaterType waterType;
    public WaterConditions(float temperature, float salinity, int depth, WaterType waterType) {
        this.temperature = temperature;
        this.salinity = salinity;
        this.depth = depth;
        this.waterType = waterType;
    }
    
    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getSalinity() {
        return salinity;
    }

    public void setSalinity(float salinity) {
        this.salinity = salinity;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
    public WaterType getWaterType() {
        return waterType;
    }
    public void setWaterType(WaterType waterType) {
        this.waterType = waterType;
    }

    public String summary() {
        return "Temperature: " + temperature + "°C, Salinity: " + salinity + " ppt, Depth: " + depth + " meters";
    }
    public boolean isGoodFor(String creatureName){
        return waterType.isSuitable(creatureName);
    }
}
