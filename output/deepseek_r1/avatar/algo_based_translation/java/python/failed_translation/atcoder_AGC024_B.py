
import sys

def main():
    n = int(sys.stdin.readline())
    p = list(map(int, sys.stdin.readline().split()))
    p = [x - 1 for x in p]
    pos_map = {num: idx for idx, num in enumerate(p)}
    nglist = []
    for i in range(n - 1):
        if pos_map[i] > pos_map[i + 1]:
            nglist.append(i)
    if not nglist:
        print(0)
        return
    ans = min(n - nglist[0] - 1, nglist[-1] + 1)
    for i in range(len(nglist) - 1):
        current = nglist[i] + 1 + (n - nglist[i + 1] - 1)
        if current < ans:
            ans = current
    print(ans)

if __name__ == "__main__":
    main()

