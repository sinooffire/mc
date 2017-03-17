package items;

//Local Imports
import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

//Minecraft Imports
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemRefinedRubyBoots extends ItemArmor {

	public ItemRefinedRubyBoots(ArmorMaterial armorMaterial, int renderIndex)
	{
		super(armorMaterial, renderIndex, EntityEquipmentSlot.FEET);
		setUnlocalizedName(Reference.MetropolisItems.REFINEDRUBYBOOTS.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.REFINEDRUBYBOOTS.getRegistryName());
		setCreativeTab(Metropolis.tabMCombat);
	}

}