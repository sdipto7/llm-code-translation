
import sys

def main():
    import sys
    import sys
    from sys import stdin
    
    input = stdin.read().split()
    index = 0
    
    w = int(input[index])
    index += 1
    n = int(input[index])
    index += 1
    
    values = [i + 1 for i in range(w)]
    
    for _ in range(n):
        str_input = input[index]
        index += 1
        ab = str_input.split(',')
        a = int(ab[0]) - 1
        b = int(ab[1]) - 1
        x = values[a]
        values[a] = values[b]
        values[b] = x
    
    for value in values:
        print(value)

if __name__ == "__main__":
    main()

