
import sys

def main():
    data = sys.stdin.read().split()
    a = int(data[0])
    b = int(data[1])
    sum_val = 0
    for i in range(2):
        if a >= b:
            sum_val += a
            a -= 1
        else:
            sum_val += b
            b -= 1
    print(sum_val)

if __name__ == "__main__":
    main()

