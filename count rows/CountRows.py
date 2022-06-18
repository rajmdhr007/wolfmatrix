rowcount  = 0
#iterating through the whole file
for row in open("csv.csv"):
  rowcount+= 1
 #printing the result
print("Number of lines present:-", rowcount)