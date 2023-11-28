// Demo program for inheritance,
// Here we will observe the concept of super/base/parent class and subclass/child class
// The child class can access the members of its super class
// There can be any number of child classes for a given super class
// "extends" keyword is used for inheriting purpose
// child class is also known as inheriting class
// super class is also known as inheritee class
// JAVA multilevel inheritance rather that multiple inheritance (C/C++ support both type of inheritance)
// Multilevel refers that a class extends from 01 super class at time
// Whereas multiple refers that a class extends from more that 01 super classes at a time.
// parent class can't access any member of child, while child class can access any member
// of parent class until/unless declared private

class BOX1 {

	double width, height, depth;

	BOX1(double w, double h, double d) {
		
		width=w;
		height=h;
		depth=d;
	}

	BOX1() {
		width=1;
		depth=1;
		height=1;
	}

	BOX1(double length) {
		width=depth=height=length;
	}

	double volume() {
		
		return width*height*depth;
	}
}

class BOX2 extends BOX1 {
	
	double weight;
	
	BOX2(double w, double h, double d, double m) {
		
		super(w,h,d); // it must be the 1st statement, it is used to call 					// constructor of parent class also avoids code duplication
		weight=m;
	}

	BOX2() {
		super();
	}
}


class Demo10 {

	public static void main(String arg[]) {

		double vol;
		BOX2 bx2 =  new BOX2(10,20,30,40);

		BOX2 bx3 = new BOX2();

		vol=bx2.volume();

		System.out.println("The volume = " + vol);
		System.out.println("Weight value = " + bx2.weight);	

		vol=bx3.volume();

		System.out.println("The volume = " + vol);

	}
}






