package com.prowings.patterns.creational.factory;

public class TestComputerFactory {
	
	public static void main(String[] args) {
		
		Computer laptop = ComputerFactory.getComputer("Laptop", "aaa", "bbb", "intel");
		
		System.out.println(laptop);
		
		Computer desktop = ComputerFactory.getComputer("PC", "ccc", "ddd", "amd");
		System.out.println(desktop);
		
		Computer server = ComputerFactory.getComputer("Server", "eee", "fff", "arm");
		System.out.println(server);
	}

}
