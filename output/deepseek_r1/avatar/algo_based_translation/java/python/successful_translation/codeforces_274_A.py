
import sys

def main():
    data = list(map(int, sys.stdin.read().split()))
    ptr = 0
    n = data[ptr]
    ptr += 1
    k = data[ptr]
    ptr += 1
    arr = data[ptr:ptr + n]
    arr.sort()
    s = set()
    count = 0
    for num in arr:
        if num % k != 0:
            count += 1
            s.add(num)
        else:
            divisor = num // k
            if divisor not in s:
                count += 1
                s.add(num)
    print(count)

if __name__ == "__main__":
    main()

