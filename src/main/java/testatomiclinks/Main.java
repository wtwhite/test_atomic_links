package testatomiclinks;

import java.nio.file.*;
import java.io.File;

public class Main {
	public static void main(String[] args) throws Exception {
		System.out.println("Hello, world!");
		Files.createLink(new File("a_hardlink").toPath(), new File("a").toPath());
	}
}
