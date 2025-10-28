
import sys

def main():
    data = list(map(int, sys.stdin.read().split()))
    n = data[0]
    elements = data[1:n+1]
    
    frequency = [0] * 1001
    for num in elements:
        frequency[num] += 1
    
    count_max = -1
    for i in range(1, 1001):
        if frequency[i] > count_max:
            count_max = frequency[i]
    
    if n % 2 == 0:
        if count_max <= n // 2:
            print("YES")
        else:
            print("NO")
    else:
        if count_max <= (n // 2) + 1:
            print("YES")
        else:
            print("NO")

if __name__ == "__main__":
    main()

