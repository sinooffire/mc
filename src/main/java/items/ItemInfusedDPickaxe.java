package items;

//Local Mod Imports
import com.FlynnJacobRiley.Metropolis.Metropolis;
import com.FlynnJacobRiley.Metropolis.Reference;

//Minecraft Imports
import net.minecraft.item.ItemPickaxe;

public class ItemInfusedDPickaxe extends ItemPickaxe {

	public ItemInfusedDPickaxe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.MetropolisItems.INFUSEDDPICKAXE.getUnlocalizedName());
		setRegistryName(Reference.MetropolisItems.INFUSEDDPICKAXE.getRegistryName());
		setMaxStackSize(1);
		setCreativeTab(Metropolis.tabMTools);
	}
	
}
