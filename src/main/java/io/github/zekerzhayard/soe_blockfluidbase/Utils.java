package io.github.zekerzhayard.soe_blockfluidbase;

import net.minecraft.block.Block;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = "soe_blockfluidbase")
public class Utils {
    public Utils() {
        System.out.println(BlockFluidBase.class);
    }

    private final static Logger LOGGER = LogManager.getLogger();

    public static Block print(Block block) {
        if (block != null) {
            LOGGER.info("{} -|- {}", block.getClass().getName(), block.toString());
        } else {
            LOGGER.info("null -|- null");
        }
        return block;
    }
}
