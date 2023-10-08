const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

function bubbleSortDescending(arr) {
  const n = arr.length;

  for (let i = 0; i < n - 1; i++) {
    for (let j = 0; j < n - 1 - i; j++) {
      if (arr[j] < arr[j + 1]) {
        const temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
      }
    }
  }
}

rl.question("Enter numbers separated by spaces: ", function (input) {
  const numbers = input.split(" ").map(Number);

  bubbleSortDescending(numbers);

  console.log("Sorted array in descending order:", numbers);

  rl.close();
});

//   const numbers = [5, 2, 9, 1, 5, 6];

//   // Sort the array in descending order
//   numbers.sort((a, b) => b - a);

//   console.log(numbers); // Output: [9, 6, 5, 5, 2, 1]
