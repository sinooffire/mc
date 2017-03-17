package items;

//Local Imports
import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

//Minecraft Imports
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemObsidianLeggings extends ItemArmor {

	public ItemObsidianLeggings(ArmorMaterial armorMaterial, int renderIndex)
	{
		super(armorMaterial, renderIndex, EntityEquipmentSlot.LEGS);
		setUnlocalizedName(Reference.MetropolisItems.OBSIDIANLEGGINGS.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.OBSIDIANLEGGINGS.getRegistryName());
		setCreativeTab(Metropolis.tabMCombat);
	}

}