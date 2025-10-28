
import sys

def main():
    data = sys.stdin.read().split()
    k = int(data[0])
    a = int(data[1])
    b = int(data[2])
    
    if b <= a + 2:
        print(1 + k)
        return
    
    x = k - (a - 1)
    ans = a + (x // 2) * (b - a) + (x % 2)
    print(ans)

if __name__ == "__main__":
    main()

