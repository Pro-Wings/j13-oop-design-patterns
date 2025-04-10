package com.prowings.patterns.creational.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

	private static final long serialVersionUID = -7604766932017737115L;

	private static SerializedSingleton instance;

	private SerializedSingleton() {
	}

    public static SerializedSingleton getInstance() {
        if (instance == null) {
            instance = new SerializedSingleton();
        }
        return instance;
    }

    
    // Implement readResolve method to preserve singleton property
	protected Object readResolve() {
		return getInstance();
	}
}
