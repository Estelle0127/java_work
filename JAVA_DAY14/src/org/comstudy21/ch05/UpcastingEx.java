package org.comstudy21.ch05;

class Aa {
	void signal() {
		System.out.println("Aa의 시그널");
	}
}

class Ab extends Aa {
	void signal() {
		System.out.println("Ab의 시그널");
	}
}

class Ac extends Aa {
	void signal() {
		System.out.println("Ac의 시그널");
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
