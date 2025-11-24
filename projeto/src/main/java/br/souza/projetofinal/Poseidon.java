package br.souza.projetofinal;

public class Poseidon extends MythologicalCreature {
    private TridentOfPoseidon trident;

    public Poseidon(String name, TridentOfPoseidon trident) {
        setName(name);
        this.trident = trident;
    }
    public TridentOfPoseidon getTrident() {
        return trident;
    }
    public void setTrident(TridentOfPoseidon trident) {
        this.trident = trident;
    }
    @Override
    public void info() {
        super.info();
        System.out.println("Artefact: Trident of Poseidon");
        trident.activate();
    }

}
