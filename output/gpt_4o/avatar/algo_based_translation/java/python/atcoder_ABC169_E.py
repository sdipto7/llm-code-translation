
import sys

def main():
    input = sys.stdin.read
    data = input().splitlines()
    
    n = int(data[0])
    ai = []
    bi = []
    
    for i in range(1, n + 1):
        a, b = map(int, data[i].split())
        ai.append(a)
        bi.append(b)
    
    ai.sort()
    bi.sort()
    
    if n % 2 == 1:
        result = bi[n // 2] - ai[n // 2] + 1
    else:
        b = (ai[n // 2] + ai[n // 2 - 1]) / 2
        c = (bi[n // 2] + bi[n // 2 - 1]) / 2
        result = int(2 * (c - b) + 1)
    
    print(result)

if __name__ == '__main__':
    main()

