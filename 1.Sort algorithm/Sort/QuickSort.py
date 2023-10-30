array = [7,3,9,0,1,2,6,5,4,8]

def quick_sort(array, start, end):
  if start >= end: # end there is only one element
    return
  pivot = start # pivot is first element
  left = start + 1
  right = end 
  while left <= right:
    # repeat until finding data which is bigger than pivot
    while left <= end and array[left] < array[pivot]:
      left += 1
    # repeat until finding data which is smaller than pivot  
    while right > start and array[right] >= array[pivot]:
      right -= 1
    # swap pivot and small value if datas are crossed
    if left > right:
      array[right], array[pivot] = array[pivot], array[right]
    # swap great value and small value if datas are not crossed
    else:
      array[left], array[right] = array[right], array[left]

  quick_sort(array, start, right-1)
  quick_sort(array, right+1, end)


quick_sort(array,0,len(array)-1)

print(array) # [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]