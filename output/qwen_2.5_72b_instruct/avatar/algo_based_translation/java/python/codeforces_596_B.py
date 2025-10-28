
import sys

def main():
    import sys
    import sys
    scan = sys.stdin.read().split()
    n = int(scan[0])
    arr = list(map(int, scan[1:n+1]))
    answer = abs(arr[0])
    for i in range(1, n):
        answer += abs(arr[i] - arr[i - 1])
    print(answer)

if __name__ == "__main__":
    main()

