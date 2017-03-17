package items;

//Local Imports
import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

//MinecraftImports
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemObsidianHelmet extends ItemArmor {

	public ItemObsidianHelmet(ArmorMaterial armorMaterial, int renderIndex) {

		super(armorMaterial, renderIndex, EntityEquipmentSlot.HEAD);
		
		setUnlocalizedName(Reference.MetropolisItems.OBSIDIANHELMET.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.OBSIDIANHELMET.getRegistryName());
		setCreativeTab(Metropolis.tabMCombat);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		if(EntityEquipmentSlot.LEGS != null) {
			return "fjrmm:textures/models/armor/obsidianarmortexture_layer_2.png";
		}
		
		return "fjrmm:textures/models/armor/obsidianarmortexture_layer_1.png";
	}
}