import sys

def main():
    input = sys.stdin.read().split()
    S = input[0]
    score = 0
    for i in range(len(S)):
        my = 'g' if i % 2 == 0 else 'p'
        his = S[i]
        if my != his:
            score += 1 if my == 'p' else -1
    print(score)

if __name__ == "__main__":
    main()
