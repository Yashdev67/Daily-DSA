Ask the user how many elements they want to enter.

Create an array to store that many elements.

Ask the user to enter values one by one and store them in the array.

Sort the array in increasing order.

Start a variable with value 1 (this represents the smallest positive number we are looking for).

Go through each number in the sorted array one by one.

If the number is zero or negative, skip it.

If the number is equal to the current value of our variable, increase the variable by 1.

If the number is greater than the variable, that means our variable value is missing in the array — so return it.

If all numbers are checked and no missing number is found in between, return the variable value.

Print the result as the smallest missing positive number.
