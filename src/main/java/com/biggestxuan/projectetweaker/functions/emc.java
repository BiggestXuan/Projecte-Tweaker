package com.biggestxuan.projectetweaker.functions;

import moze_intel.projecte.api.capabilities.IKnowledgeProvider;
import net.minecraft.entity.player.PlayerEntity;

import java.math.BigInteger;

import static com.biggestxuan.projectetweaker.functions.player.getPlayerIKP;

public class emc {
    public static long getPlayerEMC(PlayerEntity p){
        IKnowledgeProvider ikp = getPlayerIKP(p);
        BigInteger emc = ikp.getEmc();
        return Long.parseLong(emc.toString());
    }
}
