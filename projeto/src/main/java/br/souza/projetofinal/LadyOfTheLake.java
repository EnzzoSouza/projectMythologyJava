package br.souza.projetofinal;

public class LadyOfTheLake extends MythologicalCreature{
    private ExcaliburSword excalibur;
    public LadyOfTheLake(String name, ExcaliburSword excalibur) {
        setName(name);
        this.excalibur = excalibur;
    }
    public ExcaliburSword getExcalibur() {
        return excalibur;
    }
    public void setExcalibur(ExcaliburSword excalibur) {
        this.excalibur = excalibur;
    }
    @Override
    public void info() {
        super.info();
        System.out.println("Artefact: Excalibur Sword");
        excalibur.activate();
    }
    @Override
    public void attack() {
        System.out.println(getName() + " cannot attack as she is a benevolent creature!");
        excalibur.activate();
    }
}
