static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        if(head==null)
         return head;
        SinglyLinkedListNode prev=null;
        SinglyLinkedListNode cur=head;
        SinglyLinkedListNode next=null;
        while(cur!=null)
        {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        
        head=prev;
        return head;
                    


    }