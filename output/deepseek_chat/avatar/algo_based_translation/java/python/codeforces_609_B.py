
import sys

def main():
    data = sys.stdin.read().split()
    n = int(data[0])
    m = int(data[1])
    arr = [0] * n
    gen = [0] * 11
    
    index = 2
    for i in range(n):
        arr[i] = int(data[index])
        gen[arr[i]] += 1
        index += 1
        
    ans = 0
    for i in range(1, m + 1):
        for k in range(1, m + 1):
            if i != k:
                ans += gen[i] * gen[k]
                
    print(ans // 2)

if __name__ == "__main__":
    main()

