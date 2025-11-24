package br.souza.projetofinal;

public interface AquaticArtefact extends Cloneable {
    AquaticArtefact clone();
    void activate();
    String getName();
}
