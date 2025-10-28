
import sys

def main():
    n = int(sys.stdin.readline().strip())
    ai = []
    bi = []
    for _ in range(n):
        data = sys.stdin.readline().split()
        ai.append(int(data[0]))
        bi.append(int(data[1]))
    
    ai.sort()
    bi.sort()
    
    if n % 2 == 1:
        median_ai = ai[len(ai) // 2]
        median_bi = bi[len(bi) // 2]
        print(median_bi - median_ai + 1)
    else:
        median_ai = (ai[len(ai) // 2 - 1] + ai[len(ai) // 2]) / 2.0
        median_bi = (bi[len(bi) // 2 - 1] + bi[len(bi) // 2]) / 2.0
        result = int(2 * (median_bi - median_ai) + 1)
        print(result)

if __name__ == "__main__":
    main()

