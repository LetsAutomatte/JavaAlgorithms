package DataStructure;

public class QueueUisngArray_Static {
	int size;
	int[] arr;
	int front;
	int rear;
	int currentsize;
	
	QueueUisngArray_Static(int size)
	{
		this.size= 4;
		this.arr= new int[size];
		front =0;
		rear = -1;
		currentsize=0;
			
	}
	
	public void isEmpty()
	{
		if(currentsize==0)
		{
			System.out.println("stack is empty");
		}
	}
	
		
	public void enqueue(int n)
	{
		if(currentsize==(size-1))
		{
	System.out.println("stack is full");
		}
		else
		{
			arr[rear+1] = n;
			rear = rear+1;
			currentsize = currentsize+1;
			System.out.println("Now rearis"+rear+"----  elemet is "+arr[rear]);
		}
		
	}
	
	public void deque()
	{
		if(rear==-1)
		{
			System.out.println("stack is empty");
		}
		else
		{
			
			arr[front] = arr[front+1];
			arr[rear-1]= arr[rear];
			front=front+1;
			rear=rear-1;
			currentsize = currentsize-1;
			System.out.println("Now fron is"+front+"---- front elemet is "+arr[front]);
			System.out.println("Now rear is"+rear+"---- rear elemet is "+arr[rear]);
			System.out.println("-----------------");
		}
		
	}
	
	public static void main(String[] args)
	{
		QueueUisngArray_Static qa = new QueueUisngArray_Static(3);
		qa.deque();
		qa.enqueue(5);
		qa.enqueue(6);
		qa.enqueue(7);
		qa.enqueue(8);
		qa.deque();
		qa.deque();
		qa.deque();
		qa.deque();
		qa.deque();
		
	}
	
	

}
