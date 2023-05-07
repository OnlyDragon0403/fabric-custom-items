package github.onlydragon0403.fabricMod;

import github.onlydragon0403.fabricMod.registry.ModItems;
import github.onlydragon0403.fabricMod.registry.ModBlocks;
import net.fabricmc.api.ModInitializer;

public class FabricMod implements ModInitializer {

  @Override
  public void onInitialize() {
    System.out.println("I am running!");
    ModBlocks.registerBlocks();
    System.out.println("Registered Blocks.");
    ModItems.registerItems();
    System.out.println("Registered Items.");
  }
}
