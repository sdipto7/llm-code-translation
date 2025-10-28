
import sys

def rec(x):
    answer = 0
    for k in range(31, -1, -1):
        if x & (1 << k):
            answer += 1
    return answer

def main():
    input = sys.stdin.read().split()
    ptr = 0
    n = int(input[ptr])
    ptr += 1
    a = [0] * 33
    for _ in range(n):
        x = int(input[ptr])
        ptr += 1
        cnt = rec(x)
        a[cnt] += 1
    total = 0
    for cnt in a:
        total += cnt * (cnt - 1) // 2
    print(total)

if __name__ == "__main__":
    main()

