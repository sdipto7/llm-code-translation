
while True:
    try:
        a = int(input())
        op = input().strip()
        b = int(input())
    except ValueError:
        break

    if op == '?': 
        break
    elif op == '+': 
        print(a + b)
    elif op == '-': 
        print(a - b)
    elif op == '*': 
        print(a * b)
    elif op == '/': 
        if b != 0:
            print(a // b)
        else:
            # In Java code, division by zero will raise an ArithmeticException. 
            # Python will also raise a ZeroDivisionError. 
            # To be precise, we should handle this exception.
            # However, the original Java code does not handle it explicitly.
            # So, we'll just let it raise an error.
            print(a / b)
 

However, a more idiomatic and precise translation is as follows:

import sys

for line in sys.stdin:
    try:
        a, op, b = line.split()
        a, b = int(a), int(b)
    except ValueError:
        break

    if op == '?': 
        break
    elif op == '+': 
        print(a + b)
    elif op == '-': 
        print(a - b)
    elif op == '*': 
        print(a * b)
    elif op == '/': 
        print(a // b)

