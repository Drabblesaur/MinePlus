package com.suzhiheng.mineplus.setup;

import net.minecraft.client.Minecraft;
import net.minecraft.world.World;

public class ClientProxy implements IProxy {
    @Override
    public void init() {
        //used fro client-side initialization
    }

    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }
}
