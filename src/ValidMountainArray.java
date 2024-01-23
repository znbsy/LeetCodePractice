public class ValidMountainArray {

    public boolean validMountainArray(int[] arr) {
        boolean flag = true;
        if (arr.length <= 2) {
            return false;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (flag) {
                if (arr[i] >= arr[i + 1]) {
                    if (i == 0 || arr[i] == arr[i + 1]) {
                        return false;
                    }
                    flag = false;
                }
            } else {
                if (arr[i] <= arr[i + 1]) {
                    return false;
                }
            }
        }
        if (flag) {
            return false;
        }
        return true;
    }
}
