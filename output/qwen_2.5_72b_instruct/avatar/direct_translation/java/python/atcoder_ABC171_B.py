
import sys

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    n = int(data[0])
    k = int(data[1])
    a = list(map(int, data[2:]))
    a.sort()
    ans = sum(a[:k])
    print(ans)

if __name__ == "__main__":
    main()

