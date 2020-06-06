package patterns.decorator;

import patterns.decorator.simple.CppDeveloper;
import patterns.decorator.simple.CppMiddleDeveloper;
import patterns.decorator.simple.CppTeamLeader;
import patterns.decorator.simple.IDeveloperCpp;
import patterns.decorator.with_class_decorator.IDeveloperJava;
import patterns.decorator.with_class_decorator.JavaDeveloper;
import patterns.decorator.with_class_decorator.JavaTeamLeader;
import patterns.decorator.with_class_decorator.MiddleJavaDeveloper;

public class App {
	public static void main(String[] args) {
		//В данном примере мы используем наследование от классе DevelopeDecorator.
		//Все классы имплементируют интерфейс Developer. А классы которые расширяют 
		//возможности базового класса наследуют класс DeveloperDecorator.
		IDeveloperJava dev = new JavaTeamLeader(new MiddleJavaDeveloper(new JavaDeveloper()));	
		System.out.println(dev.makeJob());
		
		
		//В этом примере мы не используем класс DevelopeDecorator. 
		IDeveloperCpp devCpp = new CppTeamLeader(new CppMiddleDeveloper(new CppDeveloper()));
		System.out.println(devCpp.makeJob());
		
	}
}
