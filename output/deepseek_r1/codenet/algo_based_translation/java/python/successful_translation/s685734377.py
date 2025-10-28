
import sys

def main():
    n = int(sys.stdin.readline())
    a = [list(sys.stdin.readline().strip()) for _ in range(n)]
    
    P = 37
    powP = [1] * (n + 1)
    for i in range(1, n + 1):
        powP[i] = powP[i - 1] * P
    
    hashRow = [[0]*n for _ in range(n)]
    hashCol = [[0]*n for _ in range(n)]
    
    for i in range(n):
        for j in range(n):
            char_val = ord(a[i][j])
            for k in range(n):
                shift_row = (j - k + n) % n
                hashRow[i][k] += char_val * powP[shift_row]
                
                shift_col = (i - k + n) % n
                hashCol[j][k] += char_val * powP[shift_col]
    
    ans = 0
    for A in range(n):
        for B in range(n):
            valid = True
            for i in range(n):
                row_idx = (i + A) % n
                col_idx = (i + B) % n
                if hashRow[row_idx][B] != hashCol[col_idx][A]:
                    valid = False
                    break
            if valid:
                ans += 1
    print(ans)

if __name__ == "__main__":
    main()

