package br.souza.projetofinal;

public class FreshWater extends WaterType{
    public FreshWater(String name, int depth, String description) {
        super(name, depth, description);
    }

    @Override
    public String describe() {
        return "Fresh Water: " + getDescription() + ", Depth: " + getDepth() + " meters.";
    }

    @Override
    public boolean isSuitable(String creatureName) {
        return creatureName.equalsIgnoreCase("BotoCorDeRosa")
          || creatureName.equalsIgnoreCase("LadyOfTheLake")
          || creatureName.equalsIgnoreCase("Afanc")
          || creatureName.equalsIgnoreCase("Ahuizotl");
    }
}
