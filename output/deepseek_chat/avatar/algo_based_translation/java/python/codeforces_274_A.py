
import sys

def main():
    data = sys.stdin.read().split()
    n = int(data[0])
    k = int(data[1])
    arr = []
    index = 2
    for i in range(n):
        arr.append(int(data[index]))
        index += 1
    set_vals = set()
    arr.sort()
    count = 0
    for num in arr:
        if num % k != 0:
            count += 1
            set_vals.add(num)
        elif num // k not in set_vals:
            count += 1
            set_vals.add(num)
    print(count)

if __name__ == "__main__":
    main()

