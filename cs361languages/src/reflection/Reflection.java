/**
 * 
 */
package reflection;

/**
 * @author Austin Parris-Powlette
 *
 */

// Reflection: https://docs.oracle.com/javase/tutorial/reflect/class/

// Demonstration of Reflection

// Given an object o, we want to know what class corresponds to o, the inheritance chain for o
// and the list of methods of the class

// Complete the code

import circle.ColoredCircle;

import java.lang.reflect.Method;

public class Reflection {

	/**
	 * Print the class corresponding to the object
	 * @param o the object
	 */
	public void correspondingClass(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passed is null");


		System.out.println("Inspecting class: " + o.getClass().getName());
	}

	/**
	 * Print the chain of super classes of the object 
	 * Format of the output:
	 * Inheritance chain:
	 * Cn inherits from Cn-1 inherits ... inherits from java.lang.Object
	 * @param o the object
	 */
	public void inheritanceChain(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passed is null");

		// TODO To complete
		// You need to use the EXACT format of the output
		// Hint: Use the method getSuperClass()
		System.out.print(o.getClass().getName() + " inherits ");
		if (!o.getClass().getSuperclass().getName().equals("java.lang.Object")) {
			System.out.print(o.getClass().getSuperclass().getName() + " inherits ");
		}
		if (o.getClass().getSuperclass().getSuperclass() != null && !o.getClass().getSuperclass().getSuperclass().getName().equals("java.lang.Object")) {
			System.out.print(o.getClass().getSuperclass().getSuperclass().getName() + " inherits ");
		}
		System.out.println("from java.lang.Object");

		System.out.println("\n");




	}
	
	/**
	 * Print the list of methods of the object
	 * @param o an object
	 */
	public void listMethods(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passed is null");

		Method[] m = o.getClass().getMethods();

		// List of methods
		// TODO To complete
		// Print each method on one line
		// Use this EXACT format
		for (Method method : m) {
			System.out.println(method.getName());
		}
		System.out.println("\n");
	}

	/**
	 * Constructor
	 */
	public Reflection() {
	}

	/**
	 * Demonstration
	 * @param args
	 */
	public static void main(String[] args) {

		Reflection r = new Reflection();		
		
		// Demonstration of the methods on an object of type String
		// TODO To complete
		String string = "Pie";
		r.correspondingClass(string);
		r.inheritanceChain(string);
		//r.listMethods(string);
		
		// Demonstration of the methods on an object of type ColoredCircle
		// TODO To complete
		ColoredCircle circle = new ColoredCircle();
		r.correspondingClass(circle);
		r.inheritanceChain(circle);
		//r.listMethods(circle);
	}

}
