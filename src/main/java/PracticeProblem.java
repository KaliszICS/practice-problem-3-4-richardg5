public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int[] recaman(int n) {
		int[] arr = new int[Math.max(0, n)];
		if (n > 0) {
			recamanHelper(n, arr);
		}
		return arr;
	}

	public static void recamanHelper(int n, int[] arr) {
		if (n == 1) {
			arr[n - 1] = 1;
			return;
		}

		recamanHelper(n - 1, arr);
		int termResult = arr[n - 2] - n;
		if (termResult < 0) {
			termResult = arr[n - 2] + n;
		} else {
			for (int i = 0; i < n; i++) {
				if (arr[i] == termResult) {
					termResult = arr[n - 2] + n;
					i = n;
				}
			}
		}
		arr[n - 1] = termResult;
	}
}
