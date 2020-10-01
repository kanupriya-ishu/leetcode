class MyCircularQueue {
    
    ArrayList<Integer> queue;
    int size, front, rear;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        queue = new ArrayList<Integer>();
        size = k;
        front = -1;
        rear = -1;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (isFull()) return false;
        if(front==-1)
        {
            rear=0;
            front=0;
            queue.add(rear, value); 
        }
        else if(rear==size-1 && front!=0)
        {
            rear = 0;
            queue.set(rear, value);
        }
        else
        {
            rear = (rear+1);
            if(front <= rear) 
            { 
                queue.add(rear, value); 
            } 

            else
            { 
                queue.set(rear, value); 
            }
        }

        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty()) return false;
        int temp = queue.get(front); 

        if(front == rear) 
        { 
            front = -1; 
            rear = -1; 
        } 

        else if(front == size - 1) 
        { 
            front = 0; 
        } 
        else
        { 
            front = front + 1; 
        }

        return true;
      
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if (isEmpty()) return -1;
        return queue.get(front);
        
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if (isEmpty()) return -1;
        return queue.get(rear);
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if (front==-1)
            return true;
        else
            return false;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if((front == 0 && rear == size - 1) || (rear == (front - 1) % (size - 1))) 
            return true;
        else
            return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */