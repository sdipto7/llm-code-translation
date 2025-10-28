
def main():
    H, W = map(int, input().split())
    input_line = input()
    S = [['' for _ in range(W)] for _ in range(H)]
    
    for i in range(H):
        text = input().strip()
        for j in range(W):
            S[i][j] = text[j]
    
    for i in range(H):
        for j in range(W):
            if S[i][j] == '.':
                count = 0
                for a in range(-1, 2):
                    if i + a < 0 or i + a >= H:
                        continue
                    for b in range(-1, 2):
                        if j + b < 0 or j + b >= W:
                            continue
                        if S[i + a][j + b] == '#':
                            count += 1
                S[i][j] = str(count)
            print(S[i][j], end='')
        print()

if __name__ == "__main__":
    main()

