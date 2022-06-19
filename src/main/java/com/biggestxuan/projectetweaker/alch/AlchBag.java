package com.biggestxuan.projectetweaker.alch;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import org.openzen.zencode.java.ZenCodeType;


import static com.biggestxuan.projectetweaker.functions.alchbag.getItemInAlchBag;

@ZenRegister
@ZenCodeType.Name("mods.projectetweaker.alchbag")
public class AlchBag {
    @ZenCodeType.Method
    public static ItemStack getItemForAlchBag(PlayerEntity p,String c,int s){
        return getItemInAlchBag(p,c,s);
    }
}
