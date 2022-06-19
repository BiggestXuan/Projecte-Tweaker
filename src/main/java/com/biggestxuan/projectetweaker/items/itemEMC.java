package com.biggestxuan.projectetweaker.items;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import moze_intel.projecte.api.ProjectEAPI;
import net.minecraft.item.ItemStack;
import org.openzen.zencode.java.ZenCodeType;

import static com.biggestxuan.projectetweaker.functions.item.setEMC;

@ZenRegister
@ZenCodeType.Name("mods.projectetweaker.ItemEMC")
public class itemEMC {
    @ZenCodeType.Method
    public static long getEMC(ItemStack i){
        long emc;
        emc = ProjectEAPI.getEMCProxy().getSellValue(i);
        return emc;
    }
    @ZenCodeType.Method
    public static boolean hasEMC(ItemStack i){
        return ProjectEAPI.getEMCProxy().hasValue(i);
    }
    @ZenCodeType.Method
    public static void setItemEMC(ItemStack i,long emc) {
        setEMC(i,emc);
    }
}
