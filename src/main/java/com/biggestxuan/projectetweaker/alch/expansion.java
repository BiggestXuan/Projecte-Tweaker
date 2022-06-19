package com.biggestxuan.projectetweaker.alch;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import org.openzen.zencode.java.ZenCodeType;

import static com.biggestxuan.projectetweaker.functions.alchbag.getItemInAlchBag;

@ZenCodeType.Expansion("crafttweaker.api.player.MCPlayerEntity")
@ZenRegister
public class expansion {
    @ZenCodeType.Method
    public static ItemStack getItem(PlayerEntity p, String c, int s){
        return getItemInAlchBag(p,c,s);
    }
}
