class Solution {
    public int[] scoreValidator(String[] events) {
        int counter = 0;
        int score = 0;

        for (int i = 0; i < events.length; i++) {
            if (events[i].equals("0") || events[i].equals("1") || events[i].equals("2") || events[i].equals("3") || events[i].equals("4") || events[i].equals("5") || events[i].equals("6")) { 
                score = score + Integer.parseInt(events[i]) ;
            } else if (events[i].equals("W")) {
                counter++;
                if(counter>=10) break;
            } else if (events[i].equals("WD")) {
                score++;
            } else if (events[i].equals("NB")) {
                score++;
            }
        }
        int[] arr = { score, counter };
        return arr;
    }
}