package com.biggestxuan.projectetweaker.knowledges;

import com.biggestxuan.projectetweaker.functions.emc;
import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import net.minecraft.entity.player.PlayerEntity;
import org.openzen.zencode.java.ZenCodeType;

import static com.biggestxuan.projectetweaker.functions.knowledge.*;

@ZenRegister
@ZenCodeType.Name("mods.projectetweaker.EMC")
public class playerEMC {
    @ZenCodeType.Method
    public static void addEMC(PlayerEntity p , long add){
        long added = Math.max(add,0);
        addPlayerEMC(p,added);
    }
    @ZenCodeType.Method
    public static void lossEMC(PlayerEntity p ,long loss){
        long lossed = Math.max(loss,0);
        lossPlayerEMC(p,lossed);
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
}
