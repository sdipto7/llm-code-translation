
import sys

def main():
    input = sys.stdin.read().split()
    ptr = 0
    N = int(input[ptr])
    ptr += 1
    x = int(input[ptr])
    ptr += 1
    sweet = []
    for _ in range(N):
        sweet.append(int(input[ptr]))
        ptr += 1
    sweet.sort()
    num = 0
    for _ in range(N):
        if x >= sweet[num]:
            x -= sweet[num]
            num += 1
        else:
            break
    if num == N and x > 0:
        num -= 1
    print(num)

if __name__ == "__main__":
    main()

