class Solution {
    public String removeOccurrences(String str, String part) {
        if(!str.contains(part)){
            return str;
        }
        if(str.contains(part)){
            str = str.replaceFirst(part,"");
        }
        return removeOccurrences(str,part);
    }
}