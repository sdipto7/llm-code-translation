
import sys

def main():
    data = list(map(int, sys.stdin.read().split()))
    ptr = 0
    x = data[ptr:ptr+3]
    ptr += 3
    k = data[ptr]
    ptr += 1
    
    a = []
    for i in range(3):
        count = x[i]
        elements = data[ptr:ptr+count]
        ptr += count
        elements.sort()
        a.append(elements)
    
    ans = []
    for i in range(x[0]):
        for j in range(x[1]):
            for m in range(x[2]):
                product = (i+1) * (j+1) * (m+1)
                if product <= k:
                    val = a[0][len(a[0])-i-1] + a[1][len(a[1])-j-1] + a[2][len(a[2])-m-1]
                    ans.append(val)
    
    ans.sort()
    n = len(ans)
    for i in range(k):
        if i >= n:
            break
        print(ans[n - i - 1])

if __name__ == "__main__":
    main()

