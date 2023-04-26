package ch1901;

import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToIntBiFunction;

public class Ex01test {
	
	public static void main(String[] args) {
		System.out.println("< BiPredicate >");
		BiPredicate<Integer, Integer> bp = (i1, i2) -> i1 > i2;
		System.out.println(bp.test(2, 3));
	}

}
