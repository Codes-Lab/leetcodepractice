public class AddTwoNumbers {
    public static void main(String[] args) {
        final ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        final ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));

        ListNode listNode = AddTwoNumbers.addTwoNumbers(l1,l2);
        ListNode current = listNode;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultListNode = new ListNode(0);
        ListNode current = resultListNode;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            int sum = val1 + val2 + carry;
            carry = 0;
            if (sum > 9) {
                current.next = new ListNode(sum % 10);
                carry = sum / 10;
            } else {
                current.next = new ListNode(sum);
            }
            current = current.next;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        if(carry > 0) {
            current.next = new ListNode(carry);
        }
        return resultListNode.next;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
