
import sys

def main():
    data = sys.stdin.read().split()
    n = int(data[0])
    m = int(data[1])
    a = [0] * m
    
    if n % m == 0:
        for i in range(len(a)):
            a[i] = n // m
    else:
        sub = n // m
        for i in range(len(a)):
            a[i] = sub
        test = n - (sub * m)
        count = 0
        for i in range(test):
            a[count] += 1
            count += 1
            if count >= len(a):
                count = 0
    
    for i in range(len(a)-1, -1, -1):
        print(a[i], end=" ")

if __name__ == "__main__":
    main()

