public class BonusMilesService {

    public int calculate(int cost) {
        int result;
        if (cost >= 20) {
            result = cost / 20;
        } else {
            result = 0;
        }
        return result;
    }
}
