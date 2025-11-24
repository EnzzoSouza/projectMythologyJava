package br.souza.projetofinal;

public class WaterSpecificationFacade {
    public WaterType createWaterType(WaterTypeEnum type, String name, int depth, String description) {
        switch (type) {
            case FRESHWATER:
                return new FreshWater(name, depth, description);
            case SALTWATER:
                return new SaltWater(name, depth, description);
            case MIXEDWATER:
                return new MixedWater(name, depth, description);
            default:
                throw new IllegalArgumentException("Invalid water type");
        }
    }
    public WaterConditions createWaterConditions(float temperature, float salinity, int depth, WaterType waterType) {
        return new WaterConditions(temperature, salinity, depth, waterType);
    }
    public boolean evaluate(String name, WaterType WaterType , WaterConditions conditions) {
        if(WaterType == null || conditions == null){
            return false;
        }
        return WaterType.isSuitable(name) && conditions.isGoodFor(name);
    }
}
