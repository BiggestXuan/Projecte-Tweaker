package com.biggestxuan.projectetweaker.functions;

import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import moze_intel.projecte.integration.crafttweaker.actions.CustomEMCAction;
import moze_intel.projecte.api.nss.NSSItem;
import moze_intel.projecte.api.nss.NormalizedSimpleStack;
import net.minecraft.item.ItemStack;

public class item {
    public static NormalizedSimpleStack getNSStack(ItemStack i){
        return NSSItem.createItem(i);
    }
    public static void setEMC(ItemStack i,long emc){
        long EMC = Math.max(emc,0);
        NormalizedSimpleStack nss = getNSStack(i);
        CraftTweakerAPI.apply(new CustomEMCAction(nss,EMC));
    }
}
