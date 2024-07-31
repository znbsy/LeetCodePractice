public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (target < matrix[0][0] || target > matrix[matrix.length - 1][matrix[0].length - 1]) return false;
        int up = 0;
        int down = matrix.length - 1;
        int center = up + (down - up) / 2;

        while (up <= down) {
            int c = matrix[center][0];

            if (c == target) {
                return true;
            } else if (c > target) {
                down = center - 1;
            } else {
                up = center + 1;
            }

            center = up + (down - up) / 2;
        }
        //System.out.println(center);
        if (center >= matrix.length || target < matrix[center][0]) center--;



        int left = 0;
        //System.out.println(matrix[center].length);
        int right = matrix[center].length - 1;
        int mid = left + (right - left) / 2;


        while (left <= right) {
            int c = matrix[center][mid];
            if (c == target) {
                return true;
            } else if (c > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            mid = left + (right - left) / 2;
        }

        return false;



    }
}
