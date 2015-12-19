package com.InfinityRaider.AgriCraft.items;

import com.InfinityRaider.AgriCraft.api.v1.IClipper;
import com.InfinityRaider.AgriCraft.reference.Names;
import com.InfinityRaider.AgriCraft.renderers.items.RenderItemBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class ItemClipper extends ItemAgricraft implements IClipper {
    public ItemClipper() {
        super();
        this.setMaxStackSize(1);
    }

    @Override
    protected String getInternalName() {
        return Names.Objects.clipper;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public RenderItemBase getItemRenderer() {
        return null;
    }

    @Override
    public boolean canItemEditBlocks() {return true;}

    //this is called when you right click with this item in hand
    @Override
    public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ) {
        return false;   //return false or else no other use methods will be called (for instance "onBlockActivated" on the crops block)
    }

    @Override
    public void onClipperUsed(World world, BlockPos pos, EntityPlayer player) {}

    @SideOnly(Side.CLIENT)
    @SuppressWarnings("unchecked")
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean flag) {
        if (stack == null || stack.getItem() == null) {
            list.add("ERROR");
            return;
        }
        if (stack.getItem() instanceof ItemClipping) {
            stack = ItemStack.loadItemStackFromNBT(stack.getTagCompound());
        }
        if (stack == null || stack.getItem() == null) {
            list.add("ERROR");
        }
    }
}
