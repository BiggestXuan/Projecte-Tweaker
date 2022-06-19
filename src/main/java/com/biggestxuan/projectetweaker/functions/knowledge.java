package com.biggestxuan.projectetweaker.functions;

import com.blamejared.crafttweaker.api.CraftTweakerGlobals;
import moze_intel.projecte.api.ItemInfo;
import moze_intel.projecte.api.capabilities.IKnowledgeProvider;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

import java.math.BigInteger;
import java.util.Set;

import static com.biggestxuan.projectetweaker.functions.player.*;

public class knowledge {
    public static void addPlayerEMC(PlayerEntity p,long add){
        IKnowledgeProvider ikp = getPlayerIKP(p);
        long emc = Long.parseLong(ikp.getEmc().toString());
        ikp.setEmc(BigInteger.valueOf(emc+add));
        flushPlayerEMC(p);
    }
    public static void lossPlayerEMC(PlayerEntity p ,long loss){
        long nowEMC = emc.getPlayerEMC(p);
        long EMC = Math.max(0,nowEMC-loss);
        BigInteger r = BigInteger.valueOf(EMC);
        getPlayerIKP(p).setEmc(r);
        flushPlayerEMC(p);
    }
    public static void setPlayerEMC(PlayerEntity p,long emc){
        BigInteger EMC = BigInteger.valueOf(emc);
        getPlayerIKP(p).setEmc(EMC);
        flushPlayerEMC(p);
    }
    public static boolean checkPlayerKnowledge(PlayerEntity p, ItemStack i){
        return getPlayerIKP(p).hasKnowledge(i);
    }
    public static boolean checkPlayerHasAllKnowledge(PlayerEntity p){
        return getPlayerIKP(p).hasFullKnowledge();
    }
    public static void addPlayerKnowledge(PlayerEntity p,ItemStack i){
        getPlayerIKP(p).addKnowledge(i);
        flushPlayer(p);
    }
    public static void removePlayerKnowledge(PlayerEntity p,ItemStack i){
        getPlayerIKP(p).removeKnowledge(i);
        flushPlayer(p);
    }
    public static void getPlayerAllKnowledge(PlayerEntity p){
        String out = "\n";
        IKnowledgeProvider ikp = getPlayerIKP(p);
        Set<ItemInfo> list = ikp.getKnowledge();
        for(ItemInfo i:list){
            String n = i.toString();
            out = out.concat(n+"\n");
        }
        CraftTweakerGlobals.println(out);
    }
}
