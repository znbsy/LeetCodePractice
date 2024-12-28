public class FruitIntoBaskets {
    public int totalFruit(int[] fruits) {
        int[][] basket = new int[2][2];
        basket[0][0] = -1;
        basket[0][1] = 0;
        basket[1][0] = -1;
        basket[1][1] = 0;
        int count = 0;

        int left = 0;
        int prev = fruits[0];
        int ans = -1;


        for (int i = 0; i < fruits.length; i++) {
            int f = fruits[i];


            if (basket[0][0] == -1) {
                basket[0][0] = f;
                basket[0][1] = 1;

                if (prev != f) {
                    left = i;
                    prev = f;
                }
                continue;
            }

            if (f == basket[0][0]) {
                basket[0][1] += 1;
                if (prev != f) {
                    left = i;
                    prev = f;
                }
                continue;
            }
            //System.out.println("here");
            if (basket[1][0] == -1) {

                basket[1][0] = f;
                basket[1][1] = 1;


                if (prev != f) {
                    left = i;
                    prev = f;
                }

                //System.out.println("yeah " + basket[1][1]);
                continue;
            }

            if (f == basket[1][0]) {
                basket[1][1] += 1;

                if (prev != f) {
                    left = i;
                    prev = f;
                }
                continue;

            }

            //System.out.println("SAD ");
            //System.out.println(basket[0][1] + " " + basket[1][1] + " " + left);
            ans = Math.max(ans, basket[0][1] + basket[1][1]);
            basket[0][0] = fruits[left];
            basket[0][1] = i - left;
            basket[1][0] = f;
            basket[1][1] = 1;
            //System.out.println(basket[0][1] + " " + basket[1][1]);

            if (prev != f) {
                left = i;
                prev = f;
            }


        }
        //System.out.println(basket[0][1] + " " + basket[1][1]);

        return Math.max(basket[0][1] + basket[1][1], ans);


    }
}
