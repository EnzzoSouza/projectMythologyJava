package br.souza.projetofinal;

public class Triton extends MythologicalCreature {
    private TritonsConch conch;
    public Triton(String name, TritonsConch conch) {
        setName(name);
        this.conch = conch;
    }
    public TritonsConch getConch() {
        return conch;
    }
    public void setConch(TritonsConch conch) {
        this.conch = conch;
    }
    @Override
    public void info() {
        super.info();
        System.out.println("Artefact: Triton's Conch");
        conch.activate();
    }
}
