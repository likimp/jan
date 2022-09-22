package polymorphism;

class Animal {
void noise()
{
	System.out.println("Some noise");
}
}
class cat extends Animal{
	void noise()
	{
		System.out.println("meow meow");
	}
}
class snake extends Animal{
	void noise()
	{
		System.out.println("buss buss");
	}
}
class dog extends Animal{
	void noise()
	{
		System.out.println("boww boww");
	}
}
class stimulate{
	static void ansim(Animal a1){
	a1.noise();
	}
}
class Aniimal{
	public static void main(String[] args) {
	cat c=new cat();
	snake s=new snake();
	dog d=new dog();
	stimulate.ansim(c);
	stimulate.ansim(s);
	stimulate.ansim(d);
	}
}

