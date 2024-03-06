package interfaces;

@FunctionalInterface
public interface MIInterfazFuncional<T,R> {

	static int num = 18;
	
	static int getNum() {
		return num;
	}
	
	default void saluda() {
		System.out.println("Soy un metodo default!!!");
	}
	
	R calcula(T t);

}
