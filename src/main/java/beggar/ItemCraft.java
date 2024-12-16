package beggar;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemCraft extends Item {
    public ItemCraft(String texture){
        setUnlocalizedName("Sunarium");
        setTextureName(beggar.MODID+":"+texture);
        setMaxStackSize(64);
        GameRegistry.registerItem(this, "Sunarium");
    }
}
