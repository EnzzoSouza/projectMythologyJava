package br.souza.projetofinal;

public class MixedWater extends WaterType {
    public MixedWater(String name, int depth, String description) {
        super(name, depth, description);
    }

    @Override
    public String describe() {
        return "Mixed Water: " + getDescription() + ", Depth: " + getDepth() + " meters.";
    }

    @Override
    public boolean isSuitable(String creatureName) {
        
    return creatureName.equalsIgnoreCase("Afanc")
        || creatureName.equalsIgnoreCase("Ahuizotl")
        || creatureName.equalsIgnoreCase("Triton");
    }

}

