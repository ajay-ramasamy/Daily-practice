//! 1791. Find Center of Star Graph

class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int[] edge : edges){
            mp.put(edge[0], mp.getOrDefault(edge[0], 0) + 1);
            mp.put(edge[1], mp.getOrDefault(edge[1], 0) + 1);
        }
        int max = 0;
        int node = 0;
        for(Integer num : mp.keySet()){
            if(mp.get(num) > max){
                max = mp.get(num);
                node = num;
            }
        }
        return node;
    }
}
