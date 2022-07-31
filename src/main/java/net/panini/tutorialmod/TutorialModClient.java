package net.panini.tutorialmod;

import net.fabricmc.api.ClientModInitializer;
import net.panini.tutorialmod.block.ModBlocks;
import net.panini.tutorialmod.item.ModItems;

public class TutorialModClient implements ClientModInitializer
{

    @Override
    public void onInitializeClient() {

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}
