/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aadim
 */
import java.util.stream.Stream;
public class Question2 {
    public class OddSquaresSumGenerator {
    public static void main(String[] args) {
        int limit = 10; // Replace with your desired limit
        Stream<Long> oddSquaresStream = oddSquaresSum(limit);
        oddSquaresStream.limit(limit).forEach(System.out::println);
    }

    public static Stream<Long> oddSquaresSum(int limit) {
        return Stream.iterate(1L, n -> n + 2)
                .mapToLong(n -> {
                    long sum = 0;
                    for (long i = 1; i <= n; i += 2) {
                        sum += i * i;
                    }
                    return sum;
                })
                .boxed();
    }
}
    
}
