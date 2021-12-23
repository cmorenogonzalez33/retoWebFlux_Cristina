package com.example.retoWebFlux.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.retoWebFlux.model.Person;

import reactor.core.publisher.Flux;

@RestController
public class Control { 
	 
 	private ArrayList<Person> lista = new ArrayList<Person>();
 	
 	public Control() {
 		lista.add(new Person("Nombre1", "Apellido1", 20));
		lista.add(new Person("Nombre2", "Apellido2", 30));
		lista.add(new Person("Nombre3", "Apellido3", 40));
 	}
 	
 	@GetMapping(path = "/login", produces = "text/event-stream")
	public Flux<Person> login() {  		
 		return Flux.fromIterable(lista);
	} 
 	
 	@GetMapping(path="/insert")
	public Flux<Person> login(@RequestParam(value = "name") String firstName, @RequestParam(value= "apellido") String lastName, @RequestParam(value= "edad") Integer age) {
 		lista.add(new Person(firstName, lastName, age));
 		
		return Flux.fromIterable(lista);
	}
 	
 	/*@DeleteMapping(path="/elimina")
 	public Flux<Person> borra(@RequestParam(value = "name") String firstName, @RequestParam(value= "apellido") String lastName, @RequestParam(value= "edad") Integer age) {
 		Person p = new Person(firstName, lastName, age);
 		for (Person otra : lista) {
 			if(otra.equals(p)) {
 				lista.remove(p);
 				break;
 			}
 		}
 		
		return Flux.fromIterable(lista);
	}*/
}
