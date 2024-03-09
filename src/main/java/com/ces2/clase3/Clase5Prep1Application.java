package com.ces2.clase3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ces2.clase3.model.BankAccount;
import com.ces2.clase3.model.Bike;
import com.ces2.clase3.model.Car;
import com.ces2.clase3.model.Vehicle;
import com.ces2.clase3.model.Yamaha;
import com.ces2.clase3.model.Ducati;
import com.ces2.clase3.model.Honda;
import com.ces2.clase3.model.Mazda;
import com.ces2.clase3.model.Nissan;
import com.ces2.clase3.model.Toyota;

@SpringBootApplication
public class Clase5Prep1Application {

	public static void main(String[] args) {
		SpringApplication.run(Clase5Prep1Application.class, args);	
	}

	@Bean
	CommandLineRunner init() {
		return args -> {
			
//			ArrayList<String> a1 = new ArrayList<>();
			
//			a1.add(12);
//			a1.add(true);
//			a1.add(3.5);
//			a1.add("Mazda");
//			a1.add(new Bike(""));
			
//			String myvar12 = a1.get(3);
//			
//			String[] a2 = new String[5];
//			a2[0] = "abc";
//			a2[1] = "def";
//			String myvar = a2[0];
			
			//a2[2] = 5;  //ERROR
			
			Integer[] money1 = {1000,2000,3000};
			Double[] money2 = {100.5,200.4,4000.8};
			String[] money3 = {"100.50","200.40","4000.80"};
			
//			BankAccount.depositemoney(money1);
//			BankAccount.depositemoney(money2);
			
//			BankAccount<Double> ba1 = new BankAccount("Banco America");
//			ba1.display();
//			ba1.depositemoney(money3);
			//ba1.depositemoney2(money1);
			
//			BankAccount<Number> ba1 = new BankAccount<>();
//			
//	
//			ba1.display(money1); // 100 200 300
//			ba1.display(money2); // ERROR: ba1 es solo para Integer
			
			
//			BankAccount<Integer> ba1 = new BankAccount<>();
//			Integer[] money1 = {100,200,300};
//			Double[] money2 = {20.2, 40.7, 50.9};
//			String[] money3 = {"20.2", "40.7", "50.9"};
//			ba1.depositar(Arrays.asList(money3)); // 100 200 300
			
			
			
//			Car[] carros = {new Car("Toyota"),new Car("Mazda"),new Car("Hunday"),new Car("Renault")};
//			
//			ba1.depositar(Arrays.asList(carros));
			
//			ba1.display(money2); // ERROR: ba1 es solo para Integer
			
			
			
			
			
//			List<String> s = Arrays.asList("1", "2", "3");
//			String r = sum(s, (s1, s2) -> String.valueOf(Double.parseDouble(s1) + Double.parseDouble(s2))); //"6.0"
//			Integer r1 = sum(Arrays.asList(1, 2, 3, 4), (a, b) -> a + b); //10
//			System.out.println(r);
//			System.out.println(r1);
//			
//			Double[] money2 = {100.5,200.4,4000.8};
//			Double rd = sum(Arrays.asList(money2), (a, b) -> a + b);
//			System.out.println(rd);
			
			List<Vehicle> vehicles = new ArrayList<>();
			
			addBike(vehicles,new Ducati("Ducati 01"));
			addBike(vehicles,new Yamaha("Yamaha 01"));
			addBike(vehicles,new Honda("Honda 01"));
			
			addCar(vehicles,new Mazda("Mazda 01")); //3
			addCar(vehicles,new Nissan("Nissan 01"));
			addCar(vehicles,new Toyota("Toyota 01"));
			
			print(vehicles);
				
			delete(vehicles,vehicles.get(3));
				
			print(vehicles);
			
			addAll(vehicles,new Ducati("Ducati 02"));
			addAll(vehicles,new Toyota("Toyota 02"));
			
			print(vehicles);

		};	
	}
	                          //List<Bike>
	public static void addBike(List<? super Bike> bikes, Bike bike) {
		bikes.add(bike);
		System.out.println("Adding: "+bike);
	}
	
	public static void addCar(List<? super Car> cars, Car car) {
		cars.add(car);
		System.out.println("Adding: "+cars);
	}
	
	public static void addAll(List<? super Vehicle> vehicles, Vehicle vehicle) {
		vehicles.add(vehicle);
		System.out.println("Adding: "+vehicles);
	}
	
	                       //List<Bike>
	public static void print(List<? extends Vehicle>  vehicles) {
		for(Vehicle v: vehicles) {
			System.out.println(v);
		}
	}
	
	public static void delete(List<? extends Vehicle> vehicles, Vehicle v1) {
		vehicles.remove(v1);
		System.out.println("Removing: "+v1);
	}
	
	public static <T> T sum(List<T> list, BinaryOperator<T> adder) {
	    return list.stream().reduce(adder).get();
	}
}
