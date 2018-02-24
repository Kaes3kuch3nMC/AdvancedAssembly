package de.kaes3kuch3n.advancedassembly;

import de.kaes3kuch3n.advancedassembly.blocks.ModBlocks;
import de.kaes3kuch3n.advancedassembly.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = AdvancedAssembly.MOD_ID, name = AdvancedAssembly.MOD_NAME, version = AdvancedAssembly.VERSION,
        dependencies = "after:Forge@[" + AdvancedAssembly.MIN_FORGE_VERSION + ",);", useMetadata = true)
public class AdvancedAssembly {

    public static final String MOD_ID = "advancedassembly";
    public static final String MOD_NAME = "Advanced Assembly";
    public static final String VERSION = "0.0.1.0";

    public static final String MIN_FORGE_VERSION = "14.23.2.2619";

    @SidedProxy(clientSide = "de.kaes3kuch3n.advancedassembly.proxy.ClientProxy", serverSide = "de.kaes3kuch3n.advancedassembly.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static AdvancedAssembly instance;

    public static Logger logger;

    public static CreativeTabs tabAdvancedAssembly = new CreativeTabs(MOD_ID + ".creativeTab") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Item.getItemFromBlock(ModBlocks.blockOreCopper));
        }
    };

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

}
