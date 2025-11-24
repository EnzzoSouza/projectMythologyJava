package br.souza.projetofinal;

public class SaltWater extends WaterType {
    public SaltWater(String name, int depth, String description) {
        super(name, depth, description);
    }

    @Override
    public String describe() {
        return "Salt Water: " + getDescription() + ", Depth: " + getDepth() + " meters.";
    }

    @Override
    public boolean isSuitable(String creatureName) {
            return creatureName.equalsIgnoreCase("Kraken") ||
            creatureName.equalsIgnoreCase("Leviathan")
            || creatureName.equalsIgnoreCase("Jormungandr")
            || creatureName.equalsIgnoreCase("Triton")
            || creatureName.equalsIgnoreCase("Poseidon");
         
         
    }

}
