package items;

//Local Imports
import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

//Minecraft Imports
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemRefinedRubyChestplate extends ItemArmor {

	public ItemRefinedRubyChestplate(ArmorMaterial armorMaterial, int renderIndex)
	{
		super(armorMaterial, renderIndex, EntityEquipmentSlot.CHEST);
		setUnlocalizedName(Reference.MetropolisItems.REFINEDRUBYCHESTPLATE.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.REFINEDRUBYCHESTPLATE.getRegistryName());
		setCreativeTab(Metropolis.tabMCombat);
	}
}