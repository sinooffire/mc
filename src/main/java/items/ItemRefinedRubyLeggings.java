package items;

//Local Imports
import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

//Minecraft Imports
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemRefinedRubyLeggings extends ItemArmor {

	public ItemRefinedRubyLeggings(ArmorMaterial armorMaterial, int renderIndex)
	{
		super(armorMaterial, renderIndex, EntityEquipmentSlot.LEGS);
		setUnlocalizedName(Reference.MetropolisItems.REFINEDRUBYLEGGINGS.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.REFINEDRUBYLEGGINGS.getRegistryName());
		setCreativeTab(Metropolis.tabMCombat);
	}

}