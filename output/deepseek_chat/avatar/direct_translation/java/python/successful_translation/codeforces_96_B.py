
import sys

def main():
    number = int(sys.stdin.readline())
    ans, value, mask = -1, 0, 2
    while value < number:
        s = bin(mask)[3:]
        mask += 1
        zeros = s.count('0')
        if zeros != len(s) - zeros:
            continue
        s = s.replace('0', '4')
        s = s.replace('1', '7')
        value = int(s)
    print(value)

if __name__ == "__main__":
    main()

