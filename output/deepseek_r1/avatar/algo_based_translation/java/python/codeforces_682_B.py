
import sys

def main():
    data = list(map(int, sys.stdin.read().split()))
    n = data[0]
    nums = data[1:n+1]
    nums.sort()
    c = 1
    for num in nums:
        if num >= c:
            c += 1
    print(c)

if __name__ == "__main__":
    main()

