package com.vic.command;
/*Representa la orden que se pretende ejecutar de manera desacoplada*/
//public interface ICommand {
@FunctionalInterface
//IOperacion
public interface ICommand {	
	public void execute();
}
