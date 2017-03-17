package items;

//Local Imports
import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

//Minecraft Imports
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemRefinedRubyHelmet extends ItemArmor {

	public ItemRefinedRubyHelmet(ArmorMaterial armorMaterial, int renderIndex)
	{
		super(armorMaterial, renderIndex, EntityEquipmentSlot.HEAD);
		setUnlocalizedName(Reference.MetropolisItems.REFINEDRUBYHELMET.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.REFINEDRUBYHELMET.getRegistryName());
		setCreativeTab(Metropolis.tabMCombat);
	}

}