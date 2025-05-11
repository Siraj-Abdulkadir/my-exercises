#first exercise            Date: 22 january 2025

import this

print(this)

#Working with user names

name = input("please enter your name? ")

print(f'Wellcome {name.title()}.')

#Removing whitespaces and handling capitalization errors

answer = input(f"whats two plus five {name.title()}? ")

answer = answer.strip()

if answer.lower() == "seven":
    print(True)
else:
    print(False)

    