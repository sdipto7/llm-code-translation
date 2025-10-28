
import sys

def main():
    n = int(sys.stdin.readline().strip())
    arr = [0] * n
    for i in range(n):
        arr[i] = int(sys.stdin.readline().strip())
    
    answer = abs(arr[0])
    for i in range(1, n):
        answer += abs(arr[i] - arr[i - 1])
    
    print(answer)

if __name__ == "__main__":
    main()

