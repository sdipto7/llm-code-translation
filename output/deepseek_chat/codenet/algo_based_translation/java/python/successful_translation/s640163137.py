
import sys

def main():
    n = int(sys.stdin.readline().strip())
    a = [0] * n
    elements = sys.stdin.readline().split()
    
    for i in range(n):
        a[i] = int(elements[i])
    
    swapCount = 0
    
    for i in range(len(a)):
        mini = i
        
        for j in range(i, len(a)):
            if a[j] < a[mini]:
                mini = j
        
        if mini != i:
            v = a[mini]
            a[mini] = a[i]
            a[i] = v
            swapCount += 1
    
    ans = str(a[0])
    for i in range(1, len(a)):
        ans += " " + str(a[i])
    
    print(ans)
    print(swapCount)

if __name__ == "__main__":
    main()

