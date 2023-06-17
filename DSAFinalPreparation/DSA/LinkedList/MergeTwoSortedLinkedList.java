package DSA.LinkedList;

public class MergeTwoSortedLinkedList {
    public static void main(String... args){

    }
    public Node mergeTwoLists(Node list1, Node list2) {
        if(list1==null && list2==null)
            return null;

        Node ans = new Node();
        Node temp = ans;
        while(list1!=null && list2!=null){
            if(list1.value<list2.value){
                temp.next = list1;
                temp = temp.next;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
        }
        if(list1!=null){
            temp.next = list1;
        }
        else{
            temp.next = list2;
        }
        return ans.next;
    }
}
