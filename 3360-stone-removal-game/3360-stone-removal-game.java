class Solution {
    public boolean canAliceWin(int n) {
        int req = 10;
        if (n < req) {
            return false;
        }

        boolean aliceTurn = true;

        while (req > 0) {
            if (n < req) {
                return !aliceTurn;
            }

            n -= req;
            req--;
            aliceTurn = !aliceTurn;
        }

        return !aliceTurn;

    }
}