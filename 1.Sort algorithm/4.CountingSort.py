array = [7,3,9,0,1,2,6,5,4,8]

# Create the list to store frequency of elements
count = [0] * ( max(array)+1 )

for i in range(len(array)):
    # Increase index value of element 
    count[array[i]] += 1

for i in range(len(count)):
    for j in range(count[i]):
        print(i, end=' ')

# 0 1 2 3 4 5 6 7 8 9 