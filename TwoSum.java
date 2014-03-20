public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> indexMap = new HashMap<Integer, Integer> ();
        
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            
            // check whether indexMap has this number
            if (!indexMap.containsKey(current)) {
                // if not, put the index of this number into map
                indexMap.put(current, i+1);
            } else {
                // if exsits, do nothing
            }
            
            int diff = target - current;
            // check whether the indexMap has its differ
            if (indexMap.containsKey(diff) && indexMap.get(diff) < i+1) {
                // if do, set index into the result
                result[0] = indexMap.get(diff);
                result[1] = i+1;
            } else {
                // nothing to do 
            }
        }
        
        return result;
        
    }
}