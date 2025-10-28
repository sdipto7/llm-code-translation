
import sys

def main():
    h, w, k = map(int, sys.stdin.readline().split())
    color_mtr = [list(sys.stdin.readline().strip()) for _ in range(h)]
    
    h_pows = 1 << h
    w_pows = 1 << w
    ans = 0
    
    for h_pat in range(h_pows):
        for w_pat in range(w_pows):
            cnt = 0
            for i in range(h):
                if (h_pat >> i) & 1:
                    continue
                for j in range(w):
                    if (w_pat >> j) & 1:
                        continue
                    if color_mtr[i][j] == '#':
                        cnt += 1
            if cnt == k:
                ans += 1
                
    print(ans)

if __name__ == "__main__":
    main()

