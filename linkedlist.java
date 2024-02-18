import java.util.*;
public class linkedlist {
    static class ListNode{
        int data;
        ListNode next;

        ListNode(int v){
            data = v;
        }
    }

    public static void print(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.println(temp.data +" ");
            temp = temp.next; 
        }
    }


    public static ListNode insertVal(ListNode head, int data, int position){
        ListNode temp = head;
        ListNode newNode = new ListNode(data);
        if(head == null){
            if(position == 0){
                head = newNode;
            }
        }
        if(position==0){
            head = newNode;
            head.next = temp;
        }

        int count = 0;
        while(temp!=null){
            if(position-1 == count || temp.next==null){
                newNode.next = temp.next;
                temp.next = newNode;
            }
            count ++;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        // ListNode a = new ListNode(4);
        // ListNode b = new ListNode(5);
        // ListNode c = new ListNode(9);

        // a.next = b;
        // b.next = c;



        // ListNode head = new ListNode(-1);
        // Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // ListNode lastNode = head;
        // for(int i=0; i<n; i++){
        //     int val = scn.nextInt();
        //     ListNode newNode = new ListNode(val);
        //     // change lastNode to point to the lastNode in the LinkedList.

        //     lastNode.next = newNode;
        //     lastNode = newNode;
            
        // }



        ListNode head = new ListNode(-1);
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ListNode lastNode = head;
        for(int i=0; i<n; i++){
            int val = scn.nextInt();
            ListNode newNode = new ListNode(val);
            lastNode.next = newNode;
            lastNode = newNode;
        }
        

        
    
        
    }
}
