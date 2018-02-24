package de.kaes3kuch3n.advancedassembly.blocks;

import de.kaes3kuch3n.advancedassembly.AdvancedAssembly;
import de.kaes3kuch3n.advancedassembly.blocks.ores.BlockOreCopper;
import de.kaes3kuch3n.advancedassembly.references.Names;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(AdvancedAssembly.MOD_ID)
public class ModBlocks {

    @GameRegistry.ObjectHolder(Names.oreCopper)
    public static BlockOreCopper blockOreCopper;

}
