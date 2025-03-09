//operations on the  doubly linkedlist
public class DDL {             
    public class  node{
        int val;
        node next;
        node prev;

        node( int val){
            
            this.val=val;
            this.prev=prev;
            this.next=next;
           
        }
    }
    node head;
    public  void insertfirst(int val){          //insert at first
        node nayanode =new node(val);
              nayanode.next=head;
               head=nayanode;
           
            if(head!=null){
                head.prev=nayanode;
            }nayanode.prev=null;        

    }

    public void last(int val){                       //insert at last
        node nayanode=new node(val);
        node temp=head;
        if(head==null){
            insertfirst(val);
            return;
        }
           
        while(temp.next!=null){
            temp=temp.next;
        }
        if(temp.next==null){
        //nayanode.prev=temp;
        temp.next=nayanode;
        nayanode.next=null;
        nayanode.prev=temp;

        }
    }

    public void partilarindex(int val,int index){              //insert at particular index
        node nayanode=new node(val);
        node temp=head;
        if(head==null){
            insertfirst(val);
               return;
        }
         for(int i=0;temp!=null && i<index-1;i++){
            temp=temp.next;

        }
        if(temp==null){
            System.out.println("out of bound");
            return;
        }
        
        nayanode.next=temp.next;
        nayanode.prev=temp;
        temp.next=nayanode;

    }
    
    public void display(){                  // Display the linklist
        node temp=head;
    if(temp==null){
        System.out.println("empty");
    }
    while(temp!=null){
        System.out.print(temp.val+"->");
        temp=temp.next;
    }
    System.out.print("null");
    }
    public static void main(String[] args) {
        DDL list =new DDL();
       //insertfirst(50);
       
    list.last(30);
    list.last(50);
    list.last(60);
    list.insertfirst(20);
     list.partilarindex(70, 3);


        list.display();


    }
    
}
