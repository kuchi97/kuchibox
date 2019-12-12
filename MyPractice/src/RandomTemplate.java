import java.util.Random;

public class RandomTemplate {

	public void run() {
		int a[] = new int[6];

		Random r = new Random();

		for (int i = 0; i < a.length; i++) {

//			a[i]= r.nextInt(6)+1;
			a[i] = (int) (Math.random() * 6 + 1);

			for (int j = 0; j < i; j++) {
				if (a[i] == a[j])
					i--;
			}
		}

		for (int value : a) {
			System.out.println(value);
		}
	}
}
