package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {

        System.out.println(second);

        first = first ^ second;  // XOR operation to swap values
        second = first ^ second; // XOR operation to get the original value of 'first'
        first = first ^ second;  // XOR operation to get the original value of 'second'

        System.out.println( second);

    }
}
