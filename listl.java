public class listl{

    class node{
        int data;
        node next;
        
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    node head;
    public void first(int data, int index){
        node newnode=new node(data);
        if(index==0){
            newnode.next=head;
            head=newnode;
            return;
        }
        node temp=head;
        for(int i=0;temp!=null &&i<index-1;i++){
            temp=temp.next;
        }
           if(temp==null){
            System.out.println("outof bound");
            return;
           }
           
       
       newnode.next=temp.next;
       temp.next=newnode;
    }



    public void delete(int data){
        if(head==null){
            System.out.println("list is empty");
        }
        head=head.next;
    }

    public void deleteend(int data){
        if(head==null){
            System.out.println("empty");
            return;
        }
        if(head.next==null){
                      head=null;
                      return;
        }

        node temp=head;
        while(temp.next.next!=null){
                 temp=temp.next;
        }
        temp.next=null;
    }
    public void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    
	public static void main(String[] args) {
		listl linkedlist=new listl();
		linkedlist.first(10,0);
     //   linkedlist.first(3, 2);
		linkedlist.first(20,1);
        linkedlist.first(3, 2);
		linkedlist.display();
        linkedlist.delete(0);
        linkedlist.display();
        linkedlist.deleteend(0);
        linkedlist.display();
	}
	}
