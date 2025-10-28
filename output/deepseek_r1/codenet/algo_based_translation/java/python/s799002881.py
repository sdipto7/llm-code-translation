
import sys

def main():
    input = sys.stdin.read().split()
    ptr = 0
    n = int(input[ptr])
    ptr += 1
    d = float(int(input[ptr]))
    ptr += 1
    cnt = 0
    for _ in range(n):
        x = int(input[ptr])
        ptr += 1
        y = int(input[ptr])
        ptr += 1
        if (x ** 2 + y ** 2) ** 0.5 <= d:
            cnt += 1
    print(cnt)

if __name__ == "__main__":
    main()

