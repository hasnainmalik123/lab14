import java.util.ArrayList;
import java.util.Stack;

interface Banking_System {
	public void print();
}

class bill_payment implements Banking_System {
	public void print() {
		ArrayList<String> customers = new ArrayList<String>();
		customers.add("Rameez");
		customers.add("Raees");
		customers.add("Ali");
		System.out.println("\nCustomer List for payment");
		System.out.println(customers);
		System.out.println("\nPending customers");
		customers.remove(2);
		customers.remove(0);
		System.out.println(customers);
	}
}

abstract class loan implements Banking_System {
	public void stack_push(Stack<Integer> S) {
		for (int i = 1; i <= 5; i++) {
			S.push(i);
		}
	}

	public void stack_pop(Stack<Integer> S) {
		System.out.println("Customer list a/c to least limit extention");
		int j = 1;
	}
}