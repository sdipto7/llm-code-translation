
def main():
    N = int(input())
    K = int(input())
    A = [int(x) - 1 for x in input().split()]
    used = set()
    idx = [0] * N
    pos = [0] * N
    next_idx = 0
    cur = 0
    while next_idx not in used:
        used.add(next_idx)
        idx[next_idx] = cur
        pos[cur] = next_idx
        next_idx = A[next_idx]
        cur += 1
    a = cur - idx[next_idx]
    b = idx[next_idx]
    if b > K:
        ans = K
    else:
        ans = ((10000 * a + K - b) % a) + b
    print(pos[ans] + 1)

if __name__ == "__main__":
    main()

