
import sys

def main():
    n = int(sys.stdin.readline().strip())
    c = []
    s = []
    f = []

    for _ in range(n - 1):
        line = list(map(int, sys.stdin.readline().strip().split()))
        c.append(line[0])
        s.append(line[1])
        f.append(line[2])

    for i in range(n - 1):
        time = s[i] + c[i]
        for j in range(i + 1, n - 1):
            if time % f[j] != 0:
                time += f[j] - (time % f[j])
            if time < s[j]:
                time = s[j]
            time += c[j]
        print(time)
    print(0)

if __name__ == "__main__":
    main()

