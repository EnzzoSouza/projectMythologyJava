package br.souza.projetofinal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MythicalArtefactRegistry {
    private List<AquaticArtefact> artefacts;
    private Map<String, AquaticArtefact> artefactMap;
   
    public MythicalArtefactRegistry() {
        this.artefacts = new ArrayList<>();
        this.artefactMap = new HashMap<>();
        initialize();
    }

    private void initialize() {
        registerArtefact(new ExcaliburSword());
        registerArtefact(new TridentOfPoseidon());
        registerArtefact(new TritonsConch());
    }

    public void registerArtefact(AquaticArtefact artefact) {
        artefacts.add(artefact);
        artefactMap.put(artefact.getName().toLowerCase(), artefact);
    }

    public AquaticArtefact createCopy(String artefactName) {
        AquaticArtefact prototype = artefactMap.get(artefactName.toLowerCase());
        
        if (prototype != null) {
            AquaticArtefact copy = prototype.clone();
            System.out.println("Created copy of: " + artefactName);
            return copy;
        }
        
        System.out.println("Artefact not found: " + artefactName);
        return null;
    }

    public void listArtefacts() {
        System.out.println("=== Registered Mythical Artefacts ===");
        for (AquaticArtefact artefact : artefacts) {
            System.out.println("- " + artefact.getName() + " (Power: " + getArtefactPower(artefact) + ")");
        }
    }

    //obter poder do artefato
    //verificar com o professor se eh necessario
    private int getArtefactPower(AquaticArtefact artefact) {
        if (artefact instanceof ExcaliburSword) {
            return ((ExcaliburSword) artefact).getPower();
        } else if (artefact instanceof TridentOfPoseidon) {
            return ((TridentOfPoseidon) artefact).getPowerLevel();
        } else if (artefact instanceof TritonsConch) {
            return ((TritonsConch) artefact).getPowerLevel();
        }
        return 0;
    }
}