class Solution {
    public int[] constructDistancedSequence(int size) {
        int sequence[] = new int[2 * size - 1];
        boolean isUsed[] = new boolean[size + 1];

        findSequence(sequence, isUsed, 0, size);
        return sequence;
    }

    private boolean findSequence(int sequence[], boolean isUsed[], int index, int size) {
        if (index == sequence.length) return true;

        if (sequence[index] != 0) return findSequence(sequence, isUsed, index + 1, size);
        
        for (int num = size; num >= 1; num--) {
            int secondIndex = (num == 1) ? index : index + num; 

        if (!isUsed[num] && (num == 1 ||(secondIndex < sequence.length && sequence[secondIndex] == 0))) {
                sequence[index] = num;
                if (num > 1) sequence[secondIndex] = num;
                isUsed[num] = true;

                if (findSequence(sequence, isUsed, index + 1, size)) return true;

                sequence[index] = 0;
                if (num > 1) sequence[secondIndex] = 0;
                isUsed[num] = false;
            }
        }
        return false;
    }
}
