
import sys

def main():
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    a = []
    
    for i in range(1, n + 1):
        value = int(data[i])
        a.append(value)
    
    a = sorted(set(a))
    
    found = False
    
    for i in range(len(a)):
        if i + 1 < len(a) and i + 2 < len(a):
            if a[i] + 1 == a[i + 1] and a[i + 1] + 1 == a[i + 2]:
                found = True
    
    print("YES" if found else "NO")

if __name__ == "__main__":
    main()

