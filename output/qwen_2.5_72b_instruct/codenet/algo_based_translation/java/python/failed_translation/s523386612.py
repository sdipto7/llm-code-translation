import sys

def main():
    import sys
    from collections import defaultdict

    t = int(sys.stdin.readline().strip())
    count = [0] * (t + 1)

    for _ in range(1, t):
        index = int(sys.stdin.readline().strip())
        count[index] += 1

    for i in range(1, t + 1):
        print(count[i])

if __name__ == "__main__":
    main()
