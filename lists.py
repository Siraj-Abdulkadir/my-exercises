#Adding new item to a list

numbers = [1,2,3]

#using append method

for i in range(4,11):
    numbers.append(i)

print(numbers)

#using insert method

numbers.insert(0, 0)

print(numbers)

#the insert methods takes two parameters the index and the value respectively


#Removing an item from a list

del numbers[1]

print(numbers)

#We can use the del statement if we know the index of the item we want to delete


popped_item = numbers.pop(4)

print(numbers)
print(popped_item)

#Pop is a methods we can use if we want to store the value after we delete an item from a list, if we there is no parameter the pop removes the last item

numbers.remove(8)

print(numbers)

#We can use the remove method to remove items if we know the value we want to remove, the remove only removes the first occurence if two similar values exist

#Sorting lists

cars = ['jeep', 'toyota', 'suzuki', 'hyundai']

#Using the sorted function to sort temporarliy

print(sorted(cars, reverse=True))

#Using the sort method to sort permanenlty
cars.sort()
print(cars)


#Reversing list items

cars.reverse()

print(cars)

#Finding the length of a list


print(len(cars))




