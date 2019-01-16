package com.practice.interview;

import java.io.IOException;

public class LaunchingNotepad {

	public static void main(String[] args) {
		Runtime runtime= Runtime.getRuntime();
		try
		{
			runtime.exec("Notepad.exe");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
