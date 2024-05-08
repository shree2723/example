package java1;

public class examples {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
						int[] a1 = { 12, 23, 35 };
						int[] a2 = { 22, 14, 36 };
						int[] mergedArray = new int[a1.length * 2];
						int pos = 0;

						for (int i = 0; i < a1.length; i++) {
							mergedArray[pos] = a1[i];
							pos++;
							mergedArray[pos] = a2[i];
							pos++;
						}

						for (int num : mergedArray) {
							System.out.print(num + " ");
						}

						double median;
						int totalLength = mergedArray.length;
						if (totalLength % 2 == 0) {
							median = (mergedArray[totalLength / 2 - 1] + mergedArray[totalLength / 2]) / 2.0;
						} else {
							median = mergedArray[totalLength / 2];
						}

						System.out.println("\nMedian: " + median);
					}
		}



