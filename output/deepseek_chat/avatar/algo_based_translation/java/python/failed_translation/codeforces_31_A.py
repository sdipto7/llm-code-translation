
import sys

def main():
    sc = sys.stdin
    n = int(sc.readline().strip())
    f = 0
    a = list(map(int, sc.readline().split()))
    k, j, i = 0, 0, 0
    
    for k_val in range(n):
        t = a[k_val]
        found = False
        for i_val in range(n):
            for j_val in range(n - 1):
                if i_val != j_val and t == (a[i_val] + a[j_val]):
                    f = 1
                    i = i_val
                    j = j_val
                    k = k_val
                    found = True
                    break
            if found:
                break
        if found:
            break
    
    if f == 1:
        print(f"{k + 1} {j + 1} {i + 1}")
    else:
        print("-1")

if __name__ == "__main__":
    main()

