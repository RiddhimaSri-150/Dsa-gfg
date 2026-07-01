public class KokoEatingBanana {
    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1;

        // Highest useful speed is the largest pile size —
        // going faster than that wastes speed (still takes 1 hour per pile).
        int hi = 0;
        for (int pile : piles) {
            hi = Math.max(hi, pile);
        }

        // Step 2: Binary search for the smallest valid k.
        while (lo < hi) {

            // Pick the middle speed to test.
            // Using lo + (hi - lo) / 2 avoids integer overflow
            // (safer than (lo + hi) / 2 for large values).
            int mid = lo + (hi - lo) / 2;

            // Check how many hours Koko needs if she eats at speed 'mid'.
            if (hoursNeeded(piles, mid) <= h) {
                // 'mid' is fast enough to finish in time.
                // It's a valid candidate, but maybe a smaller k also works.
                // So we shrink the search to the left half (including mid).
                hi = mid;
            } else {
                // 'mid' is too slow — she can't finish in h hours.
                // We need a faster speed, so search the right half.
                // mid itself is invalid, so we exclude it: mid + 1.
                lo = mid + 1;
            }
        }

        // Step 3: When lo == hi, we've converged on the minimum valid speed.
        return lo;
    }

    // Helper function: calculates total hours needed to eat all piles at speed k.
    private int hoursNeeded(int[] piles, int k) {
        int hours = 0;

        for (int pile : piles) {
            // For each pile, hours needed = ceil(pile / k).
            // Integer trick for ceiling division: (pile + k - 1) / k
            // This avoids using floating point math (Math.ceil with doubles).
            hours += (pile + k - 1) / k;
        }

        return hours;
    }
}
