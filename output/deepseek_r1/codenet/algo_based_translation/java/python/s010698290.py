
import sys

def main():
    tokens = iter(sys.stdin.read().split())
    n = int(next(tokens))
    m = int(next(tokens))
    penal = [0] * (n + 1)
    solved = [False] * (n + 1)
    
    for _ in range(m):
        num = int(next(tokens))
        res = next(tokens)
        if res[0] == 'A':
            solved[num] = True
        else:
            if not solved[num]:
                penal[num] += 1
    
    correct_ans = 0
    num_penal = 0
    for i in range(1, n + 1):
        if solved[i]:
            correct_ans += 1
            num_penal += penal[i]
    
    print(f"{correct_ans} {num_penal}")

if __name__ == "__main__":
    main()

