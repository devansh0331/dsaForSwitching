// https://leetcode.com/problems/min-stack/description/?envType=problem-list-v2&envId=plakya4j

import java.util.ArrayList;
import java.util.List;

class Oct20_2026 {

    private List<int[]> ls;

    public Oct20_2026() {
        ls = new ArrayList<>();
    }
    
    public void push(int value) {
        
        int[] top = ls.isEmpty() ? new int[]{value, value} : ls.get(ls.size() - 1);
        int min_value = top[1];
        if(min_value > value) min_value = value;

        ls.add(new int[] {value, min_value});
    }
    

    public void pop() {
        ls.remove(ls.size() - 1);
    }
    
    public int top() {
        return ls.get(ls.size() - 1)[0];
    }
    
    public int getMin() {
        return ls.isEmpty() ? -1 : ls.get(ls.size() - 1)[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */