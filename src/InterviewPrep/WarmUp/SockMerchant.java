package InterviewPrep.WarmUp;

import java.util.HashMap;
import java.util.Map;

/**
 * Finds number of pairs of socks given a pile of socks.
 */
public class SockMerchant {

    /**
     * Finds the number of pairs of socks present in an array of socks.
     *
     * @param n number of elements in the array
     * @param socks array of values
     * @return number of pairs found in the array
     */
    static int sockMerchant(final int n, final int[] socks) {
        int pairs = 0;
        final Map<Integer, Integer> sockMap = new HashMap<>();
        for (int sock: socks) {
            if(sockMap.get(sock) == null) {
                sockMap.put(sock, 1);
            } else {
                sockMap.put(sock, sockMap.get(sock) + 1);
            }
        }
        for (int key: sockMap.keySet()) {
            pairs += sockMap.get(key) / 2;
        }
        return pairs;
    }

}
