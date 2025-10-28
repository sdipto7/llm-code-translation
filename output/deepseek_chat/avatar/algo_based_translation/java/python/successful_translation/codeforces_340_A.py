
import sys

def main():
    data = sys.stdin.read().split()
    x = int(data[0])
    y = int(data[1])
    a = int(data[2])
    b = int(data[3])
    j = 2
    c = max(x, y)
    ans = True
    if c > b:
        print("0")
        ans = False
    while ans and c % min(x, y) != 0:
        if x > y:
            c = x * j
            j += 1
        else:
            c = y * j
            j += 1
        if c > b:
            print("0")
            ans = False
            break
    if ans:
        found = None
        for i in range(a, b + 1):
            if i % c == 0:
                found = i
                break
        if found is not None:
            result = ((b - found) // c) + 1
            print(result)
        else:
            print("0")

if __name__ == "__main__":
    main()

