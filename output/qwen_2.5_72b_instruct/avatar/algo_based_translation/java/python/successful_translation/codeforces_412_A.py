
import sys

def main():
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    from sys import stdin

    input = stdin.read().split()
    n = int(input[0])
    k = int(input[1])
    a = input[2]

    if k > n // 2:
        while k < n:
            print("RIGHT")
            k += 1
    else:
        while k > 1:
            print("LEFT")
            k -= 1

    if k == 1:
        for i in range(len(a)):
            print(f"PRINT {a[i]}")
            if i + 1 < len(a):
                print("RIGHT")
    else:
        for i in range(len(a) - 1, -1, -1):
            print(f"PRINT {a[i]}")
            if i - 1 >= 0:
                print("LEFT")

if __name__ == "__main__":
    main()

