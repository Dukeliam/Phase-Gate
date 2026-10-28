def list_reversed(numbers):
      new_list = []
      
      for index in numbers:
            new_list.append(index[::-1])
      return new_list
      
numbers = [[1,2,3], [4,5,6], [7,8,9]]
print(list_reversed(numbers))
