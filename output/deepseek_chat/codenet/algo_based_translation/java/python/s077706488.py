import sys

def main():
    data = sys.stdin.read().split()
    N = int(data[0])
    X = int(data[1])
    m = [0] * N
    m[0] = int(data[2])
    X -= m[0]
    min_val = m[0]
    index = 3
    for i in range(1, N):
        m[i] = int(data[index])
        index += 1
        X -= m[i]
        if m[i] < min_val:
            min_val = m[i]
    print(N + X // min_val)

if __name__ == "__main__":
    main()
