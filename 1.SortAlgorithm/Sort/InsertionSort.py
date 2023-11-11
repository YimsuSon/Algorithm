array = [7,3,9,0,1,2,6,5,4,8]

for i in range(1, len(array)):
  for j in range(i,0,-1): # range( start, end , step )
    # Start checking from end of list
    if array[j] < array[j-1]:
      array[j], array[j-1] = array[j-1], array[j]
    else:
      break

print(array) # [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]