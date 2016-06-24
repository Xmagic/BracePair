
public class BracePair {
	static int pair = 3;

	public BracePair() {
		char[] array = new char[2 * pair];
		print_pare(0, 0, array, 0);
	}

	void print_pare(int l, int r, char str[], int cnt) {
		if (cnt >= 2 * pair) {
			for (int i = 0; i < cnt; i++) {
				System.out.print(str[i]);
			}
			System.out.println(", ");
			return;
		}
		if (l < pair) {
			str[cnt] = '(';
			print_pare(l + 1, r, str, cnt + 1);
		}
		if (r < l) {
			str[cnt] = ')';
			print_pare(l, r + 1, str, cnt + 1);
		}
	}

	public static void main(String[] args) {
		new BracePair();
	}
}