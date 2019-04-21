//Design an int type singly linkedlist class, and then implement some functions below using the self designed class.
// Can not use Java built in List interface
// 1. Append an element into the linkedlist
// 2. Remove the tail element from a linkedlist
// 3. Remove all element in the linkedlist that is great than a target value

public class Main {

    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        // add elements to the tail of the linked list
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.show();

        // remove the tail element from the linked list
        int count = myList.listCount;
        myList.deleteNodeAtIndex(count);
        myList.show();

        // Remove all element in the linked list that is great than a target value
        int element = 1;
        int newCount = myList.listCount;
        for(int i=element;i<=newCount;i++) {
            myList.deleteNodeWithData(i);
        }
        myList.show();
    }
}
