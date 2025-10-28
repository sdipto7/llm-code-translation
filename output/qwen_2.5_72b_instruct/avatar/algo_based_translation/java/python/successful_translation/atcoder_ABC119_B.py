
import sys

def solve(x, u):
    total = 0.0
    for i in range(len(x)):
        if u[i] == "JPY":
            total += x[i] * 1
        else:
            total += x[i] * 380000
    return total

def main():
    import sys
    input = sys.stdin.read().split()
    N = int(input[0])
    x = [0.0] * N
    u = [None] * N
    index = 1
    for i in range(N):
        x[i] = float(input[index])
        u[i] = input[index + 1]
        index += 2
    result = solve(x, u)
    print(result)

if __name__ == "__main__":
    main()

