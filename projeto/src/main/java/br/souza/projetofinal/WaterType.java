package br.souza.projetofinal;

public abstract class WaterType {
    private String name;
    private int depth;
    private String description;

    public WaterType(String name, int depth, String description) {
        this.name = name;
        this.depth = depth;
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDepth() {
        return depth;
    }
    public void setDepth(int depth) {
        this.depth = depth;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public abstract String describe();
    public abstract boolean isSuitable(String creatureName);
}
