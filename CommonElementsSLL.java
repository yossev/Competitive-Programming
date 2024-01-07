/*
Implement an internal iterative method to find the common elements in two sorted linked lists and return the
common elements in sorted order in a new linked list. The original linked lists should not be modified.
So, for instance, calling the method on l1 and l2
l1 = 3->9->12->15->21
l2 = 2->3->6->12->19
the method should return a new linked list with the following values:
3->12
You may assume that the original lists do not have any duplicate items. Note: The method should have a time
complexity O(n). You are not allowed to use any predefined methods. You need to perform reference manipulation
*/

public static LinkList commonElements(LinkList l1, LinkList l2) {
		
		Link curr1 = l1.head;
		Link curr2 = l2.head;
		LinkList result = new LinkList(); // LL to store the result
	while(curr1 != null && curr2 != null) {
		if(curr1.data.equals(curr2.data)){
			result.insertLast(curr1.data);
		}
		else if((int)curr1.data > (int)curr2.data) {
			curr2 = curr2.next;
		}
		else
			curr1 = curr1.next;
	}
	return result;

// APPROACH : Two pointers and comapring ( if one is greater , move two to the next one ) (since they're both in sorted LLS ) 
// O(n) Time Complexity
