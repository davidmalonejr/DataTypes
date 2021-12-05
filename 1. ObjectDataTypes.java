/* Program 1 - Object Data Types */
  class ObjectDataTypes {
    public static void main(String[] args) {
 
      System.out.println(" "); // Message 1
      System.out.println("----------------- "); // Message 1
			
      /* Object Part 1 */
			String myName = new String("MyName"); // Artist Name
			System.out.println("My Name Is: " + myName); // Message 1
			

			/* Object Part 2 */
			Integer myAge = 0; // Age Of Artist As Integer Data Type
			Integer myAgeInDays = myAge * 365; // Age Of Artist As Integer Data Type
			System.out.println("I Am " + myAgeInDays + " Days Old!"); // Message 2
			
			/* Object Part 3 */
			String myPassion = new String("Enter Your Passion Here"); // Age Of Artist As Integer Data Type
			System.out.println("My Passion Is: " + myPassion); // Message 2

      String myFinalMessage ="My Name is " + myName + " and I am " + myAge + " years old and my Passion is " + myPassion; // Final Message
			System.out.println(myFinalMessage);
      
			System.out.println("----------------- "); // Message 1
			System.out.println(" "); // Message 1

    }
}