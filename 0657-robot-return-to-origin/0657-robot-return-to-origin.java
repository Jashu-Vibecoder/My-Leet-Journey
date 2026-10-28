class Solution {
    public boolean judgeCircle(String moves) {

        int i = 0;
        int j = 0;
        for (char x : moves.toCharArray()) {
            switch (x) {
                case 'U':
                    i = i - 1;
                    break;
                case 'D':
                    i = i + 1;
                    break;
                case 'L':
                    j = j - 1;
                    break;
                case 'R':
                    j = j + 1;
                    break;
            }
        }

        return (i == 0 && j == 0);
    }
}