
def main():
    import sys
    input = sys.stdin.read
    data = input().splitlines()
    
    H = int(data[0].split()[0])
    W = int(data[0].split()[1])
    
    S = [list(data[i + 1]) for i in range(H)]
    
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
                S[i][j] = chr(count + 48)
            print(S[i][j], end='')
        print()

if __name__ == "__main__":
    main()

