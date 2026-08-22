class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int low = 0;
        int high = n - 1;
        int mid = -1;

        while (low <= high) {
            mid = low + (high - low) / 2;
            int cur = mountainArr.get(mid);

            if (mid != 0 && mid != n - 1 &&
                cur > mountainArr.get(mid - 1) &&
                cur > mountainArr.get(mid + 1)) {
                break;
            } else if (mid != n - 1 && cur < mountainArr.get(mid + 1)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        int peak = mid;

        if (mountainArr.get(peak) == target)
            return peak;

        low = 0;
        high = peak - 1;

        while (low <= high) {
            mid = low + (high - low) / 2;
            int cur = mountainArr.get(mid);

            if (cur == target)
                return mid;
            else if (target < cur)
                high = mid - 1;
            else
                low = mid + 1;
        }

        low = peak + 1;
        high = n - 1;

        while (low <= high) {
            mid = low + (high - low) / 2;
            int cur = mountainArr.get(mid);

            if (cur == target)
                return mid;
            else if (target < cur)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }
}