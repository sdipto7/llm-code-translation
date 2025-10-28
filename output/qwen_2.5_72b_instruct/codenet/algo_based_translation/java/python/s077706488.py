import sys

def main():
    import sys
    from typing import List

    input = sys.stdin.read().split()
    N = int(input[0])
    X = int(input[1])
    m = [0] * N
    m[0] = int(input[2])
    X -= m[0]
    min_value = m[0]

    for i in range(1, N):
        m[i] = int(input[2 + i])
        X -= m[i]
        if m[i] < min_value:
            min_value = m[i]

    print(N + X // min_value)

if __name__ == "__main__":
    main()
