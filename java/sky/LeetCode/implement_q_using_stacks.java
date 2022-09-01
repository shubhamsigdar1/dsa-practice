//link: https://leetcode.com/problems/implement-queue-using-stacks/
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Implement Queue using Stacks.
//  Memory Usage: 40.3 MB, less than 89.63% of Java online submissions for Implement Queue using Stacks.

class MyQueue {
    Stack<Integer> st1;
    Stack<Integer> que;
    public MyQueue() {
        st1 = new Stack<Integer>();
        que = new Stack<Integer>();
    }

    public void push(int x) {
        st1.push(x);
    }

    public int pop() {
        if(que.isEmpty()){
            while(!st1.isEmpty()){
                que.push(st1.pop());
            }
        }
        return que.pop();
    }

    public int peek() {
        if(que.isEmpty()){
            while(!st1.isEmpty()){
                que.push(st1.pop());
            }
        }
        return que.peek();     //top
    }

    public boolean empty() {
        return st1.isEmpty() && que.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */