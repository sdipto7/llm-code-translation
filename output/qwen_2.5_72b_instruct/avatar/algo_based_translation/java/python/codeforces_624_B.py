
import sys

def main():
    import sys
    from bisect import insort
    input = sys.stdin.read().split()
    
    n = int(input[0])
    ans = list(map(int, input[1:n+1]))
    
    ans.sort()
    
    count = ans[-1]
    
    for i in range(n-2, -1, -1):
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

