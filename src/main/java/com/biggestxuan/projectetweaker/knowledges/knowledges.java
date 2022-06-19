package com.biggestxuan.projectetweaker.knowledges;

import com.biggestxuan.projectetweaker.functions.emc;
import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import org.openzen.zencode.java.ZenCodeType;

import static com.biggestxuan.projectetweaker.functions.knowledge.*;
import static com.biggestxuan.projectetweaker.functions.player.*;

@ZenRegister
@ZenCodeType.Name("mods.projectetw.Knowledges")
public class knowledges {
    @ZenCodeType.Method
    public static void addEMC(PlayerEntity p ,long add){
        long added = Math.max(add,0);
        addPlayerEMC(p,added);
    }
    @ZenCodeType.Method
    public static void lossEMC(PlayerEntity p ,long loss){
        long lossed = Math.max(loss,0);
        lossPlayerEMC(p,lossed);
    }
    @ZenCodeType.Method
    public static boolean isKnowledge(PlayerEntity p, ItemStack i){
        return checkPlayerKnowledge(p,i);
    }
    @ZenCodeType.Method
    public static void clearAllKnowledge(PlayerEntity p){
        getPlayerIKP(p).clearKnowledge();
        flushPlayer(p);
    }
    @ZenCodeType.Method
    public static long getEMC(PlayerEntity p){
        return emc.getPlayerEMC(p);
    }
    @ZenCodeType.Method
    public static void setEMC(PlayerEntity p,long emc){
        long EMC = Math.max(emc,0);
        setPlayerEMC(p,EMC);
    }
    @ZenCodeType.Method
    public static boolean checkAllKnowledge(PlayerEntity p){
        return checkPlayerHasAllKnowledge(p);
    }
    @ZenCodeType.Method
    public static void addKnowledge(PlayerEntity p, ItemStack i){
        addPlayerKnowledge(p,i);
    }
    @ZenCodeType.Method
    public static void removeKnowledge(PlayerEntity p,ItemStack i){
        removePlayerKnowledge(p,i);
    }
    @ZenCodeType.Method
    public static void getAllKnowledge(PlayerEntity p){
        getPlayerAllKnowledge(p);
    }
    @ZenCodeType.Method
    public static void setAllKnowledge(PlayerEntity p){
        getPlayerIKP(p).setFullKnowledge(true);
        flushPlayer(p);
    }
}
