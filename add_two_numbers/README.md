Question
====
You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Solution
=====
Keep track of the carry using a variable and simulate digits-by-digits sum starting from the head of list, which contains the least-significant digit.

Just like how you would sum two numbers on a piece of paper, we begin by summing the least-significant digits, which is the head of l1l1 and l2l2. Since each digit is in the range of 0...9, summing two digits may "overflow". For example 5 + 7 = 12. In this case, we set the current digit to 2 and bring over the carry = 1 to the next iteration. carry must be either 0 or 1 because the largest possible sum of two digits (including the carry) is 9 + 9 + 1 = 19.

The pseudocode is as following:

* Initialize current node to dummy head of the returning list.
* Initialize carry to 0.
* Initialize p and q to head of l1 and l2 respectively.
* Loop through lists l1 and l2 until you reach both ends.
* Set x to node p's value. If p has reached the end of l1, set to 0.
* Set y to node q's value. If q has reached the end of l2, set to 0.
* Set sum = x + y + carry.
* Update carry = sum / 10.
* Create a new node with the digit value of (sum mod 10) and set it to current node's next, then advance current node to next.
* Advance both p and q.
* Check if carry = 1, if so append a new node with digit 1 to the returning list.
* Return dummy head's next node.

`Note` that we use a dummy head to simplify the code. Without a dummy head, you would have to write extra conditional statements to initialize the head's value.