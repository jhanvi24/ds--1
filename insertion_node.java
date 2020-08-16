class insertion_node {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public void insertAfter(Node prev_node ,int new_data)
    {
      if(head == null)
      {
          System.out.print("The previous node can not be null");
          return;
      }
      Node new_node = new Node(new_data);
      new_node.next = prev_node.next;
      prev_node.next = new_node;
    }
    public void append(int new_data)
    {
        Node new_node = new Node(new_data);
        if(head == null)
        {
            head = new Node(new_data);
            return;
        }
        new_node.next = null;
        
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
            last.next = new_node;
            return;
    }
       public void printList()
       {
         Node n = head;
         while(n != null){
             System.out.print(n.data + " ");
             n = n.next;
         }
       }
    public static void main(String args[])
    {
    insertion_node llist = new insertion_node();
     llist.append(5);
     llist.push(1);
     llist.push(3);
     llist.append(4);
     llist.push(2);
     llist.insertAfter(llist.head.next,7);
     System.out.println("\nCreated Linked list is: "); 
        llist.printList(); 
  }
}