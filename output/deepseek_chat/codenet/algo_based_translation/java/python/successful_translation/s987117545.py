import sys

def main():
    data = sys.stdin.read().split()
    DEVISOR = 1000000007
    n = int(data[0])
    k = int(data[1])
    ans = 0
    i = k
    while i <= n + 1:
        max_val = i * (2 * n - i + 1) // 2
        min_val = i * (i - 1) // 2
        ans = (ans + (max_val - min_val + 1)) % DEVISOR
        i += 1
    print(ans % DEVISOR)

if __name__ == "__main__":
    main()
