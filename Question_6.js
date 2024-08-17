/**
 * Reverses the given string.
 * @param {string} str - The string to be reversed.
 * @returns {string} - The reversed string.
 */
function reverseString(str) { // Define the function to reverse a string
 return str.split('')          // Split the string into an array of characters
           .reverse()          // Reverse the array of characters
           .join('');          // Join the reversed array back into a string
}

// Example usage:
console.log(reverseString("Hello, World!")); // Output: !dlroW ,olleH
