package br.souza.projetofinal;

public class CompleteMain {
    public static void main(String[] args) {
      System.out.println("Main do trabalho! ");
        System.out.println("=== INSTANTIATING ALL CONCRETE CLASSES IN THE PROJECT ===\n");
        
        // First create the necessary water types and conditions
        System.out.println("1. CREATING WATER TYPES AND CONDITIONS:");
        
        FreshWater amazonRiver = new FreshWater("Amazon River", 50, "Tropical freshwater river");
        System.out.println("- FreshWater created: " + amazonRiver.getName());
        SaltWater atlanticOcean = new SaltWater("Atlantic Ocean", 4000, "Deep saltwater ocean");
        System.out.println("- SaltWater created: " + atlanticOcean.getName());
        MixedWater welshLake = new MixedWater("Welsh Lake", 20, "Mixed salinity mountain lake");
        System.out.println("- MixedWater created: " + welshLake.getName());
        SaltWater mediterraneanSea = new SaltWater("Mediterranean Sea", 1500, "Ancient sea of gods");
        System.out.println("- SaltWater created: " + mediterraneanSea.getName());
        SaltWater primordialOcean = new SaltWater("Primordial Ocean", 5000, "Ancient cosmic waters");
        System.out.println("- SaltWater created: " + primordialOcean.getName());
        FreshWater lakeTexcoco = new FreshWater("Lake Texcoco", 15, "Brackish lake water");
        System.out.println("- FreshWater created: " + lakeTexcoco.getName());
        SaltWater midgardOcean = new SaltWater("World Ocean", 10000, "The ocean that surrounds Midgard");
        System.out.println("- SaltWater created: " + midgardOcean.getName());
        SaltWater northAtlantic = new SaltWater("Deep Ocean", 5000, "Deep cold ocean waters");
        System.out.println("- SaltWater created: " + northAtlantic.getName());

        
        WaterConditions amazonConditions = new WaterConditions(28.0f, 0.1f, 10, amazonRiver);
        System.out.println("- WaterConditions created for: " + amazonConditions.getWaterType().getName());
        WaterConditions atlanticConditions = new WaterConditions(15.0f, 35.0f, 100, atlanticOcean);
        System.out.println("- WaterConditions created for: " + atlanticConditions.getWaterType().getName());
        WaterConditions welshConditions = new WaterConditions(15.0f, 0.8f, 12, welshLake);
        System.out.println("- WaterConditions created for: " + welshConditions.getWaterType().getName());
        WaterConditions mediterraneanConditions = new WaterConditions(20.0f, 38.0f, 1500, mediterraneanSea);
        System.out.println("- WaterConditions created for: " + mediterraneanConditions.getWaterType().getName());
        WaterConditions primordialConditions = new WaterConditions(25.0f, 35.0f, 3000, primordialOcean);
        System.out.println("- WaterConditions created for: " + primordialConditions.getWaterType().getName());
        WaterConditions texcocoConditions = new WaterConditions(22.0f, 1.5f, 8, lakeTexcoco);
        System.out.println("- WaterConditions created for: " + texcocoConditions.getWaterType().getName());
        WaterConditions midgardConditions = new WaterConditions(5.0f, 35.0f, 4000, midgardOcean);
        System.out.println("- WaterConditions created for: " + midgardConditions.getWaterType().getName());
        WaterConditions deepOceanConditions = new WaterConditions(4.0f, 35.0f, 2000, northAtlantic);
        System.out.println("- WaterConditions created for: " + deepOceanConditions.getWaterType().getName());
        
        // Create habitats
        System.out.println("\n");
        System.out.println("2. CREATING HABITATS:");
        
        Habitat amazonHabitat = new Habitat("Amazon River", MythologyTypeEnum.BRAZILIAN, 
                                          "Amazon", "Tropical", amazonConditions);
        System.out.println("- Habitat created: " + amazonHabitat.getName());
        Habitat welshHabitat = new Habitat("Welsh Lakes", MythologyTypeEnum.WELSH, 
                                         "Wales", "Temperate", welshConditions);
        System.out.println("- Habitat created: " + welshHabitat.getName());                                
        Habitat mediterraneanHabitat = new Habitat("Mediterranean Sea", MythologyTypeEnum.GREEK,
                                                 "Mediterranean", "Temperate", mediterraneanConditions);
        System.out.println("- Habitat created: " + mediterraneanHabitat.getName());
        Habitat primordialHabitat = new Habitat("Primordial Ocean", MythologyTypeEnum.MESOPOTAMIAN,
                                              "Ancient Seas", "Tropical", primordialConditions);
        System.out.println("- Habitat created: " + primordialHabitat.getName());
        Habitat texcocoHabitat = new Habitat("Lake Texcoco", MythologyTypeEnum.AZTEC,
                                           "Central Mexico", "Temperate", texcocoConditions);
        System.out.println("- Habitat created: " + texcocoHabitat.getName());
        Habitat midgardHabitat = new Habitat("Midgard Ocean", MythologyTypeEnum.NORSE,
                                           "Surrounding Midgard", "Arctic", midgardConditions);
        System.out.println("- Habitat created: " + midgardHabitat.getName());
        Habitat northAtlanticHabitat = new Habitat("North Atlantic Ocean", MythologyTypeEnum.NORSE,
                                                 "North Atlantic", "Arctic", deepOceanConditions);
        System.out.println("- Habitat created: " + northAtlanticHabitat.getName());

         System.out.println("\n");
        // Create artifacts
        System.out.println("3. CREATING ARTIFACTS:");
        
        ExcaliburSword excalibur = new ExcaliburSword("Excalibur", 95, 
                                                     MythologyTypeEnum.ARTHURIAN, 
                                                     "The legendary sword of King Arthur, said to possess magical powers");
        System.out.println("- ExcaliburSword created: " + excalibur.getName());
        
        TridentOfPoseidon trident = new TridentOfPoseidon("Trident of Poseidon", 100,
                                                         MythologyTypeEnum.GREEK,
                                                         "The mighty trident wielded by Poseidon, god of the sea");
        System.out.println("- TridentOfPoseidon created: " + trident.getName());
        TritonsConch conch = new TritonsConch("Triton's Conch", 85,
                                             MythologyTypeEnum.GREEK,
                                             "The conch shell trumpet of Triton, messenger of the sea");
        System.out.println("- TritonsConch created: " + conch.getName());
         System.out.println("\n");
        System.out.println("4. CREATING MYTHOLOGICAL CREATURES:");
        
        // Afanc - Complete constructor
        Afanc afanc = new Afanc("Afanc", 7, welshHabitat, 2.8f, MythologyTypeEnum.WELSH,
                               "Welsh lake monster that resembles a beaver-crocodile hybrid", 
                               5, "water disturbances", true, 7);
        System.out.println("- Afanc created: " + afanc.getName());
        
        // Ahuizotl - Complete constructor
        Ahuizotl ahuizotl = new Ahuizotl("Ahuizotl", 8, texcocoHabitat, 1.2f, MythologyTypeEnum.AZTEC,
                                        "Aztec water creature with a hand on its tail that drowns victims",
                                        3, "mimicking crying baby sounds", 85, true);
        System.out.println("- Ahuizotl created: " + ahuizotl.getName());
        
        // BotoCorDeRosa - Complete constructor
        BotoCorDeRosa boto = new BotoCorDeRosa("Boto", 6, amazonHabitat, 2.5f, MythologyTypeEnum.BRAZILIAN,
                                              "Shape-shifting river dolphin from Brazilian folklore",
                                              2, "transformation and enchanting music", "pink", "handsome man");
        System.out.println("- BotoCorDeRosa created: " + boto.getName());
        
        // Jormungandr - Complete constructor
        Jormungandr jormungandr = new Jormungandr("Jormungandr", 10, midgardHabitat, 100.0f, 
                                                 MythologyTypeEnum.NORSE,
                                                 "The World Serpent, son of Loki, who encircles Midgard",
                                                 1000, 8, true);
        System.out.println("- Jormungandr created: " + jormungandr.getName());
        
        // Kraken - Complete constructor
        Kraken kraken = new Kraken("Kraken", 9, northAtlanticHabitat, 30.0f, MythologyTypeEnum.NORSE,
                                  "Gigantic sea monster from Norse mythology that attacks ships",
                                  8, 2000, true);
        System.out.println("- Kraken created: " + kraken.getName());
        
        // Leviathan - Complete constructor
        Leviathan leviathan = new Leviathan("Leviathan", 10, primordialHabitat, 50.0f, 
                                           MythologyTypeEnum.MESOPOTAMIAN,
                                           "Primordial sea monster of immense size",
                                           9, true, 15);
        System.out.println("- Leviathan created: " + leviathan.getName());
        
        // LadyOfTheLake - Complete constructor
        LadyOfTheLake ladyOfTheLake = new LadyOfTheLake("Lady of the Lake", excalibur);
        System.out.println("- LadyOfTheLake created: " + ladyOfTheLake.getName());
        
        // Poseidon - Complete constructor  
        Poseidon poseidon = new Poseidon("Poseidon", trident);
        System.out.println("- Poseidon created: " + poseidon.getName());
        
        // Triton - Complete constructor
        Triton triton = new Triton("Triton", conch);
        System.out.println("- Triton created: " + triton.getName());
        
        System.out.println();
        System.out.println("\n");
        // Create registries and facades
        System.out.println("5. CREATING SYSTEMS AND REGISTRIES:");
        
        MythicalArtefactRegistry registry = new MythicalArtefactRegistry();
        System.out.println("- MythicalArtefactRegistry was created");
        
        WaterSpecificationFacade waterFacade = new WaterSpecificationFacade();
        System.out.println("- WaterSpecificationFacade was created");
        
        System.out.println();
         System.out.println("\n");
        // Demonstrate functionalities
        System.out.println("6. DEMONSTRATING FUNCTIONALITIES:");
        
        // Test creature attacks
        System.out.println("\n--- Creature Attacks ---");
        afanc.attack();
        System.out.println();
        kraken.attack();
        System.out.println();
        leviathan.attack();
        
        // Test creature info
        System.out.println("\n--- Creature Information ---");
        afanc.info();
        System.out.println();
        
        // Test artifact activation
        System.out.println("\n--- Artifact Activation ---");
        excalibur.activate();
        System.out.println();
        trident.activate();
        System.out.println();
        conch.activate();
        
        // Test registry
        System.out.println("\n--- Artifact Registry ---");
        registry.listArtefacts();
        
        // Test artifact cloning
        System.out.println("\n--- Artifact Cloning ---");
        AquaticArtefact excaliburCopy = registry.createCopy("Excalibur");
        if (excaliburCopy != null) {
            excaliburCopy.activate();
        }
        AquaticArtefact tridentCopy = registry.createCopy("Trident of Poseidon");
        if (tridentCopy != null) {
            tridentCopy.activate();
        }
        AquaticArtefact conchCopy = registry.createCopy("Triton's Conch");
        if (conchCopy != null) {
            conchCopy.activate();
        }
        
        // Test water type creation through facade
        System.out.println("\n--- Water Type Creation via Facade ---");
        WaterType newFreshWater = waterFacade.createWaterType(WaterTypeEnum.FRESHWATER, 
                                                             "New River", 30, "Clean freshwater");
        System.out.println("Created new water type: " + newFreshWater.describe());
        
        System.out.println("\n=== ALL CONCRETE CLASSES SUCCESSFULLY INSTANTIATED ===");
    }
}
