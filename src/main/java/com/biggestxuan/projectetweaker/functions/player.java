package com.biggestxuan.projectetweaker.functions;

import moze_intel.projecte.api.ProjectEAPI;
import moze_intel.projecte.api.capabilities.IKnowledgeProvider;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;

import java.util.UUID;

public class player {
    public static UUID getPlayerUUID(PlayerEntity p){
        return p.getUUID();
    }
    public static IKnowledgeProvider getPlayerIKP(PlayerEntity p){
        return ProjectEAPI.getTransmutationProxy().getKnowledgeProviderFor(getPlayerUUID(p));
    }
    public static void flushPlayerEMC(PlayerEntity p){
        if(p instanceof ServerPlayerEntity){
            getPlayerIKP(p).syncEmc((ServerPlayerEntity) p);
        }
    }
    public static void flushPlayerKnowledge(PlayerEntity p){
        if(p instanceof ServerPlayerEntity){
            getPlayerIKP(p).sync((ServerPlayerEntity) p);
        }
    }
    public static void flushPlayer(PlayerEntity p){
        flushPlayerEMC(p);
        flushPlayerKnowledge(p);
    }
}
