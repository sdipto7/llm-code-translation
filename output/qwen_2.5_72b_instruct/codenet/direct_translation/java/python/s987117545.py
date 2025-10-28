import sys

sc = sys.stdin
DEVISOR = 1000000000 + 7

def run():
    n = int(sc.readline())
    k = int(sc.readline())

    ans = 0
    for i in range(k, n + 2):
        max_val = i * (2 * n - i + 1) // 2
        min_val = i * (i - 1) // 2
        ans += (max_val - min_val + 1) % DEVISOR
    print(ans % DEVISOR)

run()
