
import sys

def main():
    import sys
    from collections import deque
    
    input = sys.stdin.read().split()
    num = int(input[0])
    counter = 0
    fine = 0
    arr = input[1:num + 1]
    
    for i in range(num):
        for k in range(num):
            if arr[k][i] == 'C':
                counter += 1
        fine += (counter * (counter - 1)) // 2
        counter = 0
    
    for i in range(num):
        for k in range(num):
            if arr[i][k] == 'C':
                counter += 1
        fine += (counter * (counter - 1)) // 2
        counter = 0
    
    print(fine)

if __name__ == "__main__":
    main()

