package com.aurionpro.guitarFinal.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory {
	private List<Guitar> guitarList = new ArrayList<>();

	public void addGuitar(String serialNumber, double price, Builder builder, Type type, Wood topWood, Wood backWood,
			int numString) throws IOException {
		GuitarSpec specs = new GuitarSpec(builder, type,  topWood, backWood,numString);
		Guitar guitar = new Guitar(serialNumber, price, specs);
		guitarList.add(guitar);

		try (FileWriter writer = new FileWriter("guitars.txt", true)) {
			String line = String.join(",", serialNumber, String.valueOf(price), builder.toString(), type.toString(),
					 topWood.toString(), backWood.toString(),String.valueOf(numString));
			writer.write(line + "\n");
		}
	}

	public void loadFromFile() {
		guitarList.clear();
		File file = new File("guitars.txt");
		if (!file.exists()) {
			return;
		}
		try (Scanner sc = new Scanner(file)) {
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] parts = line.split(",");
				if (parts.length != 7) {
					System.out.println("Invalid line in file: " + line);
					continue;
				}
				try {
					Guitar g = new Guitar(parts[0].trim(), Double.parseDouble(parts[1].trim()),
							new GuitarSpec(Builder.valueOf(parts[2].trim().toUpperCase()),
									Type.valueOf(parts[3].trim().toUpperCase()),
									Wood.valueOf(parts[4].trim().toUpperCase()),
									Wood.valueOf(parts[5].trim().toUpperCase()), Integer.parseInt(parts[6].trim())));
					guitarList.add(g);
				} catch (Exception e) {
					System.out.println("Skipping invalid line: " + line);
				}
			}
		} catch (IOException e) {
			System.out.println("Error reading inventory file: " + e.getMessage());
		}
	}

	public void printInventory() {
		if (guitarList.isEmpty()) {
			System.out.println("Inventory is empty.");
			return;
		}
		System.out.println("\nCurrent Inventory:\n------------------");
		for (Guitar g : guitarList) {
			GuitarSpec s = g.getSpecs();
			System.out.printf(
					"Serial: %s | Builder: %s | Type: %s | TopWood: %s | BackWood: %s | Strings: %d | Price: $%.2f%n",
					g.getSerialNumber(), s.getBuilder(), s.getType(), s.getTopWood(), s.getBackWood(), s.getNumString(),
					g.getPrice());
		}
	}

	public List<Guitar> searchFromFile(GuitarSpec searchSpec) {
		loadFromFile();
		List<Guitar> matches = new ArrayList<>();
		for (Guitar g : guitarList) {
			if (g.getSpecs().matches(searchSpec)) {
				matches.add(g);
			}
		}
		return matches;
	}
}
