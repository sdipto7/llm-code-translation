
import sys

def main():
    n = int(sys.stdin.readline())
    ans = list(map(int, sys.stdin.readline().split()))[:n]
    ans.sort()
    count = ans[-1]
    for i in range(len(ans)-2, -1, -1):
        if ans[i] < ans[i+1]:
            count += ans[i]
        else:
            while ans[i] >= ans[i+1]:
                ans[i] -= 1
            if ans[i] > 0:
                count += ans[i]
    print(count)

if __name__ == "__main__":
    main()

