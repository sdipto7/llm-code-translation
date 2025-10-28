
import sys

def main():
    data = sys.stdin.read().split()
    n = int(data[0])
    result = 0
    h = [0] * n
    g = [0] * n
    index = 1
    for i in range(n):
        h[i] = int(data[index])
        g[i] = int(data[index + 1])
        index += 2
    for i in range(n):
        for j in range(n):
            if h[i] == g[j]:
                result += 1
    print(result)

if __name__ == "__main__":
    main()

