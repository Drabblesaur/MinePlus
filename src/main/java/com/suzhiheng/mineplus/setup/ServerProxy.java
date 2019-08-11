package com.suzhiheng.mineplus.setup;

import net.minecraft.world.World;

public class ServerProxy implements IProxy{
    @Override
    public void init() {
        //used for server-side initialization
    }

    @Override
    public World getClientWorld() {
        throw new IllegalStateException("Only run on Client!");
    }
}
