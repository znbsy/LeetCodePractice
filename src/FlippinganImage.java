public class FlippinganImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] temp = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[i][j] = image[i][n - j - 1];
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                image[i][j] = temp[i][j] == 0? 1: 0;
            }
        }

        return image;

    }
}
