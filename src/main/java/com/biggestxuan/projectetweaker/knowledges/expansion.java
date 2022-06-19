package com.biggestxuan.projectetweaker.knowledges;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import org.openzen.zencode.java.ZenCodeType;

import static com.biggestxuan.projectetweaker.functions.emc.getPlayerEMC;
import static com.biggestxuan.projectetweaker.functions.knowledge.*;

@ZenCodeType.Expansion("crafttweaker.api.player.MCPlayerEntity")
@ZenRegister
public class expansion {
    @ZenCodeType.Method
    public static void addEMC(PlayerEntity p ,long emc){
        addPlayerEMC(p,emc);
    }
    @ZenCodeType.Method
    public static void lossEMC(PlayerEntity p,long emc){
        lossPlayerEMC(p,emc);
    }
    @ZenCodeType.Method
    public static long getEMC(PlayerEntity p){
        return getPlayerEMC(p);
    }
    @ZenCodeType.Method
    public static void setEMC(PlayerEntity p,long emc){
        setPlayerEMC(p,emc);
    }
    @ZenCodeType.Method
    public static boolean hasKnowledge(PlayerEntity p , ItemStack i){
        return checkPlayerKnowledge(p,i);
    }
    @ZenCodeType.Method
    public static boolean hasAllKnowledge(PlayerEntity p){
        return checkPlayerHasAllKnowledge(p);
    }
    @ZenCodeType.Method
    public static void addKnowledge(PlayerEntity p ,ItemStack i){
        addPlayerKnowledge(p,i);
    }
    @ZenCodeType.Method
    public static void removeKnowledge(PlayerEntity p,ItemStack i){
        removePlayerKnowledge(p,i);
    }
    @ZenCodeType.Method
    public static void knowledge(PlayerEntity p){
        getPlayerAllKnowledge(p);
    }
}
