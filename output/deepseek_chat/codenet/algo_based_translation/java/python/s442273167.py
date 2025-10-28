
import sys

def main():
    n = int(input().strip())
    l = [0] * n
    r = [0] * n
    
    for i in range(n):
        data = input().split()
        l[i] = int(data[0])
        r[i] = int(data[1])
    
    total = 0
    for i in range(n):
        total += r[i] - l[i] + 1
    
    print(total)

if __name__ == "__main__":
    main()

