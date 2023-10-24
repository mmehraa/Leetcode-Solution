/*
      206. Reverse Linked List ( https://leetcode.com/problems/reverse-linked-list )

      Given the head of a singly linked list, reverse the list, and return the reversed list.
*/

/*
      Definition for singly-linked list.
      
      struct ListNode {
                  int val;
                  struct ListNode *next;
      };
 
 */
struct ListNode* reverseList(struct ListNode* head){
    struct ListNode *prevNode, *currentNode, *nextNode;
    prevNode = NULL;
    currentNode = nextNode = head;
    
    while (nextNode != NULL){
        nextNode = nextNode -> next;
        currentNode -> next = prevNode;
        prevNode = currentNode;
        currentNode = nextNode;
    }
    head = prevNode;
    return head;
}
