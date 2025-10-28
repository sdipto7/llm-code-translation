
import sys

def main():
    input = sys.stdin.read
    data = input().split()

    h = int(data[0])
    w = int(data[1])
    ans = []

    for i in range(h):
        ans.append('#' + data[i + 2] + '#')

    print('#' * (w + 2))
    
    for s in ans:
        print(s)
        
    print('#' * (w + 2))

if __name__ == "__main__":
    main()

