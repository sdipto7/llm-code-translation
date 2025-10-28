
import sys

def main():
    import sys
    import sys
    from sys import stdin

    input = stdin.read().splitlines()
    index = 0

    H = int(input[index])
    W = int(input[index + 1])
    index += 2

    S = [['' for _ in range(W)] for _ in range(H)]
    for i in range(H):
        text = input[index]
        index += 1
        for j in range(W):
            S[i][j] = text[j]

    for i in range(H):
        for j in range(W):
            if S[i][j] == '.':
                count = 0
                for a in range(-1, 2):
                    if i + a < 0 or H <= i + a:
                        continue
                    for b in range(-1, 2):
                        if j + b < 0 or W <= j + b:
                            continue
                        if S[i + a][j + b] == '#':
                            count += 1
                S[i][j] = str(count)

            print(S[i][j], end='')
        print()

if __name__ == "__main__":
    main()

