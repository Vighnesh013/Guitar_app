package com.aurionpro.guitarFinal.test;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.guitarFinal.model.Builder;
import com.aurionpro.guitarFinal.model.Guitar;
import com.aurionpro.guitarFinal.model.GuitarSpec;
import com.aurionpro.guitarFinal.model.Inventory;
import com.aurionpro.guitarFinal.model.Type;
import com.aurionpro.guitarFinal.model.Wood;

public class GuitarSpecTest {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		Inventory inventory = new Inventory();
		while (true) {
			System.out.println("\nEnter which Operation:");
			System.out.println("1 : Add Guitar \n2 : Serach Guitar with specification \n3 : Show Inventory \n4 : exit");
			int choice = scanner.nextInt();
			scanner.nextLine();
			if (choice == 1) {
				System.out.println("Enter serial number : ");
				String serial = scanner.nextLine();
				System.out.println("Enter price : ");
				int price = scanner.nextInt();
				System.out.println("Enter Builder : ");
				System.out.println(
						"1 : FENDER \n2 :  MARTIN \n3 : GIBSON \n4 :  COLLINGS \n5 :  OLSON \n6 :  RYAN \n7 :  PRS \n8 :  ANY");
				int builder = scanner.nextInt();
				scanner.nextLine();
				Builder builder1 = Builder.fromInt(builder);
				System.out.println("Enter Type:");
				System.out.println("1 : Acoustic \n2 : Electric");
				int type = scanner.nextInt();
				Type typeEnum = Type.fromInt(type);
				System.out.println("Enter top wood : ");
				System.out.println(
						"1 : INDIAN_ROSEWOOD \n2 :  BRAZILIAN_ROSEWOOD \n3 : MAHAGONY \n4 :  MAPLE \n5 :  COCOBOLO \n6 :  CEDAR \n7 :  ADRINONDACK \n8 :  ALDER \n9 : SITKA");
				int topWood = scanner.nextInt();
				Wood top = Wood.fromInt(topWood);
				System.out.println("Enter back wood : ");
				System.out.println(
						"1 : INDIAN_ROSEWOOD \n2 :  BRAZILIAN_ROSEWOOD \n3 : MAHAGONY \n4 :  MAPLE \n5 :  COCOBOLO \n6 :  CEDAR \n7 :  ADRINONDACK \n8 :  ALDER \n9 : SITKA");
				int backWood = scanner.nextInt();
				Wood back = Wood.fromInt(backWood);
				System.out.println("Enter number of strings : ");
				int string = scanner.nextInt();
				inventory.addGuitar(serial, price, builder1, typeEnum, top, back, string);
				System.out.println("\nGuitar added Successfully!");

			}
			if (choice == 3) {
				inventory.loadFromFile();
				inventory.printInventory();
			}

			if (choice == 4) {
				System.out.println("-----------------------Thank you---------------------");
				System.exit(0);
			}
			if (choice == 2) {
				Builder builderEnum = null;
				Type typeEnum = null;
				Wood top = null;
				Wood back = null;
				int numStrings = 0;

				while (true) {
					try {
						System.out.println("Search by Builder? (1 for yes and 0 for no)");
						int flag = scanner.nextInt();
						if (flag == 1) {
							System.out.println(
									"1 : FENDER \n2 : MARTIN \n3 : GIBSON \n4 : COLLINGS \n5 : OLSON \n6 : RYAN \n7 : PRS \n8 : ANY");
							int builder = scanner.nextInt();
							builderEnum = Builder.fromInt(builder);
							scanner.nextLine();
							break;
						} else if (flag == 0) {
							scanner.nextLine();
							break;
						} else {
							System.out.println("Enter only 0 or 1");
						}
					} catch (InputMismatchException e) {
						System.out.println("Invalid input!");
						scanner.nextLine();
					}
				}

				while (true) {
					try {
						System.out.println("Search by Type? (1 for yes and 0 for no)");
						int flag = scanner.nextInt();
						if (flag == 1) {
							System.out.println("1 : Acoustic \n2 : Electric");
							int type = scanner.nextInt();
							typeEnum = Type.fromInt(type);
							scanner.nextLine();
							break;
						} else if (flag == 0) {
							scanner.nextLine();
							break;
						} else {
							System.out.println("Enter only 0 or 1");
						}
					} catch (InputMismatchException e) {
						System.out.println("Invalid input!");
						scanner.nextLine();
					}
				}

				while (true) {
					try {
						System.out.println("Search by Top Wood? (1 for yes and 0 for no)");
						int flag = scanner.nextInt();
						if (flag == 1) {
							System.out.println(
									"1 : INDIAN_ROSEWOOD \n2 : BRAZILIAN_ROSEWOOD \n3 : MAHAGONY \n4 : MAPLE \n5 : COCOBOLO \n6 : CEDAR \n7 : ADRINONDACK \n8 : ALDER \n9 : SITKA");
							int topWood = scanner.nextInt();
							top = Wood.fromInt(topWood);
							scanner.nextLine();
							break;
						} else if (flag == 0) {
							scanner.nextLine();
							break;
						} else {
							System.out.println("Enter only 0 or 1");
						}
					} catch (InputMismatchException e) {
						System.out.println("Invalid input!");
						scanner.nextLine();
					}
				}

				while (true) {
					try {
						System.out.println("Search by Back Wood? (1 for yes and 0 for no)");
						int flag = scanner.nextInt();
						if (flag == 1) {
							System.out.println(
									"1 : INDIAN_ROSEWOOD \n2 : BRAZILIAN_ROSEWOOD \n3 : MAHAGONY \n4 : MAPLE \n5 : COCOBOLO \n6 : CEDAR \n7 : ADRINONDACK \n8 : ALDER \n9 : SITKA");
							int backWood = scanner.nextInt();
							back = Wood.fromInt(backWood);
							scanner.nextLine();
							break;
						} else if (flag == 0) {
							scanner.nextLine();
							break;
						} else {
							System.out.println("Enter only 0 or 1");
						}
					} catch (InputMismatchException e) {
						System.out.println("Invalid input!");
						scanner.nextLine();
					}
				}

				while (true) {
					try {
						System.out.println("Search by Number of Strings? (1 for yes and 0 for no)");
						int flag = scanner.nextInt();
						if (flag == 1) {
							System.out.println("Enter number of strings:");
							numStrings = scanner.nextInt();
							scanner.nextLine();
							break;
						} else if (flag == 0) {
							scanner.nextLine();
							break;
						} else {
							System.out.println("Enter only 0 or 1");
						}
					} catch (InputMismatchException e) {
						System.out.println("Invalid input!");
						scanner.nextLine();
					}
				}

				GuitarSpec searchSpec = new GuitarSpec(builderEnum, typeEnum, top, back, numStrings);
				List<Guitar> foundGuitars = inventory.searchFromFile(searchSpec);

				if (!foundGuitars.isEmpty()) {
					System.out.println("\nMatching guitars found:\n");
					for (Guitar guitar : foundGuitars) {
						GuitarSpec spec = guitar.getSpecs();
						System.out.println("Serial number  : " + guitar.getSerialNumber());
						System.out.println("Builder        : " + spec.getBuilder());
						System.out.println("Type           : " + spec.getType());
						System.out.println("Top Wood       : " + spec.getTopWood());
						System.out.println("Back Wood      : " + spec.getBackWood());
						System.out.println("No. of strings : " + spec.getNumString());
						System.out.println("Price          : $" + guitar.getPrice());
						System.out.println("---------------------------");
					}
				} else {
					System.out.println("No guitars match the specified criteria.");
				}
			}

		}

	}

}
