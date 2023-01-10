package com.rivalrebels.common.packet;

import com.rivalrebels.ModInfo;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class PacketDispatcher {
    public static final SimpleNetworkWrapper wrapper = NetworkRegistry.INSTANCE.newSimpleChannel(ModInfo.modid);

    public static void registerPackets(){
        int packetCount = 0;
        wrapper.registerMessage(TextPacket.Handler.class, TextPacket.class, packetCount++, Side.CLIENT);
        wrapper.registerMessage(EntityDebrisPacket.Handler.class, EntityDebrisPacket.class, packetCount++, Side.CLIENT);
        wrapper.registerMessage(ItemUpdate.Handler.class, ItemUpdate.class, packetCount++, Side.SERVER);
    }
}
