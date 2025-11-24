package br.souza.projetofinal;

public class BotoCorDeRosa extends LuringCreature {
    private String color;
    private String form;
    public BotoCorDeRosa(String name, int levelOfDanger, Habitat habitat, 
                        float size, MythologyTypeEnum mythology, 
                        String historicalSignificance, int victimCount, 
                        String lureMethod, String color, String form) {
        super(name, levelOfDanger, habitat, size, mythology, historicalSignificance, victimCount, lureMethod);
        this.color = color;
        this.form = form;
    }
    public BotoCorDeRosa(String name, String color, String form) {
        super(name, 6, 
            new Habitat("Amazon River", MythologyTypeEnum.BRAZILIAN, "Amazon", "Tropical", 
            new WaterConditions(28.0f, 0.1f, 10, 
            new FreshWater("Amazon River", 50, "Freshwater river"))), 2.5f, MythologyTypeEnum.BRAZILIAN, "Shape-shifting river dolphin from Brazilian folklore that transforms into a handsome man to lure women during festivals", 0, "transformation and enchanting music");
            this.color = color;
            this.form = form;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getForm() {
        return form;
    }
    
    public void setForm(String form) {
        this.form = form;
    }
    
    @Override
    public void attractVictim(String target){
       System.out.println(getName() + " transforms into a " + form + " and uses " + getLureMethod() + " to attract " + target + "!");
    }
    
    public void dragUnderwater(String target){
       System.out.println(getName() + " is dragging " + target + " underwater to the death!");
    }
    
    @Override
    public void attack() {
        System.out.println(getName() + " attacks by transforming between dolphin and human forms!");
        attractVictim("unsuspecting festival-goer");
        dragUnderwater("victim");
        setVictimCount(getVictimCount() + 1);
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("Color: " + color);
        System.out.println("Form: " + form);
        System.out.println("Special Ability: Shape-shifting between dolphin and human forms");
    }

    public void transform(String newForm) {
        System.out.println(getName() + " is transforming from " + this.form + " to " + newForm + "!");
        this.form = newForm;
    }
}