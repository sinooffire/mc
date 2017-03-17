package com.FlynnJacobRiley.Metropolis.handlers;

import net.minecraft.util.IStringSerializable;

public class EnumHandler {

	public static enum YellowEdge implements IStringSerializable {
		BASIC("basic", 0),
		ADVANCED("advanced", 0);

		private int ID;
		private String name;
		
		private YellowEdge(String name, int ID) {
		
			this.ID = ID;
			this.name= name;
		}
		
		@Override
		public String getName() {
			return this.name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String toString() {
			return getName();
		}
		
	}
}
