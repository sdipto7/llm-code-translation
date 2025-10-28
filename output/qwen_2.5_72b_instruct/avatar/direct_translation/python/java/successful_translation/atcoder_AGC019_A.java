
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Collectors;
import java.math.BigInteger;
import java.math.BigDecimal;

public class atcoder_AGC019_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long q = scanner.nextLong();
        long h = scanner.nextLong();
        long s = scanner.nextLong();
        long d = scanner.nextLong();
        long n = scanner.nextLong();
        long best1L = Math.min(q * 4, Math.min(h * 2, s));
        long best2L = Math.min(d, best1L * 2);
        if (n % 2 == 0) {
            System.out.println(best2L * (n / 2));
        } else {
            System.out.println(best2L * (n / 2) + best1L);
        }
    }
}

