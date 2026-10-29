def reverse(numbers):
      new_array = []
      
      for index in range (len(numbers)):
            result = numbers[len(numbers) - index - 1]
            new_array.append(result)
      
      return new_array
     
def array_index(numbers):
      for index in range (len(numbers)):
            numbers[index] = reverse(numbers[index]);
      
      return numbers;



numbers =[[8,9], [2,4,5], [3], [1,4,2,8]];

print(array_index(numbers));


