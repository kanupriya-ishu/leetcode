class Solution {
    public void reverseString(char[] s) {
        int front = 0;
        int rear = s.length - 1;
        
        while(front < rear)
        {
            swap(s, front, rear);
            front++;
            rear--;
        }
    }
    
    void swap(char[] s, int front, int rear)
    {
        char temp = s[front];
        s[front] = s[rear];
        s[rear] = temp;
    }
}