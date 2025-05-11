#March 19/2024
myInput = int(input("Enter any number:"))
primeNumbers = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103]

if(myInput < 1):
 print("The number have to be greater than 1!")
else:
 
  squaredRoot = round(myInput**0.5)
  fullLength = len(primeNumbers)
 
  for counter in range(0, fullLength):
   everyChecker = primeNumbers[counter]
   
   if( everyChecker <= squaredRoot):
    
     if(myInput % everyChecker == 0):
      print("The number recieved is composite number!")
      break
    
     elif(counter == squaredRoot):
      print("The number recieves is a prime number!")
      break 
     else:
      continue
   
   elif(counter == squaredRoot):
     print("The number recieves is a prime number!")
     break  
   
   else:
      continue
