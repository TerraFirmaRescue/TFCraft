package com.bioxx.tfc.ModSupport;

import net.minecraft.world.World;

@Deprecated
public interface IWeather2 {
	public boolean  isRainingOnCoord(World worldObj, int xCoord, int yCoord, int zCoord);
}
