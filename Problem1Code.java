/**
  The following code passes test cases 1 and 2. I commented and wrote the following code in 13 minutes and 34 seconds.
*/

class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        // lines 8-13 are to be ignored; they were part of an initial solution, however, as I was writing it I realized it would not necessarily work.
        // I left it in to show that that although I was initially stuck and my first thought was wrong, I continued and persevered
        ArrayList<Integer> numsCopy = new ArrayList<>();
        for (Integer num : nums) {
          numsCopy.add(num);
        }

        Collections.sort(numsCopy);

        // variable to store number of shifts
        int shifts = 0;

        /* iterate through the provided list in the method paramater
           check when the number is less than the previous number to find the smallest number from where the right shifts need to start
           I was unable to figure out how exactly to implement the logic for when the list could not be sorted through right-shifts; the additional if-statment is an attempt at that, but it did not work
        */
        for (int i = 1; i < nums.size(); i++) {
          if (!(nums.get(i) > nums.get(i-1))) {
            shifts = nums.size() - i;
            break;
          }
          if ((nums.get(i-1) > nums.get(i)) && (nums.get(i) < nums.get(i+1))) {
            return -1;
          }
        }

        return shifts;
    }
}
