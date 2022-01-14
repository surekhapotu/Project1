package com.lockedme.project;

public class LockedMeMain {
	
	public static void main(String[] args) {
			
			// Create "main" folder if not present in current folder structure
			FileOperations.createMainFolderIfNotPresent1("main");
			
			menuOptions.printWelcomeScreen("Locker","Surekha");
			
			HandleOption.handleWelcomeScreenInput();
		}
	}

