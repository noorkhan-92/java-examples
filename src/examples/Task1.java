package examples;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {
private static final int MODULO = 10000007;
    public Task1() {
        System.out.println(calc(25, 30));
    }
    
    public static int calc(int n, int k) {
    if (n < 0 || k < 0)
        throw new IllegalArgumentException();
    if (n == 0)
        return 0;
    if (k == 0)
        return 1;
    return calc0(n, k, new HashMap<>());
}

private static int calc0(int n, int k, Map<Integer, Integer> cache) {
    
    Integer cachedValue = cache.get(k);
    if (cachedValue != null)
        return cachedValue;
    int result;
    if (k == 1)
        result = n % MODULO;
    else
        result = (int) ((long) calc0(n, k / 2, cache) * calc0(n, k - k / 2, cache) % MODULO);
    cache.put(k, result);
    return result;
}

    public static void main(String args[]) {
        new Task1();
    }

}
