package org.comstudy21.ch05;

class Aa {
	void signal() {
		System.out.println("Aa�� �ñ׳�");
	}
}

class Ab extends Aa {
	void signal() {
		System.out.println("Ab�� �ñ׳�");
	}
}

class Ac extends Aa {
	void signal() {
		System.out.println("Ac�� �ñ׳�");
	}
}

public class UpcastingEx {
	public static void main(String[] args) {
		Aa[] arr = { new Ab(), new Ac(), new Ac(), new Ab() };

		for (int i = 0; i < arr.length; i++) {
			arr[i].signal();
		}

	}
}
