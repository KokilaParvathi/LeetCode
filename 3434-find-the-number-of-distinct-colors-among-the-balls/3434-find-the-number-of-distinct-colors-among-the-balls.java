class Solution {
    public int[] queryResults(int limit, int[][] q) {
        int len = q.length;
        int[] result = new int[len];

        HashMap<Integer, Integer> ballMap = new HashMap<>();
        HashMap<Integer, Integer> colourMap = new HashMap<>();

        for(int i = 0; i < len; ++i) {
            int ball = q[i][0];
            int colour = q[i][1];
            if(ballMap.containsKey(ball)) {
                int prevColour = ballMap.get(ball);
                colourMap.put(prevColour, colourMap.get(prevColour) - 1);
                if(colourMap.get(prevColour) == 0)
                    colourMap.remove(prevColour);
            }
            ballMap.put(ball, colour);
            colourMap.put(colour, colourMap.getOrDefault(colour, 0) + 1);
            result[i] = colourMap.size();
        }

        return result;

    }
}