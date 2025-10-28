
import sys

def main():
    N, M = map(int, sys.stdin.readline().split())
    H = list(map(int, sys.stdin.readline().split()))
    ans = [True] * N
    
    for _ in range(M):
        temp1, temp2 = map(int, sys.stdin.readline().split())
        if H[temp1 - 1] < H[temp2 - 1]:
            ans[temp1 - 1] = False
        elif H[temp1 - 1] > H[temp2 - 1]:
            ans[temp2 - 1] = False
        else:
            ans[temp1 - 1] = False
            ans[temp2 - 1] = False
    
    print(sum(ans))

if __name__ == "__main__":
    main()

