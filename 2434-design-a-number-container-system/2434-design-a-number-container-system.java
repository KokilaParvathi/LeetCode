class NumberContainers {
    Map<Integer, Integer> indexNumber;
    Map<Integer, TreeSet<Integer>> numberIndex;

    public NumberContainers() {
        indexNumber = new HashMap<>();
        numberIndex = new HashMap<>();
    }
    
    public void change(int index, int number) {
        if(!numberIndex.containsKey(number)) {
            numberIndex.put(number, new TreeSet<>());
        } 

        if(!indexNumber.containsKey(index)) {
            indexNumber.put(index, number);
            numberIndex.get(number).add(index);
        } else {
            int prevNum = indexNumber.get(index);
            numberIndex.get(prevNum).remove(index);
            indexNumber.put(index, number);
            numberIndex.get(number).add(index);
        }
    }
    
    public int find(int number) {
        if(!numberIndex.containsKey(number) || numberIndex.get(number).size() == 0) return -1;
        else return numberIndex.get(number).first();
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */