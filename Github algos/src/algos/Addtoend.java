package algos;

//This class implements stack using a linked list
public class Addtoend {
    
	
	Node end =null;
	public void addtoend(int item)
    {
		if(end ==null)
		{
			Node newnode = new Node();
			newnode.data= item;
			newnode.next = null;
			end = newnode;
			System.out.println("Added node " + newnode.data );
		}
		else
		{
			Node newnode = new Node();
			newnode.data = item;
			newnode.next=end;
			end= newnode;	
			
			System.out.println("Added node " + newnode.data );
		}
		
    }
	
	public Integer removefromend()
	{
		if(end ==null)
		{
			return null;
		}
		else
		{
			Node topnode= end;
			end=end.next;
			return topnode.data;
			
		}	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addtoend addtoend = new Addtoend();
		//Test
		int [] test = {2,4,1,545,234,767,23};
		
		for  (int t : test)
		{
			 addtoend.addtoend(t);			
		}
		
		System.out.println(addtoend.removefromend());
	}

}
