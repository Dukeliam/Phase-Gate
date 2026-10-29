function reverse(numbers){
            newArray = [numbers.length];
            
            for(let index = 0; index < numbers.length; index++){
                  newArray[index] = numbers[numbers.length - index - 1];
            }
            return newArray;
      }
function arrayIndex(numbers){
      for(let index = 0; index < numbers.length; index++){
            numbers[index] = reverse(numbers[index]);
      }
            return numbers;
}


numbers =[[8,9], [2,4,5], [3], [1,4,2,8]];

console.log(arrayIndex(numbers));


