
def read_input():
    H, W = map(int, input().split())
    return H, W

def read_grid(H, W):
    S = []
    for _ in range(H):
        text = input().strip()
        S.append(list(text))
    return S

def process_grid(H, W, S):
    for i in range(H):
        for j in range(W):
            if S[i][j] == '.':
                count = 0
                for a in range(-1, 2):
                    for b in range(-1, 2):
                        if 0 <= i + a < H and 0 <= j + b < W and S[i + a][j + b] == '#':
                            count += 1
                S[i][j] = str(count)
    return S

def print_grid(H, W, S):
    for i in range(H):
        for j in range(W):
            print(S[i][j], end='')
        print()

def main():
    H, W = read_input()
    S = read_grid(H, W)
    S = process_grid(H, W, S)
    print_grid(H, W, S)

if __name__ == "__main__":
    main()

