package de.kaes3kuch3n.advancedassembly.blocks.ores;

import de.kaes3kuch3n.advancedassembly.AdvancedAssembly;
import de.kaes3kuch3n.advancedassembly.references.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockOreCopper extends Block {

    public BlockOreCopper() {
        super(Material.ROCK);
        setHardness(3.0f);
        setResistance(5.0f);
        setHarvestLevel("pickaxe", 2);
        setUnlocalizedName(AdvancedAssembly.MOD_ID + "." + Names.oreCopper);
        setRegistryName(Names.oreCopper);
        setCreativeTab(AdvancedAssembly.tabAdvancedAssembly);
    }

}
