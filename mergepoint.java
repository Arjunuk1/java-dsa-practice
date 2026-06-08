public class mergepoint {
    
    static Node findMergePoint(Node headA, Node headB) {
    if (headA == null || headB == null) return null;

    Node ptr1 = headA;
    Node ptr2 = headB;

    while (ptr1 != ptr2) {
        ptr1 = (ptr1 == null) ? headB : ptr1.next;
        
        ptr2 = (ptr2 == null) ? headA : ptr2.next;
    }


    return ptr1;
}
}
