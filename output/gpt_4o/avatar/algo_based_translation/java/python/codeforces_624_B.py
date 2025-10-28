
import sys

def main():
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    ans = list(map(int, data[1:n+1]))
    
    ans.sort()
    
    count = ans[-1]
    
    for i in range(n-2, -1, -1):
        if ans[i] < ans[i + 1]:
            count += ans[i]
        else:
            while ans[i] >= ans[i + 1] and ans[i] > 0:
                ans[i] -= 1
            if ans[i] > 0:
                count += ans[i]
    
    print(count)

if __name__ == "__main__":
    main()

