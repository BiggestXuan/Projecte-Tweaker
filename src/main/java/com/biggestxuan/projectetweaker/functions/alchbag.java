package com.biggestxuan.projectetweaker.functions;

import moze_intel.projecte.api.ProjectEAPI;
import moze_intel.projecte.api.capabilities.IAlchBagProvider;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;

import java.util.Optional;

public class alchbag {
    public static ItemStack getItemInAlchBag(PlayerEntity p, String c, int s){
        int slot;
        if(s<0) slot = 0;
        else slot = Math.min(s, 103);
        String color = c.toUpperCase();
        Optional<IAlchBagProvider> iabp = p.getCapability(ProjectEAPI.ALCH_BAG_CAPABILITY).resolve();
        if(iabp.isPresent()){
            IAlchBagProvider IABP = iabp.get();
            IItemHandler itemHandler = IABP.getBag(DyeColor.valueOf(color));
            return itemHandler.getStackInSlot(slot);
        }
        return ItemStack.EMPTY;
    }
}
