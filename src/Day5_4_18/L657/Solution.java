package Day5_4_18.L657;

public class Solution {

    public boolean judgeCircle(String moves) {
        int countX = 0;
        int countY = 0;

        char[] chars = moves.toCharArray();
        for (char c : chars) {
            if ( c == 'U'){
                countY++;
            }else if ( c == 'D'){
                countY--;
            }else if ( c == 'R'){
                countX++;
            }else if ( c == 'L'){
                countX--;
            }else {
                return false;
            }
        }
        if ( countX == 0 && countY == 0){
            return true;
        }else {
            return false;
        }
    }
}
