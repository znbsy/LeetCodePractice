public class ConstructTheRectangle {
    public int[] constructRectangle(int area) {
        int weight = 1;
        for(int i = 2; i <= Math.sqrt(area); i++){
            if(area % i == 0){
                weight = i;
            }
        }
        return new int[]{area / weight, weight};
    }
}
