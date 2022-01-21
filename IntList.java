/**
Defines a class that represents a list of integers
@editor Maxime Sotsky 3637964
*/
public class IntList {

	/**
	First node in the list
	*/
	private IntNode front; 

	/**
	Constructs a list.  Initially the list is empty.
	*/
	public IntList() {
		front = null;
	}

	/**
	Adds given integer to front of list.
	@param val integer to add to the front of the list
	*/
	public void addToFront(int val) {
		front = new IntNode(val, front);
	}

	/**
	Removes the first node from the list.
	If the list is empty, does nothing.
	*/
	public void removeFirst() {
		if (front != null) {
			front = front.next;
		}
	}

	/**
	Prints the list elements from first to last.
	*/
	public void print() {
		System.out.println("--------------------");
		System.out.print("List elements: ");
		IntNode temp = front;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println("\n-----------------------\n");
	}

	
	/**
	An inner class that represents a node in the integer list.
	The public variables are accessed by the IntList class.
	*/
	private class IntNode {
		
		/**
		Value stored in node.
		*/
		public int val; 
		
		/**
		Link to next node in list.
		*/
		public IntNode next; 
		
		/**
		Constructor; sets up the node given a value and IntNode reference
		@param val the value to store in the node
		@param next the link to the next node in the list
		*/
		public IntNode(int val, IntNode next) {
			this.val = val;
			this.next = next;
		}
	}


	/**
	 * method that calculates the length of the list
	 * @return the length of the list
	 */

	public int length(){
		int count = 0;
		if(this.front == null){
			System.out.print("List lenght: " + count);
			return count;
		}
		IntNode curr = this.front;
		while(curr != null){
			count++;
			curr = curr.next;
		}
		System.out.print("List lenght: " + count);
		return count;
	}

	/**
	 * method to add to the end of the list
	 * @param val - the integer value to be added to the list
	 */
	public void addToEnd(int val){
		if(this.front == null){
			this.front = new IntNode(val,this.front);
			return;
		}
		IntNode curr = this.front;
		while(curr.next != null){
			curr = curr.next;
		}
		curr.next = new IntNode(val,null);
	}

	/**
	 * method to remove last element from the List
	 */
	public void removeLast(){
		if(this.front == null){
			return;
		}
		if(this.front.next == null){
			front = null;
			return;
		}
	
		IntNode curr = this.front;
		while(curr.next.next != null){
			curr = curr.next;
		}
		curr.next = null;
	}

	/**
	 * method to replace all occurrences of an element with another Value
	 * @param oldVal - the value to be replaced
	 * @param newVal - the value to replace with
	 */
	public void replace(int oldVal, int newVal){

		if(this.front == null){
			return;
		}

		IntNode curr = this.front;

		while(curr != null){
			if(curr.val == oldVal){
				curr.val = newVal;
			}
			curr = curr.next;
		}
	}

	/**
	 * recursive helper method to print the List
	 * @param curr - the current node during traversal
	 */
	public void printRecHelper(IntNode curr){
		if(curr == null){
			return;
		}
		System.out.print(curr.val + " ");
		printRecHelper(curr.next);
	}
	/**
	 * method to print list recursively - to be called in main
	 */
	public void printRec(){
		printRecHelper(this.front);
	}

	/**
	 * recursive helper method to print the list backwards
	 * @param curr - the current node during traversal
	 */
	public void printRecBackwardsHelper(IntNode curr){
		if(curr	 == null){
			return;
		}
		printRecBackwardsHelper(curr.next);
		System.out.print(curr.val + " ");
	}

	/**
	 * method to print list backwards recursively - to be called in main
	 */
	public void printRecBackwards(){
		printRecBackwardsHelper(this.front);
	}
}



