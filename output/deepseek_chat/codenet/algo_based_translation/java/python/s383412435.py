
import sys

def main():
    data = sys.stdin.read().split()
    if not data:
        return
    
    N = int(data[0])
    a = []
    index = 1
    for z in range(N):
        a.append(int(data[index]))
        index += 1
        
    a.sort()
    ans = 0
    
    if N == 1 and a[0] > 1:
        ans = 1
    else:
        j = 0
        while j < N:
            if j == 0 or a[j] != a[j - 1]:
                tmp = 1
                i = j + 1
                while i < N:
                    if a[j] == a[i]:
                        tmp += 1
                        i += 1
                    else:
                        break
                if tmp > a[j]:
                    ans += tmp - a[j]
                elif tmp < a[j]:
                    ans += tmp
            j += 1
            
    print(ans)

if __name__ == "__main__":
    main()

