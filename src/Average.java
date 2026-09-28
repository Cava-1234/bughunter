/* Find ud hvordan vi håndterer tomme lister */

void main() {
    IO.println("Gennemsnittet af 1, 2, 3, 4, 5 er: " 
        + calculateAverage(new int[]{1, 2, 3, 4, 5}));
    IO.println("Gennemsnittet af en tom liste er: " 
        + calculateAverage(new int[]{}));
}

double calculateAverage(int[] numbers) {
    int sum = 0;

    for (int number : numbers) {
        sum += number;
    }

    if(sum > 0) {
        return sum / numbers.length;
    }
    return 0;

}
