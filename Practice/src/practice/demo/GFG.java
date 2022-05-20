package practice.demo;

class GFG {

	static int MAX = 100;
	static int sequence[] = new int[MAX];

	static void vanEckSequence() {
		for (int i = 0; i < MAX - 1; i++) {
			sequence[i] = 0;
		}

		for (int i = 0; i < MAX - 1; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (sequence[j] == sequence[i]) {
					sequence[i + 1] = i - j;
					break;
				}
			}
		}
		for (int i = 0; i < MAX - 1; i++) {
			System.out.print(" "+ sequence[i]);
		}
	}

	static int getNthTerm(int n) {

		return sequence[n];
	}

	public static void main(String[] args) {

		vanEckSequence();

		int n = 6;

		System.out.println(getNthTerm(n));

		n = 99;

		System.out.println(getNthTerm(n));
	}
}
