
import sys

def main():
    t = int(sys.stdin.readline())
    count = [0] * (t + 1)
    for _ in range(t - 1):
        num = int(sys.stdin.readline())
        count[num] += 1
    for i in range(1, t + 1):
        print(count[i])

if __name__ == "__main__":
    main()

