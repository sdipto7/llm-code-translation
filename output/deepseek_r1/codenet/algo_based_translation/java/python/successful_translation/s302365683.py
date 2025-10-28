
import sys

def main():
    line = sys.stdin.readline().split()
    n = int(line[0])
    line = sys.stdin.readline().split()
    nums = list(map(int, line[:n]))
    
    freq = {}
    for num in nums:
        freq[num] = freq.get(num, 0) + 1
    
    ans = 0
    for val in freq:
        cnt = freq[val]
        if cnt > val:
            ans += cnt - val
        elif cnt < val:
            ans += cnt
    print(ans)

if __name__ == "__main__":
    main()

