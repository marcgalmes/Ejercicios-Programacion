package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;
import java.util.Iterator;

public class PoolConductores {

	private ArrayList<Conductor> poolConductores = null;

	public PoolConductores(ArrayList<Conductor> poolConductores) {
		this.poolConductores  = poolConductores;
	}

	public Conductor getConductor() {
		Conductor asignarConductor = null;
		for (Iterator iterator = poolConductores.iterator(); iterator.hasNext();) {
			Conductor conductor = (Conductor) iterator.next();
			if (conductor.isOcupado()) {
				return conductor;
			} 
		}
		return asignarConductor;
	}

}
