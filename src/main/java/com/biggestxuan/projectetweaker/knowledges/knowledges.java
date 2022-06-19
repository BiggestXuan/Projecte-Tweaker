package com.biggestxuan.projectetweaker.knowledges;

import com.biggestxuan.projectetweaker.functions.emc;
import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import org.openzen.zencode.java.ZenCodeType;

import static com.biggestxuan.projectetweaker.functions.knowledge.*;
import static com.biggestxuan.projectetweaker.functions.player.*;

@ZenRegister
@ZenCodeType.Name("mods.projectetweaker.Knowledges")
public class knowledges {
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
